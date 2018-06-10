package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_DeleteLead extends ProjectMethods{
	
	public class TC001_LoginAndLogout extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC001_LoginAndLogout";
			testDescription="login and logout in LeafTaps Application";
			testNodes="Leads";
			category="Smoke";
			authors="Gopi";
			browserName="chrome";
			dataSheetName="TC003";
		}
		@Test(dataProvider="fetchData")
		public void DeleteLead(String uName,String pwd,String name,String data)
		{
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.ClickLeads()
			.FindLead()
			.firstname(name)
			.clickonfindlead()
			.selectdisplayname()
			.clickDeletelead();
		//	.FindLead()
			

}
	}
}
