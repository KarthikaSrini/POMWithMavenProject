package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_MergeLead extends ProjectMethods{
	
	public class TC001_LoginAndLogout extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC001_LoginAndLogout";
			testDescription="login and logout in LeafTaps Application";
			testNodes="Leads";
			category="Smoke";
			authors="Gopi";
			browserName="chrome";
			dataSheetName="TC005";
		}
		@Test(dataProvider="fetchData")
		public void MergeLead(String uName,String pwd,String username1,String username2)
		{
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.ClickLeads()
			.Mergeleadpage()
			.FromLeadicon()
			.firstname(username1)
			.clickonfindlead()
			.selectdisplayname()
			.ToLeadicon()
			.firstname1(username2)
			.clickonfindleadagain()
			.selectdisplaynameagain()
			.clickonMergeLeadbutton();

}
	}
}
