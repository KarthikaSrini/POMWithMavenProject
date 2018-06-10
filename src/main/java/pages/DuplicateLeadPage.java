package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFname;
	public DuplicateLeadPage FName(String name)
	{
		type(eleFname,name);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLname;
	public DuplicateLeadPage LName(String lname)
	{
		type(eleLname,lname);
		return this;		
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;
	
	public DuplicateLeadPage CyName(String data)
	{
		type(eleCname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleemailID;
	public DuplicateLeadPage mailID(String id)
	{
		type(eleemailID,id);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elephoneNum;
	public DuplicateLeadPage MobileNo(String num)
	{
		type(elephoneNum,num);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleindustry;
	public DuplicateLeadPage selectIndustry(String input)
	{
		selectDropDownUsingText(eleindustry,input);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement elecreate;
	
	public ViewLeadPage createduplicatelead()
	{
		click(elecreate);
		return new ViewLeadPage();
	}
}
