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



	@Given("i start the application")
	def lauchAPP() {
		println ("\n i start the application")
		Mobile.startApplication('C:\\Users\\phaze\\Downloads\\MoviesDB_3.0_Apkpure.apk', true)
	}

	@When("click on image object")
	def clickOnImageOject() {
		println ("\n click on image object")
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.ImageView'), 0)
	}

	@Then("return to the home page")
	def ReturnToHomepage() {
		println ("\n return to the home page" )
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.ImageButton'), 0)
	}
	
    @Given("i start application")
	def StartApp() {
		println("\n i start application")
		Mobile.startApplication('C:\\Users\\phaze\\Downloads\\MoviesDB_3.0_Apkpure.apk', true)
	}
	
	@When("view filter list")
	def ClickOnObject() {
		println ("\n view filter list")
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.TextView'), 0)
		
	}
	
	@And("click on popular")
	def ClickOnViewedObject() {
		println ("\n click on popular")
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.TextView - Popular'), 0)
	}
	
	@Then("click on refresh")
	def ReturnToDefault() {
		println ("\n click on refresh")
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.ImageView (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/script2/android.widget.TextView - Refresh'), 0)
		
	}
	
