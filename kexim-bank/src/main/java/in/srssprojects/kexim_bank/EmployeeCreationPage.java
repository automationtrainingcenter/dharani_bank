package in.srssprojects.kexim_bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreationPage {

	// employee name field
	@FindBy(id = "txtUname")
	private WebElement txtEmpName;

	// employee password field
	@FindBy(id = "txtLpwd")
	private WebElement txtLoginPsw;

	// role type select
	@FindBy(id = "lst_Roles")
	private WebElement lstRole;

	// branch name select
	@FindBy(id = "lst_Branch")
	private WebElement lstBranch;

	// submit button
	@FindBy(id = "BtnSubmit")
	private WebElement btnSubmitEmp;

	// reset button
	@FindBy(id = "btnreset")
	private WebElement btnResetEmp;

	// cancel button
	@FindBy(id = "btnCancel")
	private WebElement btnCancelEmp;

	// select Role type
	public void selectRoleType(String strRoleTypeValue) {
		new Select(this.lstRole).selectByVisibleText(strRoleTypeValue);
	}

	// select Branch
	public void selectBranch(String strBranchValue) {
		new Select(this.lstBranch).selectByVisibleText(strBranchValue);
	}

	// click on submit Employee button
	public void clickSubmitEmpButton() {
		this.btnSubmitEmp.click();
	}

	// click on Reset Emp button
	public void clickResetEmpButton() {
		this.btnResetEmp.click();
	}

	// click on Cancel Emp button
	public void clickCancelEmpButton() {
		this.btnCancelEmp.click();
	}

}
