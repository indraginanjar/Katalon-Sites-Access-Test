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

Map verificationParam = [:]

verificationParam['pageName'] = 'Katalon website'

verificationParam['presentElementName'] = 'Page title'

verificationParam['presentElementXpath'] = "/html/head/title[text()='Katalon Software Quality Management Platform']"

verificationParam['visibleElementName'] = 'Katalon logo'

verificationParam['visibleElementXpath'] = "//a[@class='katalon_logo']/img[@alt='Katalon']"

verificationParam['screenshotElementOnPassingVisibleVerification'] = screenshotElementOnPassingVisibleVerification

verificationParam['visibleCheckpointElementName'] = 'Website Big title'

verificationParam['visibleCheckpointElementXpath'] = "//section[@class='hero_section']//h1[@class='hero_title']"

verificationParam['screenshotCheckpointElementOnPassingVisibleVerification'] = screenshotCheckpointElementOnPassingVisibleVerification

verificationParam['secondsWaitingForPageLoad'] = secondsWaitingForPageLoad

WebUI.callTestCase(findTestCase('Test Cases/Steps/Verify web page is opened'), verificationParam)
