package com.stepDefinations;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;

import com.BaseFiles.AnimationPage;
import com.BaseFiles.Path_Animation_Page;
import com.BaseFiles.Simple_Animation_Page;
import com.CommonUtilities.BaseFile;

import io.appium.java_client.PerformsTouchActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_TestFeature5 {

	@Then("Click on Path Animations")
	public void click_on_path_animations() {

		try {
			com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Path_Animation_Page)).click();
			BaseFile.logger.info("Navigated to the Path Animation");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("Click on Named Components radio button")
	public void click_on_named_components_radio_button() {
		// Write code here that turns the phrase above into concrete actions
		try {
			com.CommonUtilities.BaseFile.driver.findElement(By.id(Path_Animation_Page.NamedComponent)).click();
			BaseFile.logger.info("Clicked on the named components");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("on the Multi-int radio button")
	public void on_the_multi_int_radio_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		
		try {
			
			com.CommonUtilities.BaseFile.driver.findElement(By.id(Path_Animation_Page.Exception_Element)).click();
			BaseFile.logger.info("Exception was created");
		} catch (Exception e) {
			System.out.println("Exception is created");
		}
		
	}

	@When("Navigate back and scroll down")
	public void navigate_back_and_scroll_down() throws WebDriverException {
		// Write code here that turns the phrase above into concrete actions
		
		try {
			com.CommonUtilities.BaseFile.driver.navigate().back();
			JavascriptExecutor js = (JavascriptExecutor) com.CommonUtilities.BaseFile.driver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			js.executeScript("mobile: scroll", scrollObject);
			BaseFile.logger.info("Scroll Down and click on simple transition ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("Press on the Simple Transitions")
	public void press_on_the_simple_transitions() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1);
		com.CommonUtilities.BaseFile.driver.findElement(By.xpath(AnimationPage.Simple_Transition_Page)).click();
		BaseFile.logger.info("clicked on Simple Transition");
	}

	@Then("then on Scene {int} right after Scene {int}")
	public void then_on_scene_right_after_scene(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		com.CommonUtilities.BaseFile.driver.findElement(By.id(Simple_Animation_Page.scene2)).click();
		com.CommonUtilities.BaseFile.driver.findElement(By.id(Simple_Animation_Page.scene4)).click();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		com.CommonUtilities.BaseFile.driver.navigate().back();
		BaseFile.logger.info("Check on the scene2 and scene4");

	}
}
