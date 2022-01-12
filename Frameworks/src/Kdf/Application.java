package Kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

@Test
public void verifyInvalidLogin() throws IOException {
  String[][] data = GenericMethods.getData("D:\\QA softwares\\TestData.xlsx","Sheet2");   //Connect to the excelsheet ,and read the data from it
    Methods mtd=new Methods(); //Create object of the class (openBrowser)
  for(int i=1;i<data.length;i++) { // data will trasfer to 2- dimintional array
   switch(data[i][3]) {
   case "openBrowser":// if the key is openBrowser
      mtd.openBrowser(); //call the methods 
   break;
   
   case "maxBrowser":// if the key is maxBrowser
   mtd.Maximizebrowserwindow(); //call the methods
   break;
   
   case"impWait":// if the key is impWait
   mtd.ImplementimplicitWait();
   break;
   
   case"navigate To App":
       mtd.navigateToApp(data[i][6]);
	   break;
	   
      case"enterInTextbox": 
	   mtd.enterInTextbox(data[i][5],data[i][6]);
	   break;
   
      case"clickButton":
    	  mtd.clickButton(data[i][4],data[i][5]);
          break; 
         
        case"verifyMsg":
        String actualMsg= mtd.getMessage(data[i][4],data[i][5]); // call method
        String expectedMsg= data[i][6];
        Assert.assertEquals(actualMsg, expectedMsg);
         break;
  
   
         case"closeApp":
        	 mtd.closeApplication();
        
        break;
   
   }

  }
}
}