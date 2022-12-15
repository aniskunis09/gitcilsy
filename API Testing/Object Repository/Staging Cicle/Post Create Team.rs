<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Post Create Team</name>
   <tag></tag>
   <elementGuidId>eb82f73c-1cbb-4f2b-bd39-7cb0d923401d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzNDZiZmNkNTc1NzdhMWM5NDhhODQ0ZCIsImdvb2dsZUlkIjoiMTE4MDUyMDE4MjE1Nzk2MDAzMTYzIiwiZW1haWwiOiJhbmlzYXR1bi5uYWZpYWgwOUBnbWFpbC5jb20iLCJmdWxsTmFtZSI6IkFuaXNhdHVuIE5hZmknYWgiLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FMbTV3dTI0MDIzTlNReERteGhSTTFtMEN0d3hNVm12SFplM1Qyc3lFMDV6PXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxMzoyMzoyNS40NzBaIiwidXBkYXRlZEF0IjoiMjAyMi0xMS0xOFQxNDo0MToxMy4yNDlaIiwiX192IjowLCJkZWZhdWx0Q29tcGFueSI6eyJfaWQiOiI2Mzc3OTk4OGIyNGFhYzVjOTczYTBkN2YifX0sImlhdCI6MTY2ODc4MjcxOCwiZXhwIjoxNjcxMzc0NzE4fQ.IQTIDwepYW9Vj12cQ7jpsri_xTIfBZDoFLZAAI5XDDg</value>
      <webElementGuid>8dc99b15-c7fc-45be-b471-542f0dee3afc</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseURLCicle}/api/v1/teams?companyId=63779988b24aac5c973a0d7f</restUrl>
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
