package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String Comyname,String Fname,String Lname,String mailId,String PhoneNo) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.ClickLeads()
		.createleadlink()
		.CompanyName(Comyname)
		.FirstName(Fname)
		.LastName(Lname)
		.emailID(mailId)
		.PhoneNo(PhoneNo)
		.ClickonCLead()
		.verifyLoggedName(Fname);
		//.clickLogOut();			
	}

}
