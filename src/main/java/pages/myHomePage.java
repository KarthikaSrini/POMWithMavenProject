package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class myHomePage extends ProjectMethods{
	public myHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleleads;
	
	@And("click on the Leads tab")
	public MyLeadsPage ClickLeads()
	{
		click(eleleads);
		return new MyLeadsPage();
	}
	
	
	
	
}
