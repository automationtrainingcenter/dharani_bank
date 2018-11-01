package in.srssprojects.kexim_bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreationPage {

	// role name field
	@FindBy(id = "txtRname")
	private WebElement txtRoleName;

	// role type select
	@FindBy(id = "lstRtypeN")
	private WebElement lstRoleType;

	// submit button
	@FindBy(id = "btninsert")
	private WebElement btnInsertRole;

	// reset button
	@FindBy(id = "Btn_Reset")
	private WebElement btnResetRole;

	// cancel button
	@FindBy(id = "Btn_cancel")
	private WebElement btnCancelRole;

	// select Role type
	public void selectRoleType(String strRoleTypeValue) {
		new Select(this.lstRoleType).selectByVisibleText(strRoleTypeValue);
	}

	// click on Insert Role button
	public void clickInsertRoleButton() {
		this.btnInsertRole.click();
	}

	// click on Reset Role button
	public void clickResetRoleButton() {
		this.btnResetRole.click();
	}

	// click on Cancel Role button
	public void clickCancelRoleButton() {
		this.btnCancelRole.click();
	}

}
