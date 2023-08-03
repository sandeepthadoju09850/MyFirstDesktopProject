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

def strIndex = "$index"

def hash_map = pageData.get((GlobalVariable.TestCase + '-') + strIndex)

if ((hash_map.get('BTN_Rate') != null) && (hash_map.get('BTN_Rate').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_RATE'))
}

if ((hash_map.get('BTN_AddressValidationYes') != null) && (hash_map.get('BTN_AddressValidationYes').length() > 0)) {
    
   Thread.sleep(5000)
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_AddressChangeYes'))

    
}

if ((hash_map.get('BTN_RateMessageOK') != null) && (hash_map.get('BTN_RateMessageOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_RateMessage_OK'))
}

//Windows.switchToWindowTitle('MS-Link')
CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('MSLink/RateDetails/Btn_Win_Close'))

/*
Boolean Win = Windows.verifyElementPresent(findWindowsObject('MSLink/RateDetails/Btn_Win_Close'), 5)
if(Win) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('MSLink/RateDetails/Btn_Win_Close'))	
}
*/
if ((hash_map.get('BTN_UnableToRateOK') != null) && (hash_map.get('BTN_UnableToRateOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UW_OK'))
}

if ((hash_map.get('TotalPremium') != null) && (hash_map.get('TotalPremium').length() > 0)) {
    String PolicyPremium = Windows.getText(findWindowsObject('MSLink/RateDetails/Lbl_Rate_PolicyPremium'))

    Windows.verifyEqual(PolicyPremium, hash_map.get('TotalPremium'), FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('AutoPremium') != null) && (hash_map.get('AutoPremium').length() > 0)) {
    String AutoPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_AutoPremium'))

    Windows.verifyEqual(AutoPremium, hash_map.get('AutoPremium'), FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('PrimaryResidencyPremium') != null) && (hash_map.get('PrimaryResidencyPremium').length() > 0)) {
    String PResPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_PrimaryResidencyPremium'))

    Windows.verifyEqual(PResPremium, hash_map.get('PrimaryResidencyPremium'), FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('UmbrellaPremium') != null) && (hash_map.get('UmbrellaPremium').length() > 0)) {
    String UMPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_UmbrellaPremium'))

    Windows.verifyEqual(UMPremium, hash_map.get('UmbrellaPremium'), FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('BTN_RateClose') != null) && (hash_map.get('BTN_RateClose').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_Rate_Close'))
}

