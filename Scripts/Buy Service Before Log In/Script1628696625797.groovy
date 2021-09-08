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

WebUI.navigateToUrl(GlobalVariable.Base_url)

WebUI.click(findTestObject('Buy Services Before Log In/Page_Genetica  American Technology Genetic _edbded/img'))

WebUI.switchToWindowTitle('SCB | Genetica®')

WebUI.click(findTestObject('Buy Services Before Log In/Page_SCB  Genetica/a_Tm hiu thm'))

WebUI.switchToWindowTitle('G-Care | Genetica®')

WebUI.click(findTestObject('Buy Services Before Log In/Page_G-Care  Genetica/a_Add to cart'))

WebUI.click(findTestObject('Buy Services Before Log In/Page_Cart  Genetica/button_Check out'))

WebUI.click(findTestObject('Buy Services Before Log In/Page_Summary  Genetica/input__fullName'))

WebUI.setText(findTestObject('Buy Services Before Log In/Page_Summary  Genetica/input__fullName'), full_name)















