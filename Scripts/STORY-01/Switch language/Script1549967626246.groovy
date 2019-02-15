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

WebUI.click(findTestObject('Object Repository/Switch language/Page_Tiket Pesawat  Hotel Murah - T/p_Entertainment'))

WebUI.verifyElementText(findTestObject('Object Repository/Switch language/Page_Tiket Konser Atraksi Hiburan d/div_Pengalaman tak terlupakan'), 
    'Pengalaman tak terlupakan dimulai dari sini')

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Switch language/Page_Tiket Konser Atraksi Hiburan d/i_ID'), 'ID')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Switch language/Page_Tiket Konser Atraksi Hiburan d/i_ID'))

WebUI.click(findTestObject('Object Repository/Switch language/Page_Tiket Konser Atraksi Hiburan d/button_English (United States)'))

WebUI.verifyElementText(findTestObject('Object Repository/Switch language/Page_Cheap Event Attractions Concer/div_Your unforgettable experie'), 
    'Your unforgettable experience starts here')

WebUI.takeScreenshot()

WebUI.closeBrowser()

