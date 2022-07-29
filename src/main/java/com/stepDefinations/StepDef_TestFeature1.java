package com.stepDefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import com.BaseFiles.AccessibilityPage;

import com.BaseFiles.HomePage;
import com.CommonUtilities.BaseFile;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_TestFeature1 {
	
	
	
	@Before
	public void setup() throws IOException {
		PropertyConfigurator.configure("src/main/resources/Log4j.properties");
		com.CommonUtilities.BaseFile.setup();
		BaseFile.logger.info("The Setup is ready");
	}
	
//	@AfterAll
	public void terminate() {
		com.CommonUtilities.BaseFile.terminate();
		BaseFile.logger.info("The Test has terminated");
	}
	@Given("The application setup")
	public void the_application_setup() {
		
		Assert.assertTrue(com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).isDisplayed(),"driver setup failed");
		BaseFile.logger.info("The app is running");
	}

	@When("I click on the API Demos button")
	public void i_click_on_the_api_demos_button() {
	
		com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).click();
		BaseFile.logger.info("Clicked on Alert button ");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.APIDemosoption)).click();
		BaseFile.logger.info("Clicked on API Demos Option");

	}

	@When("Click on the Accessibility button")
	public void click_on_the_accessibility_button() {
		
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.AccessibilityOption)).click();
		BaseFile.logger.info(" Clicked on Accessibility option in Animation");
	
	}

	@When("Click on the Accessibility Node Querying button")
	public void click_on_the_accessibility_node_querying_button() {
	
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AccessibilityPage.Accessibility_Node_Querying_BUTTON)).click();
		BaseFile.logger.info("Tap on Accessibility Node Querying button ");
	
	}

	@Then("Go Back and click on the Accessibility Service")
	public void go_back_and_click_on_the_accessibility_service() {
	
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AccessibilityPage.Accessibility_Service)).click();
		BaseFile.logger.info("clicked on the Accessibility Service after navigating back");
	}

	@Then("Go Back and click on the Custom view")
	public void go_back_and_click_on_the_custom_view() {
	
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AccessibilityPage.Custom_View_Option)).click();
		BaseFile.logger.info("clicked on the Custom view after navigating back");
	}

	@Then("Go Back and then back")
	public void go_back_and_then_back() {
	
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		BaseFile.logger.info("Go back to the Home page");
	}
	
	
}
