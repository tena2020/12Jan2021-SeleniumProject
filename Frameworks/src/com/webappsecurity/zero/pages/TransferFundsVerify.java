package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {

@FindBy(id="btn_submit")
private WebElement submitBtn;


public TransferFundsVerify(WebDriver driver) { //constructer
	PageFactory.initElements(driver, this); //will be add on all page classes
	
}


public void clicksubmit() {
	submitBtn.click();

}



}
