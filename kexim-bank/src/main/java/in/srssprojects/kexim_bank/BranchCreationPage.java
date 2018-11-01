package in.srssprojects.kexim_bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage {

	// branch name field

	@FindBy(id = "txtbName")
	private WebElement txtBranchName;

	// address 1 field
	@FindBy(id = "txtAdd1")
	private WebElement txtAdd1Value;

	// zip code field
	@FindBy(id = "txtZip")
	private WebElement txtZipValue;

	// country field
	@FindBy(id = "lst_counrtyU")
	private WebElement lstCountryUValue;

	// state filed
	@FindBy(id = "lst_stateI")
	private WebElement lstStateIValue;

	// city field
	@FindBy(id = "lst_cityI")
	private WebElement lstCityIValue;

	// submit button
	@FindBy(id = "btn_insert")
	private WebElement btnInsert;

	// reset button
	@FindBy(id = "Btn_Reset")
	private WebElement btnReset;

	// cancel button
	@FindBy(id = "Btn_cancel")
	private WebElement btnCancel;

	// select Country
	public void selectCountry(String StrCountryUValue) {
		new Select(this.lstCountryUValue).selectByVisibleText(StrCountryUValue);
	}

	// select State
	public void selectState(String strStateIValue) {
		new Select(this.lstStateIValue).selectByVisibleText(strStateIValue);
	}

	// select City
	public void selectState(String strCityIValue) {
		new Select(this.lstCityIValue).selectByVisibleText(lstCityIValue);
	}

	// click on Insert button
	public void clickInsertBranch() {
		this.btnInsert.click();
	}

	// click on Clear button
	public void clickResetButton() {
		this.btnReset.click();
	}

	// click on new branch button
	public void clickCancelButton() {
		this.btnCancel.click();
	}

}
