package in.srssprojects.kexim_bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

public class BranchDetialsPage {

	// country select
	@FindBy(id = "lst_countryS")
	private WebElement lstCountry;

	// state select
	@FindBy(id = "lst_stateS")
	private WebElement lstState;

	// city select
	@FindBy(id = "lst_cityS")
	private WebElement lstCity;

	// search button
	@FindBy(id = "btn_search")
	private WebElement btnSearch;

	// clear button
	@FindBy(id = "btn_clsearch")
	private WebElement btnClSearch;

	// new branch button
	@FindBy(id = "BtnNewBR")
	private WebElement newBranchButton;

	// select Country
	public void selectCountry(String strCountryValue) {
		new Select(this.lstCountry).selectByVisibleText(strCountryValue);
	}

	// select State
	public void selectState(String strStateValue) {
		new Select(this.lstState).selectByVisibleText(strStateValue);
	}

	// select City
	public void selectState(String strCityValue) {
		new Select(this.lstCity).selectByVisibleText(strCityValue);
	}

	// click on Search button
	public void clickSearchButton() {
		this.btnSearch.click();
	}

	// click on Clear button
	public void clickClearButton() {
		this.btnClSearch.click();
	}

	// click on new branch button
	public void clickNewBranchButton() {
		this.newBranchButton.click();
	}

}
