package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	
	@And("click on the Create Lead tab")
	public CreateLeadPage createleadlink()
	{
		click(elecreatelead);
		return new CreateLeadPage();
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindleads;
	
	public FindLeadslink FindLead()
	{
		click(eleFindleads);
		return new FindLeadslink();
		
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']")
	private WebElement elemergepage;
	
	public MergeLeadsPage Mergeleadpage()
	{
		click(elemergepage);
		return new MergeLeadsPage();
	}

}
