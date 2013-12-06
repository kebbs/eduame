package com.maytaste.eduame.test;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class XMLDBTest {
	public static void main(String[] args) {
		Connection conn=getConnection();
		
		try {
			java.sql.PreparedStatement ps=conn.prepareStatement("insert into xtable values(xmltype(?))");
			ps.setClob(1, new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ClinicalDocument xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\" xsi:schemaLocation=\"urn:hl7-org:v3 CDA.xsd\">  <realmCode code=\"CN\"/>  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_HD000040\"/>  <id root=\"2.16.840.1.113883.4.487.1.4.1\" extension=\"-Report-20121212085442742132\" assigningAuthorityName=\"苏州市立医院本部\"/>  <code code=\"47045-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Study report\"/>  <title>高宝妹颈椎正侧位片</title>  <effectiveTime value=\"2012-06-14 10:48:56\"/>  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\"/>  <languageCode code=\"zh_cn\"/>  <recordTarget>    <patientRole>      <id root=\"2.16.840.1.113883.4.487.1.4.1\" extension=\"XR26690\" assigningAuthorityName=\"苏州市立医院本部\" displayName=\"RANO\"/>      <addr/>      <addr/>      <addr/>      <patient>        <name>高宝妹</name>        <administrativeGenderCode code=\"F\" codeSystem=\"2.16.840.1.113883.5.1\" codeSystemName=\"Administrative Gender\"/>        <birthTime value=\"1951-06-14\"/>      </patient>    </patientRole>  </recordTarget>  <author>    <time value=\"2012-06-14 10:48:56\"/>    <assignedAuthor>      <id root=\"2.16.840.1.113883.4.487.1.4.1\" extension=\"A520\" assigningAuthorityName=\"SZSLYYBB-FSK\"/>      <assignedPerson>        <name>杨文雅</name>      </assignedPerson>      <representedOrganization>        <id root=\"2.16.840.1.113883.4.487.1.4.1\"/>      </representedOrganization>    </assignedAuthor>  </author>  <author>    <time value=\"20121212085442\"/>    <assignedAuthor>      <id root=\"2.16.840.1.113883.4.487\" extension=\"Shanghai Atlas TIger Medical Information System Co.,ltd.\"/>      <assignedAuthoringDevice>        <softwareName>AT HiUP CDAGATE V1.0</softwareName>      </assignedAuthoringDevice>    </assignedAuthor>  </author>  <custodian>    <assignedCustodian>      <representedCustodianOrganization>        <id root=\"2.16.840.1.113883.4.487.1.4.1\"/>        <name>苏州市立医院本部</name>      </representedCustodianOrganization>    </assignedCustodian>  </custodian>  <component>    <structuredBody>      <component>        <section>          <templateId root=\"2.16.840.1.113883.10.20.1.14\"/>          <code code=\"30954-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Results\"/>          <title>诊断结果</title>          <text>影像所见检查诊断</text>          <entry>            <organizer>              <component>                <observation>                  <code code=\"ICD9\\ICD10待填\" codeSystem=\"诊断编码域待填\"/>                  <text>影像所见检查诊断</text>                  <effectiveTime>                    <low value=\"2012-06-14 10:48:56\"/>                  </effectiveTime>                </observation>              </component>            </organizer>          </entry>        </section>      </component>      <component>        <section>          <code code=\"121181\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"DICOM Object Catalog\"/>          <entry>            <act>              <code code=\"113014\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Study\">                <qualifier>                  <name code=\"00080050\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Accession Number\"/>                  <value code=\"894392\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\"/>                </qualifier>                <qualifier>                  <name code=\"00080020\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Study Date\"/>                  <value code=\"06/14/2012\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\"/>                </qualifier>                <qualifier>                  <name code=\"00080030\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Study Time\"/>                  <value code=\"10:37:01\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\"/>                </qualifier>              </code>              <entryRelationship>                <act>                  <code code=\"113015\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Series\">                    <qualifier>                      <name code=\"00080060\" codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\" displayName=\"Modality\"/>                      <value codeSystem=\"1.2.840.10008.2.16.4\" codeSystemName=\"DCM\"/>                    </qualifier>                  </code>                  <entryRelationship>                    <observation>                      <code code=\"1.2.840.10008.5.1.4.1.1.1\" codeSystem=\"1.2.840.10008.2.6.1\" codeSystemName=\"DCMUID\" displayName=\"Computed Radiography Image Storage\"/>                      <text mediaType=\"image/jpeg\"/>                    </observation>                  </entryRelationship>                </act>              </entryRelationship>            </act>          </entry>        </section>      </component>      <component>        <section>          <code code=\"19146-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Reference lab test results\"/>          <title>检查诊断</title>          <text>颈椎病。&#xD;</text>        </section>      </component>      <component>        <section>          <code code=\"19146-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Reference lab test results\"/>          <title>影像所见</title>          <text>颈椎生理曲度存在，椎体序列正常，未见侧弯及滑脱。颈椎旁软组织未见异常，项韧带未见钙化。颈椎L5－L7椎体前缘骨质增生，椎体钩突略变尖，L5、L6、L7椎间隙狭窄，各椎体附件未见异常。</text>        </section>      </component>    </structuredBody>  </component></ClinicalDocument>"));
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static Connection getConnection(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			return DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:orcl","bac","backav");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
