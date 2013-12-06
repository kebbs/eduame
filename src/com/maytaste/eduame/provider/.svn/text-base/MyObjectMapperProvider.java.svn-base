package com.maytaste.eduame.provider;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.springframework.stereotype.Component;

/**
 * 替换掉默认的ObjectMapper,添加参数Inclusion.NON_NULL,
 * 让实体类转json的是不包含空属性
 * @author bac
 *
 */
@Provider
@Component
public class MyObjectMapperProvider implements ContextResolver<ObjectMapper> {

	private ObjectMapper objectMapper=new ObjectMapper();
	
	public MyObjectMapperProvider() {
		
		objectMapper.setSerializationInclusion(Inclusion.NON_NULL);
	}
	
	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		return objectMapper;
	}
}
