import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response1 = WS.sendRequest(findTestObject('Reqres/Get All User Data'))

WS.verifyResponseStatusCode(response1, 200)

WS.verifyElementPropertyValue(response1, 'data.id', 1)

WS.verifyElementPropertyValue(response1, 'data.email', 'george.bluth@reqres.in')

WS.verifyElementPropertyValue(response1, 'data.first_name', 'George')

WS.verifyElementPropertyValue(response1, 'data.last_name', 'Bluth')

WS.verifyElementPropertyValue(response1, 'support.url', 'https://reqres.in/#support-heading')

WS.verifyElementPropertyValue(response1, 'support.text', 'To keep ReqRes free, contributions towards server costs are appreciated!')

WS.verifyElementsCount(response1, 'data', 5)

WS.verifyElementsCount(response1, 'support', 2)

WS.containsString(response1, 'George', false)

