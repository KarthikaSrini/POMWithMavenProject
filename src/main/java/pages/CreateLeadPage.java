package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage()
	{
		
	PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;
	
	@And("Enter the Company name as (.*)")
	public CreateLeadPage CompanyName(String data)
	{
		type(eleCname,data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFname;
	
	@And("Enter the first name as (.*)")
	public CreateLeadPage FirstName(String name)
	{
		type(eleFname,name);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLname;
	
	@And("Enter the last name as (.*)")
	public CreateLeadPage LastName(String lname)
	{
		type(eleLname,lname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleemailID;
	public CreateLeadPage emailID(String id)
	{
		type(eleemailID,id);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement phoneNum;
	public CreateLeadPage PhoneNo(String num)
	{
		type(phoneNum,num);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement eleCleadbutton;
	
	@When("click on the Create Lead button")
	public ViewLeadPage ClickonCLead()
	{
		click(eleCleadbutton);
		return new ViewLeadPage();		
	}
	
	}

