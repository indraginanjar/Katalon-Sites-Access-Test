package katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class KatalonSites {

	@Given("I have opened web browser")
	def I_have_opened_web_browser() {
		WebUI.callTestCase(findTestCase('Test Cases/Tests/Open web browser successfuly'), null)
	}

	@When("I open katalon website")
	def I_open_katalon_website() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Open web page'), [pageUrl:GlobalVariable.katalonWebUrl])
	}

	@Then("I verify the website is opened succesfully")
	def I_verify_the_website_is_opened_succesfully() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Verify the website is opened successfully'), null)
	}

	@Then("I verify the website is opened succesfully proofed by detailed screenshots")
	def I_verify_the_website_is_opened_succesfully_proofed_by_detailed_screenshots() {
		WebUI.callTestCase(findTestCase('Test Cases/Tests/With element screenshot/Katalon website is opened successfully'), null)
	}

	@When("I open katalon admin site")
	def I_open_katalon_admin_site() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Open web page'), [pageUrl:GlobalVariable.katalonAdminWebUrl])
	}

	@Then("I verify the admin site is opened succesfully")
	def I_verify_the_admin_site_is_opened_succesfully() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Verify the admin site is opened successfully'), null)
	}

	@Then("I verify the admin site is opened succesfully proofed by detailed screenshots")
	def I_verify_the_admin_site_is_opened_succesfully_proofed_by_detailed_screenshots() {
		WebUI.callTestCase(findTestCase('Test Cases/Tests/With element screenshot/Katalon admin site is opened successfully'), null)
	}

	@When("I open katalon testops site")
	def I_open_katalon_testops_site() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Open web page'), [pageUrl:GlobalVariable.katalonTestopsWebUrl])
	}

	@Then("I verify the testops site is opened succesfully")
	def I_verify_the_testops_site_is_opened_succesfully() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Verify the testops site is opened successfully'), null)
	}

	@Then("I verify the testops site is opened succesfully proofed by detailed screenshots")
	def I_verify_the_testops_site_is_opened_succesfully_proofed_by_detailed_screenshots() {
		WebUI.callTestCase(findTestCase('Test Cases/Tests/With element screenshot/Katalon testops site is opened successfully'), null)
	}

	@When("I open katalon store site")
	def I_open_katalon_store_site() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Open web page'), [pageUrl:GlobalVariable.katalonStoreWebUrl])
	}

	@Then("I verify the store site is opened succesfully")
	def I_verify_the_store_site_is_opened_succesfully() {
		WebUI.callTestCase(findTestCase('Test Cases/Steps/Verify the store site is opened successfully'), null)
	}

	@Then("I verify the store site is opened succesfully proofed by detailed screenshots")
	def I_verify_the_store_site_is_opened_succesfully_proofed_by_detailed_screenshots() {
		WebUI.callTestCase(findTestCase('Test Cases/Tests/With element screenshot/Katalon store site is opened successfully'), null)
	}
}