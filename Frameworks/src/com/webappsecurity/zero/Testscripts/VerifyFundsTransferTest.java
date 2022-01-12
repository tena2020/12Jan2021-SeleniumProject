package com.webappsecurity.zero.Testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccountSummary;
import com.webappsecurity.zero.pages.TransferFunds;
import com.webappsecurity.zero.pages.TransferFundsConfirmation;
import com.webappsecurity.zero.pages.TransferFundsVerify;
import com.webappsecurity.zero.pages.login;

import utils.GenericMethods;

public class VerifyFundsTransferTest extends Base {

@Test
public void VerifyFundTransferTest() throws IOException{ //creat objects of page classess
                                        //call methods of objects from these classes
login Lp=new login(driver);
AccountSummary acc=new AccountSummary(driver);
TransferFunds tf=new TransferFunds(driver);
TransferFundsVerify tfv=new TransferFundsVerify(driver);
TransferFundsConfirmation tfc=new TransferFundsConfirmation(driver);

String[][] data = GenericMethods.getData("D:\\QA softwares\\TestData.xlsx","Sheet1"); //Connect to Excel sheet

for(int i=1;i<data.length;i++ ) {

Lp.applicationlogin(data[i][0],data[i][1]); // will take the data from EXcel sheet

tf.fundTransfer(data[i][2],data[i][3]);
acc.clickTrasferfunds();

tfv.clicksubmit();
String actualMsg=tfc.getConfText();
String  expectedMsg=data[i][4];

Assert.assertEquals(actualMsg, expectedMsg);
tfc.logoutFromApplication();  //call method ,after logout
driver.get("http://zero.webappsecurity.com/login.html");// go to signin page


}
}

}

