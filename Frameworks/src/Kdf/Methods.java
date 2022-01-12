package Kdf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

WebDriver driver;
	public void openBrowser() {  
    driver=new ChromeDriver(); //creat method 
	}

 public void Maximizebrowserwindow() {  //creat method 
 driver.manage().window().maximize();
 }
 
 public void ImplementimplicitWait() {  //creat method 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 }
 
 public void navigateToApp(String url) {  //creat method 
  driver.get(url);  //we will use 3 diffrent url we will pass it as parameter

 }

public void enterInTextbox(String locValue,String testData ){//locater value of the text box will be changed 
driver.findElement(By.id(locValue)).sendKeys(testData);

}

public  void clickButton(String loc, String locValue) {
	if(loc.equals("name")) {
driver.findElement(By.name(locValue)).click();
}
	else if(loc.equals("Xpath")) {
driver.findElement(By.xpath(locValue)).click();	
		
	}
}

public String getMessage(String loc,String locValue) {
	String errorMsgText = null;
	if(loc.equals("cssSelector")) {
  errorMsgText=driver.findElement(By.cssSelector(locValue)).getText();//geting the text
  }
  else if (loc.equals("id")) {
 String errorMsgText1=driver.findElement(By.id(locValue)).getText();
  }
 
 return errorMsgText; //return error message

}

public void closeApplication() {
	driver.close();
}



}
