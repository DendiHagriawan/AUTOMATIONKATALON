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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/a_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Login - Logout/Page_tiket.com  Hotel Pesawat Keret/h2_Log In ke tiket.com'), 
    'Log In ke tiket.com')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Login - Logout/Page_tiket.com  Hotel Pesawat Keret/input_atau_email'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login - Logout/Page_tiket.com  Hotel Pesawat Keret/input_Alamat Email_password'), 
    'f8SxZYSd1bTfva3m5MxGsw==')

WebUI.click(findTestObject('Object Repository/Login - Logout/Page_tiket.com  Hotel Pesawat Keret/button_Log In'))

WebUI.verifyElementText(findTestObject('Object Repository/Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/span_Dendi'), 
    'Dendi')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/span_Dendi'))

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Profil Saya'), 
    'Profil Saya')

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_My Order'), 
    'My Order')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Kartu Saya'), 
    'Kartu Saya')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_TIX Point'), 
    'TIX Point')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Smart Traveler'), 
    'Smart Traveler')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Pengaturan Berlangganan'), 
    'Pengaturan Berlangganan')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Ubah Kata Sandi'), 
    'Ubah Kata Sandi')

WebUI.verifyElementText(findTestObject('Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/Page_Tiket Pesawat  Hotel Murah - T/span_Keluar'), 
    'Keluar')

WebUI.click(findTestObject('Object Repository/Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/span_Keluar'))

WebUI.verifyElementText(findTestObject('Object Repository/Login - Logout/Page_Tiket Pesawat  Hotel Murah - T/a_Login'), 
    'Login')

WebUI.takeScreenshot()

WebUI.closeBrowser()

