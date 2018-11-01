package in.srssprojects.kexim_bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage {
	// new employee button

	@FindBy(id = "BtnNew")
	private WebElement btnNewEmp;

	// click on New Employee button
	public void clickNewEmpButton() {
		this.btnNewEmp.click();
	}
}
