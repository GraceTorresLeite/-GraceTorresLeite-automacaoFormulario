package com.fundatec.automacao.PageObjects;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class HomeTask {

	private WebDriver driver;
	private HomePage page;

	public HomeTask(WebDriver driver) {
		// super();
		this.driver = driver;
		page = new HomePage(this.driver);
	}
	
	//DefaultListModel<JCheckBox> model = new DefaultListModel<JCheckBox>();
	//JCheckBoxList checkBoxList = new JCheckBoxList(model);

	public void verificaHome() throws InterruptedException {
		String label = page.homeTextLabel().getText();
		sleep(5000);
		assertEquals(label, "Basic HTML Form Example");
	}

	public void preencheFormulario() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 5000);
		// page.homeUsername().clear();
		page.homeUsername().click();
		page.homeUsername().sendKeys("Grace");
		// page.homeUsername().sendKeys(Keys.TAB);
		// sleep(2000);

		page.homePassword().click();
		page.homePassword().sendKeys("12345");

		page.homeTextAreaComment().click();
		// wait.until(ExpectedConditions.elementToBeClickable(page.homeTextAreaComment()));
		page.homeTextAreaComment().clear();
		page.homeTextAreaComment().sendKeys("Bha que legal!");
		sleep(5000);

		
		page.homeCheckboxItemsValueOne().click();
		sleep(5000);
		page.homeCheckboxItemsValueTwo().click();
		sleep(5000);
		page.homeCheckboxItemsValueThree().click();
		sleep(5000);
		page.homeRadioItemsValueOne().click();
		sleep(5000);
		page.homeRadioItemsValueTwo().click();
		sleep(5000);
		page.homeRadioItemsValueThree().click();
		sleep(5000);
		
		page.homeMultipleSelectValuesOne().click();
		sleep(5000);
		page.homeMultipleSelectValuesTwo().click();
		sleep(5000);
		page.homeMultipleSelectValuesThree().click();
		sleep(5000);
		page.homeMultipleSelectValuesFour().click();
		sleep(5000);
		
		
        page.homeDropdownOne().click();
        sleep(2000);
        page.homeDropdownTwo().click();
        sleep(2000);
        page.homeDropdownThree().click();
        sleep(2000);
        page.homeDropdownFour().click();
        sleep(2000);
        page.homeDropdownFive().click();
        sleep(2000);
        page.homeDropdownSix().click();
        sleep(2000);
        
        page.clickSubmit().click();
        sleep(2000);
	}

}
