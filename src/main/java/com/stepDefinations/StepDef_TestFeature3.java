package com.stepDefinations;

import org.openqa.selenium.By;

import com.BaseFiles.AnimationPage;
import com.BaseFiles.Default_Layout_Animations_Page;
import com.BaseFiles.EventsPage;
import com.BaseFiles.HomePage;
import com.CommonUtilities.BaseFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_TestFeature3 {
	@Given("Animation Page")
	public void animation_page() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(HomePage.Alert_Button)).click();
		BaseFile.logger.info("Clicked on the Alert Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.APIDemosoption)).click();
		BaseFile.logger.info("Clicked on the API DEMOS Button");
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(HomePage.AnimationOption)).click();
		BaseFile.logger.info("Taped on the Animation button");
	}

	@Then("Click on Default Layout Animation")
	public void click_on_default_layout_animation() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Default_Layout_Animations_Page)).click();
		BaseFile.logger.info("Clicked on Layout Animation");
	}

	@When("Click on Add button")
	public void click_on_add_button() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(Default_Layout_Animations_Page.Add)).click();
		BaseFile.logger.info("Performed Add Button Action");
	}

	@When("on the new button to delete it and navigate back")
	public void on_the_new_button_to_delete_it_and_navigate_back() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1);
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(Default_Layout_Animations_Page.ONE)).click();
		BaseFile.logger.info("Deleted the button that was just created");
	}

	@When("Click on the Events button")
	public void click_on_the_events_button() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Events_Page)).click();
		BaseFile.logger.info("Navigated back and clicked on the Events button");
	}

	@Then("Press on the Play button")
	public void press_on_the_play_button() {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(EventsPage.Play_Button)).click();
		BaseFile.logger.info("Clicked on the Play Button");
	}

	@Then("then on Cancel right after {int}")
	public void then_on_cancel_right_after(Integer int1) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		Thread.sleep(int1);
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(EventsPage.Cancel_Button)).click();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		BaseFile.logger.info("Paused the Ball Navigation Action");
	}
}
