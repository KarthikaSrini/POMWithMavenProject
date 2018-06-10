package pages;

import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AlertPage extends ProjectMethods {
	
	public AlertPage()
	{
		PageFactory.initElements(driver, this);
	}

//	acceptAlert();
}
