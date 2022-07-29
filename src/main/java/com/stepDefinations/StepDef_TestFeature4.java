package com.stepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.BaseFiles.AnimationPage;
import com.BaseFiles.Default_Layout_Animations_Page;
import com.BaseFiles.Hide_Show_Animation_Page;
import com.BaseFiles.HomePage;
import com.CommonUtilities.BaseFile;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_TestFeature4 {

	@Given("The Animation Page")
	public void the_animation_page() {
	    // Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).click();
		BaseFile.logger.info("Clicked on the Alert Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.APIDemosoption)).click();
		BaseFile.logger.info("Clicked on the API DEMOS Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.AnimationOption)).click();
		BaseFile.logger.info("Taped on the Animation button");
	}

	@Then("Click on the Hide Show Animation")
	public void click_on_the_hide_show_animation() {
	    // Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Hide_Show_Animation_Page)).click();
		BaseFile.logger.info("Navigate into the Hide Show Animation ");
	}

	@When("Check on the Hide\\(Gone) checkbox")
	public void check_on_the_hide_gone_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(Hide_Show_Animation_Page.Hide_Button)).click();
		BaseFile.logger.info("Clicked on the Hide button");
	}

	@When("then on the visible dot buttons")
	public void then_on_the_visible_dot_buttons() {
	    // Write code here that turns the phrase above into concrete actions
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text0)).click();
		 BaseFile.logger.info("Clicked on the 0 button to hide it");
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text1)).click();
		 BaseFile.logger.info("Clicked on the 1 button to hide it");
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text2)).click();
		 BaseFile.logger.info("Clicked on the 2 button to hide it");
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text3)).click();
		 BaseFile.logger.info("Clicked on the 3 button to hide it");
		 com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		 BaseFile.logger.info("Clicked on the ADD button to show them again");
	}

	@Then("validate that the buttons are visible or not")
	public void validate_that_the_buttons_are_visible_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text3)).isDisplayed());
	   BaseFile.logger.info("Checked the Visibility of buttons");
	}

	@Then("Click on the Show button option")
	public void click_on_the_show_button_option() {
	    // Write code here that turns the phrase above into concrete actions
		 com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		 BaseFile.logger.info("Clicked on the add button to show it");
	}

	@Then("validate the Screen")
	public void validate_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
		  Assert.assertTrue(com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text0)).isDisplayed());
		  com.CommonUtilities.BaseFile.driver.navigate().back();
		  com.CommonUtilities.BaseFile.driver.navigate().back();
		  com.CommonUtilities.BaseFile.driver.navigate().back();
		  BaseFile.logger.info("Checked the Visibility of buttons and navigated to the home");
	}

	

}
