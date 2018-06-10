package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleeditComyname;
	
	public EditLead editComName(String data)
	{
		type(eleeditComyname,data);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement eleupdatebutton;
	
	public ViewLeadPage submit()
	{
		click(eleupdatebutton);
		return new ViewLeadPage();
	}
	
}
