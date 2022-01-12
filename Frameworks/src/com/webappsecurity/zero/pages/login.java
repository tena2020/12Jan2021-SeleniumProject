package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

   @FindBy(id="user_login")
   private WebElement uName;

   @FindBy(id="user_password") 
   private WebElement pass;

   @FindBy(name="submit") 
   private WebElement Signin;

  @FindBy(css="#login_form > div.alert.alert-error") //enter invalid username and pass
  private  WebElement errorMsgBox;                                // invalid message
   
   
   //actions will take on web elements will be write inside method

public login(WebDriver driver) { //constructer
	PageFactory.initElements(driver, this); //will be add on all page classes
	
}
   
   public void applicationlogin(String username,String password) {//any test data the we have to use in the method ,
	                                                              //we will write it as parameter 
    uName.sendKeys(username);
    pass.sendKeys(password);
    Signin.click();

}

public String getErrorMsgText() {  //action we need to to on webelemnt ( errorMsgBox)
    String errorMsgText= errorMsgBox.getText();//is get error msg text
	return  errorMsgText;   
	
}



}