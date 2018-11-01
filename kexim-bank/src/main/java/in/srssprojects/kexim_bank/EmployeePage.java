package in.srssprojects.kexim_bank;

public class EmployeePage {
	// new employee button

	@FindBy(id = "BtnNew")
	private WebElement btnNewEmp;

	// click on New Employee button
	public void clickNewEmpButton() {
		this.btnNewEmp.click();
	}
}
