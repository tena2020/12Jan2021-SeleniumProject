package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {

    @FindBy(id="tf_fromAccountId")
    private WebElement fromAcc;

    @FindBy(id="tf_toAccountId")
    private WebElement toAccount;

    @FindBy(id="tf_amount")
    private WebElement amt;


    @FindBy(id="tf_description")
    private WebElement desc;
    
    @FindBy(id="btn_submit")
    private WebElement submitBtn;
    

    public TransferFunds(WebDriver driver) { //constructer
    	PageFactory.initElements(driver, this); //will be add on all page classes
    	
    }
 
    
    public void fundTransfer(String amount,String data) {
	Select fromDD= new Select(fromAcc);//Create obj of (select clas)s as we are dealing with dropdown box
	fromDD.selectByIndex(2);
     
	Select toDD= new Select(toAccount);
	toDD.selectByIndex(3);

	amt.sendKeys(amount);
    desc.sendKeys(data);

    submitBtn.click();
    
  
    
    
    }

}
