package com.fundatec.automacao.PageObjects;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fundatec.automacao.BaseTestFw;

public class PreencherFormTest extends BaseTestFw {
	
	private WebDriver driver = this.getDriver();
	
	
	@Test
	public void popularForm() throws InterruptedException {
		
		HomeTask home = new HomeTask(driver);
		
		home.verificaHome();
		home.preencheFormulario();
	}

}
