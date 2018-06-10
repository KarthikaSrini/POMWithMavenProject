package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleLoggedFName;
	
	@Then("Verify that Create Lead is success")
	public ViewLeadPage verifyLoggedName(String data) {
	verifyExactText(eleLoggedFName, data);
		return this;	
	
	}

	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[3]")
	private WebElement eleEdit;
	public EditLead clickEditlead()
	{
		click(eleEdit);
		return new EditLead();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous']")
	private WebElement eleDelete;
	
	public MyLeadsPage clickDeletelead()
	{
		click(eleDelete);
		return new MyLeadsPage();
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleclickduplilead;
	
	public DuplicateLeadPage clickDuplicateLead()
	{
		click(eleclickduplilead);
		return new DuplicateLeadPage();
	}
	
	
}




