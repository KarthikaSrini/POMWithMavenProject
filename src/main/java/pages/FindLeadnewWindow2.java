package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods;

public class FindLeadnewWindow2 extends ProjectMethods {
	
	public FindLeadnewWindow2()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleinputfname;
	public FindLeadnewWindow2 firstname1(String data)
	{
		type(eleinputfname, data);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickfindlead;
	public FindLeadnewWindow2 clickonfindleadagain()
	{
		click(eleclickfindlead);
		return this;
	}
	
	
	WebDriverWait wait= new WebDriverWait(driver,10);
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleselectname;
	
	public MergeLeadsPage selectdisplaynameagain()
	{
		wait.until(ExpectedConditions.elementToBeClickable(eleselectname));
		click(eleselectname);
		return new MergeLeadsPage();
	
	}

}
