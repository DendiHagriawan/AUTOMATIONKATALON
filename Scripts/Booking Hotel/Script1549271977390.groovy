import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Tiket Pesawat  Hotel Murah - T/a_Login (2)'))

WebUI.setText(findTestObject('Page_tiket.com  Hotel Pesawat Keret/input_atau_email'), findTestData('Datapool test').getValue(
        findTestData('Datapool test'), findTestData('Datapool test')))

WebUI.setEncryptedText(findTestObject('Page_tiket.com  Hotel Pesawat Keret/input_Alamat Email_password'), findTestData('Datapool test').getValue(
        findTestData('Datapool test'), findTestData('Datapool test')))

WebUI.click(findTestObject('Page_tiket.com  Hotel Pesawat Keret/button_Log In'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Tiket Pesawat  Hotel Murah - T/span_Dendi'), 'Dendi')

WebUI.click(findTestObject('Page_Tiket Pesawat  Hotel Murah - T/span_Dendi', [('variable') : '']), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Tiket Pesawat  Hotel Murah - T/span_Keluar'))

//WebUI.closeBrowser()

