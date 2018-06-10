package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods;

public class FindLeadnewWindow extends ProjectMethods{
	
	public FindLeadnewWindow()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleinputfname;
	public FindLeadnewWindow firstname(String data)
	{
		type(eleinputfname, data);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickfindlead;
	public FindLeadnewWindow clickonfindlead()
	{
		click(eleclickfindlead);
		return this;
	}
	
	
	WebDriverWait wait= new WebDriverWait(driver,10);
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleselectname;
	
	public MergeLeadsPage selectdisplayname()
	{
		wait.until(ExpectedConditions.elementToBeClickable(eleselectname));
		click(eleselectname);
		return new MergeLeadsPage();
	
	}

}
