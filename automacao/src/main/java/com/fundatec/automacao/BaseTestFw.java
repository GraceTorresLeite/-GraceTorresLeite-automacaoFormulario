package com.fundatec.automacao;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;

public class BaseTestFw {
	
	private WebDriver driver;
	private String URL = "http://testpages.herokuapp.com/styled/basic-html-form-test.html";
	
	public WebDriver getDriver() {
	this.driver = DriverManagerFw.setDriver(DriverTypeFw.CHROME);
	return this.driver;
	}
	
	@Before
	public void setup() {
		getDriver().get(URL);
	}
	
	@After
	public void teardown() {
		DriverManagerFw.quitDriver();
	}
}
