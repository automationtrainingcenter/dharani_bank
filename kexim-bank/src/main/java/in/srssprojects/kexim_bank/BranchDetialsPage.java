package in.srssprojects.kexim_bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class BranchDetialsPage {

	// country select
	
	//state select
	
	//city select
	
	//search button
	
	//clear button
	
	//new branch button
	@FindBy(id = "BtnNewBR")
	private WebElement newBranchButton;
	
	//click on new branch button
	public void clickNewBranchButton() {
		this.newBranchButton.click();
	}
}
