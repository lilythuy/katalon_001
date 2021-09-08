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

WebUI.navigateToUrl('https://next.genetica.asia/g-base-diet-quiz')

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_CaiThienVocDang'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_TangCan'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_gender_Nu'))

WebUI.getText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnAge'))

//WebUI.clearText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnAge')) 
//Clear text before fill in
WebUI.doubleClick(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnAge'))

WebUI.sendKeys(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnAge'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnAge'), '25')

//WebUI.clearText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnHeight'))
WebUI.doubleClick(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnHeight'))

WebUI.sendKeys(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnHeight'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnHeight'), '161')

//WebUI.clearText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnWeight'))
WebUI.doubleClick(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnWeight'))

WebUI.sendKeys(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnWeight'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/input_CscnWeight'), '42')

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/button_CscnNext'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_Cvht_1'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_Tltt_1'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_Tt_Kmgthai'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_Skht_DiUngSb_tick'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/div_Skht_DiUngCabien_tick'))

WebUI.click(findTestObject('G Base Diet Quiz2/Page_Ch  n no ph hp vi bn  Genetica/button_Next_skht'))

WebUI.dragAndDropByOffset(findTestObject(null), 0, 0)

//testing 

