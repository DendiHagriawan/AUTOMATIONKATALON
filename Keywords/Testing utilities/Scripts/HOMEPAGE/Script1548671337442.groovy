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

WebUI.click(findTestObject('Object Repository/Hotel/Page_Tiket Pesawat  Hotel Murah - T/a_Hotel'))

WebUI.setText(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/input_Tujuan_select-box-input'), 
    'The Sunset Hotel and Restaurant')

not_run: WebUI.click(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/div_Pilih Kota Tujuan atau Nam'))

WebUI.click(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/div_The Sunset Hotel and Resta'))

WebUI.click(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/button_Cari Hotel'))

WebUI.setText(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/input_Check-in_depart inputPik'), 
    '2019-02-07')

WebUI.setText(findTestObject('Object Repository/Hotel/Page_Booking Hotel Murah Harga Prom/input_Check-out_return inputPi'), 
    '2019-02-08')

WebUI.closeBrowser()

