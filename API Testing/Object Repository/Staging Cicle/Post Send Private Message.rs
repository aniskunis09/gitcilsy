<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Post Send Private Message</name>
   <tag></tag>
   <elementGuidId>9b969ac4-01db-4829-b7aa-46845bb31ae0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;content\&quot;: \&quot;\u003cp\u003etes message lagi\u003c/p\u003e\&quot;,\n    \&quot;mentionedUsers\&quot;: []\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>49cc32da-60db-4c47-8ae1-454bfe9e9001</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzNDZiZmNkNTc1NzdhMWM5NDhhODQ0ZCIsImdvb2dsZUlkIjoiMTE4MDUyMDE4MjE1Nzk2MDAzMTYzIiwiZW1haWwiOiJhbmlzYXR1bi5uYWZpYWgwOUBnbWFpbC5jb20iLCJmdWxsTmFtZSI6IkFuaXNhdHVuIE5hZmknYWgiLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FMbTV3dTI0MDIzTlNReERteGhSTTFtMEN0d3hNVm12SFplM1Qyc3lFMDV6PXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxMzoyMzoyNS40NzBaIiwidXBkYXRlZEF0IjoiMjAyMi0xMS0xOFQxNDo0MToxMy4yNDlaIiwiX192IjowLCJkZWZhdWx0Q29tcGFueSI6eyJfaWQiOiI2Mzc3OTk4OGIyNGFhYzVjOTczYTBkN2YifX0sImlhdCI6MTY2OTI2NTYyMCwiZXhwIjoxNjcxODU3NjIwfQ.pY04yYUJ69ndk8bUmJvoCHlyRfSMCqu6r8vIA2zrqj0</value>
      <webElementGuid>ba0dd2c4-be38-4503-98e0-98bd5dfae4f2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseURLCicle}/api/v1/chats/637ef90db24aac5c97873d20/messages?companyId=61eba2c85080f47b25ddc8f8</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
