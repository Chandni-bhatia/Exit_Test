package com.stepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.BaseFiles.AnimationPage;
import com.BaseFiles.Default_Layout_Animations_Page;
import com.BaseFiles.Hide_Show_Animation_Page;
import com.BaseFiles.HomePage;
import com.CommonUtilities.BaseFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDef_TestFeature6 {

	@Given("The Animation Page so")
	public void the_animation_page_so() {
	    // Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).click();
		BaseFile.logger.info("Clicked on the Alert Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.APIDemosoption)).click();
		BaseFile.logger.info("Clicked on the API DEMOS Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.AnimationOption)).click();
		BaseFile.logger.info("Taped on the Animation button");
	}

	
	
	@Then("Click on Add button option {int} times")
	public void click_on_add_button_option_times(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	     
	     com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Layout_Animation_Page)).click();
	     BaseFile.logger.info("Navigated to the Layout Animation option");
		  com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		  com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		  com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		  BaseFile.logger.info("Click on the Add button to add buttons");

	}

	@Then("on the Custom Animation")
	public void on_the_custom_animation() {
	    // Write code here that turns the phrase above into concrete actions
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.Custom_Animation)).click();
		 BaseFile.logger.info("click on the custome Animation to add animation in the delete operation");
	}

	@Then("then on the visible dot buttonss")
	public void then_on_the_visible_dot_buttonss() throws InterruptedException {
	 
	
		 com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text1)).click();
		 BaseFile.logger.info("Clicked on the 1 button to hide it");
		  Thread.sleep(1);
		  com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text2)).click();
		  BaseFile.logger.info("Clicked on the 2 button to hide it");
		  Thread.sleep(1);
		  com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text3)).click();
		  BaseFile.logger.info("Clicked on the 3 button to hide it");
	}

	@Then("validate that the buttons are visible or are not showing")
	public void validate_that_the_buttons_are_visible_or_are_not_showing() {
		  Assert.assertTrue(com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Hide_Show_Animation_Page.text1)).isDisplayed());
		    com.CommonUtilities.BaseFile.driver.navigate().back();
		    com.CommonUtilities.BaseFile.driver.navigate().back();
		    com.CommonUtilities.BaseFile.driver.navigate().back();
		    BaseFile.logger.info("Validate the Screen and navigate back");
	}
}
