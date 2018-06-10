package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadsSteps {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the psd as (.*)")
	public void enterPassword(String Psd) {
		driver.findElementById("password").sendKeys(Psd);
	}

	@When("click on the login button")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verify Login is success")
	public void verifylogin() {
		System.out.println("Logged into LeafTaps successfully");
	}

	@And("click the link CRM/SFA")
	public void clicklink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("click on the Leads tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("click on the Create Lead tab")
	public void createleadtab() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the first name as (.*)")
	public void typefname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@And("Enter the last name as (.*)")
	public void typelname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@And("Enter the Company name as (.*)")
	public void typeComname(String Cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}

	@When("click on the Create Lead button")
	public void submit() {
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	}

	@Then("Verify that Create Lead is success")	
	public void verify() {
		String text = driver.findElementById("viewLead_statusId_sp").getText();
		if(text.equals("Assigned"))
		{
			System.out.println("CreateLead is successful");
		}
		else
		{
			System.out.println("Create Lead is not successful");
		}


	}


}
