package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt = 'Lookup'])[1]")
	private WebElement eleFromleadicon;
	public FindLeadnewWindow FromLeadicon()
	{
		click(eleFromleadicon);
		return new FindLeadnewWindow();
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt = 'Lookup'])[2]")
	private WebElement eleToleadicon;
	public FindLeadnewWindow2 ToLeadicon()
	{
		click(eleToleadicon);
		return new FindLeadnewWindow2();
	}

	@FindBy(how=How.XPATH,using="//a[@class = 'buttonDangerous']")
	private WebElement elemergebutton;
	
	public ViewLeadPage clickonMergeLeadbutton()
	{
		click(elemergebutton);
		acceptAlert();
		return new ViewLeadPage();
	}
}
