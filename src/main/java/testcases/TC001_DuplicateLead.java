package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_DuplicateLead {

	public class TC001_LoginAndLogout extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC001_LoginAndLogout";
			testDescription="login and logout in LeafTaps Application";
			testNodes="Leads";
			category="Smoke";
			authors="Gopi";
			browserName="chrome";
			dataSheetName="TC004";
		}
		@Test(dataProvider="fetchData")
		public void DuplicateLead(String uName,String pwd,String name,String name1,String name2,String name3,String name4,String name5,String data)
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
			.clickDuplicateLead()
			.FName(name1)
			.LName(name2)
			.CyName(name3)
			.mailID(name4)
			.MobileNo(name5)
			.selectIndustry(data)
			.createduplicatelead();
	
}
	}
}
