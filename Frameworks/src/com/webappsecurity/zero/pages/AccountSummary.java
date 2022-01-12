package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	 @FindBy(linkText="Transfer Funds")
	  private WebElement transferfunds;
	 
	 
	 public AccountSummary(WebDriver driver) { //constructer
			PageFactory.initElements(driver, this); //will be add on all page classes	
		}
	 
	 public void clickTrasferfunds() {
		 transferfunds.click();	 
	 
	 
	 }


	public boolean isTransferfundspresent() { //need to check that the login to the  page is sucessfull
		                                      // and will take us to second page that have transferfund link
	boolean transfFundsPresent=transferfunds.isDisplayed();
	return transfFundsPresent;
}

}
