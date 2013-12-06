package com.maytaste.eduame.utils;

import java.net.URLEncoder;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DESUtils {
   
   
    public static String encrypt(Key key,String content) {  
       byte [] byteMi = null ;  
       byte [] byteMing = null ;  
       String strMi = "" ;  
       BASE64Encoder base64en = new BASE64Encoder();  
       try {  
           byteMing = content.getBytes("utf-8");  
           byteMi = DESUtils.encryptByte(key,byteMing);  
           strMi = base64en.encode(byteMi);  
       } catch (Exception e) {  
           throw new RuntimeException(  
                  "Error initializing SqlMap class. Cause: " + e);  
       } finally {  
           base64en = null ;  
           byteMing = null ;  
           byteMi = null ;  
       }  
       return strMi;  
    }  
   
    /** 
      * 解密 以 String 密文输入 ,String 明文输出 
      * 
      * @param strMi 
      * @return 
      */  
    public static String decrypt(Key key,String content) {  
    	
       BASE64Decoder base64De = new BASE64Decoder();  
       byte [] byteMing = null ;  
       byte [] byteMi = null ;  
       String strMing = "" ;  
       try {  
           byteMi = base64De.decodeBuffer(content);  
           byteMing = DESUtils.decryptByte(key,byteMi);  
           strMing = new String(byteMing, "utf-8" );  
       } catch (Exception e) {  
           throw new RuntimeException(e);  
       } finally {  
           base64De = null ;  
           byteMing = null ;  
           byteMi = null ;  
       }  
       return strMing;  
    }  
   
    private static byte [] encryptByte(Key key,byte [] byteS) {  
		         
       byte [] byteFina = null ;  
       Cipher cipher;  
       try {  
    	   
           cipher = Cipher.getInstance ( "DES" );  
           cipher.init(Cipher. ENCRYPT_MODE , key );  
           byteFina = cipher.doFinal(byteS);  
       } catch (Exception e) {  
           throw new RuntimeException( e);  
       } finally {  
           cipher = null ;  
       }  
       return byteFina;  
    
    }  
    
    public static Key generateKey(String key){
    	  KeyGenerator _generator;
 		try {
			_generator = KeyGenerator.getInstance ( "DES" );
	 		 _generator.init( new SecureRandom(key.getBytes()));
	  	    return _generator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
    }
   
    private static byte [] decryptByte(Key key, byte [] byteD) {  
    	
       Cipher cipher;  
       byte [] byteFina = null ;  
       try {  
    	   
           cipher = Cipher.getInstance ( "DES" );  
           cipher.init(Cipher. DECRYPT_MODE , key );  
           byteFina = cipher.doFinal(byteD);  
           
       } catch (Exception e) {  
           throw new RuntimeException(e);  
       } finally {  
           cipher = null ;  
       }  
       return byteFina;  
    }  
   
   
    public static void main(String[] args) throws Exception {  
    	String keyStr=new Date().getTime()+"";
    	
    	Key key=DESUtils.generateKey(keyStr);
   	     
       String str1 = "要加密的字符串等等等等等等等等等等等等大大的test" ;  
       System. out .println( " 加密前： " + str1);  
       String str2 = DESUtils.encrypt(key,str1);  
       System. out .println( " 加密后： " + URLEncoder.encode(str2,"utf-8"));  
       String deStr = DESUtils.decrypt(key,str2);  
       System. out .println( " 解密后： " + deStr);  
    }  
}
