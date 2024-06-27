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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.eklipse.gg/login')
//
//WebUI.click(findTestObject('Object Repository/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Eklipse/input_OR_username'), 'Joshuamanurung19@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Eklipse/input_OR_password'), 'EZHycsYbPGeFaLeaGq1W7g==')

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Skip for now'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/i_See all_ic-user'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/button_Change Password'))

WebUI.setText(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/input_Current password_currentPassword'), 'EZHycsYbPGeFaLeaGq1W7g==')
WebUI.setText(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/input_New password_newPassword'), 'EZHycsYbPGdBBvgtTksTEA==')
WebUI.setText(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/input_Confirm password_confirmPassword'), 'EZHycsYbPGdBBvgtTksTEA==')
WebUI.click(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/button_Save Changes'))
WebUI.setText(findTestObject('Object Repository/ChangePassword_Eklipse/Page_Eklipse/h2_Updated Profile'))

//WebUI.setText(findTestObject('Object Repository/Page_Eklipse/input_Name_Name'), '')

//WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Save Changes'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Eklipse/h2_Updated Profile Unsuccessful'))

WebUI.closeBrowser()

