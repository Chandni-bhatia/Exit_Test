package com.stepDefinations;

import org.openqa.selenium.By;

import com.BaseFiles.AccessibilityPage;
import com.BaseFiles.AnimationPage;
import com.BaseFiles.CloningPage;
import com.BaseFiles.HomePage;
import com.CommonUtilities.BaseFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_TestFeature2 {

	@Given("The Home page opened")
	public void the_home_page_opened() throws InterruptedException {
		
	Thread.sleep(1);
	BaseFile.logger.info("Waiting for a second");
	}

	@When("I click on API Demos")
	public void i_click_on_api_demos() {
		com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).click();
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.APIDemosoption)).click();
		BaseFile.logger.info("performed Action on the API Demos and Alert Button");
	}

	@Then("Click on Animation")
	public void click_on_animation() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.AnimationOption)).click();
		BaseFile.logger.info("Clicked on the Animation Button");
	}

	@Then("Click on Cloning")
	public void click_on_cloning() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Cloning_Page)).click();
		BaseFile.logger.info("Navigated to the Cloning_Page");
	}

	@Then("By clicking on Run button the Game Started")
	public void by_clicking_on_run_button_the_game_started() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(CloningPage.Start_Button)).click();
		BaseFile.logger.info("Clicked on the Run button ");
	}

	@Then("went back and click on Custom Evaluator")
	public void went_back_and_click_on_custom_evaluator() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Custom_Evaluator_Page)).click();
		BaseFile.logger.info("Navigated Back and clicked on the Custom_Evaluator ");
	}

	@Then("Click on Play button and went back and back")
	public void click_on_play_button_and_went_back_and_back() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1);
		com.CommonUtilities.BaseFile.driver.findElement(By.id(CloningPage.Start_Button)).click();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		BaseFile.logger.info("Clicked on the Play Button and navigated towards the home");
	}

}
