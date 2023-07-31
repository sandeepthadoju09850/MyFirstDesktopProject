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

Thread.sleep(8000)

if ((hash_map.get('BTN_AddressValidationYes') != null) && (hash_map.get('BTN_AddressValidationYes').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_AddressChangeYes'))
}

if ((hash_map.get('BTN_RateMessageOK') != null) && (hash_map.get('BTN_RateMessageOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_RateMessage_OK'))
}

if ((hash_map.get('BTN_UnableToRateOK') != null) && (hash_map.get('BTN_UnableToRateOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UW_OK'))
}

if ((hash_map.get('TotalPremium') != null) && (hash_map.get('TotalPremium').length() > 0)) {
    String PolicyPremium = Windows.getText(findWindowsObject('MSLink/RateDetails/Lbl_Rate_PolicyPremium'))

    String AutoPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_AutoPremium'))

    String PrimaryResidencyPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_PrimaryResidencyPremium'))

    String UmbrellaPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_UmbrellaPremium'))

    Windows.verifyEqual(PolicyPremium, hash_map.get('TotalPremium'))

    //Windows.verifyMatch(findWindowsObject(null), '', false)
}

if ((hash_map.get('BTN_RateClose') != null) && (hash_map.get('BTN_RateClose').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_Rate_Close'))
}

