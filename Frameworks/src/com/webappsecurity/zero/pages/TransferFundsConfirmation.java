package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
  
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confTextBox;

	
	@FindBy(css="#settingsBox > ul > li.dropdown.open > a")//username -logout
	private WebElement username;
	
	@FindBy(id="logout_link") //logout
	private WebElement logout;
	
	public TransferFundsConfirmation(WebDriver driver) { //constructer
		PageFactory.initElements(driver, this); //will be add on all page classes
		
	}
	
	
	//actions will  done on web element 
   public String getConfText() { //can not use void here with return line 
	                           //we will replace it with data type of what is been return which is text (string) 
	  String confText= confTextBox.getText();   
      return confText; 
   
 }

 public void logoutFromApplication() {
	 
	 username.click();
	 logout.click();
 }


}










