package in.srssprojects.kexim_bank;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass {
	BankHomePage bankHomePageObj;
	AdminHomePage adminHomePageObj;
	BranchDetialsPage branchDetailsPageObj;
	BranchCreationPage branchCreationPageObj;
	Alert alert;
	RoleDetailsPage roleDetailsPageObj;
	RoleCreationPage roleCreationPageObj;
	EmployeePage empPageObj;
	EmployeeCreationPage empCreationPageObj;

	@Test(priority = 0)
	public void setup() {
		launchBrowser();
		bankHomePageObj = new BankHomePage(driver);

	}

	@Test(priority = 1)
	public void loginTest() {
		bankHomePageObj.fillUserName("Admin");
		bankHomePageObj.fillPassword("Admin");
		adminHomePageObj = bankHomePageObj.clickLogin();
	}

	@Test(priority = 2)
	public void branchCreation() {
		// click on branches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
		// click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
		// fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
		// click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test(priority = 3)
	public void branchCreationWithDuplicatedata() {
		// click on branches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
		// click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
		// fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
		// click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test(priority = 4)
	public void branchCreationWithBlankData() {
		// click on branches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
		// click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
		// click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test(priority = 5)
	public void branchCreationReset() {
		// click on branches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
		// click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
		// fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
		// click on submit in branch creation page
		branchCreationPageObj.clickResetButton();

	}

	@Test(priority = 6)
	public void branchCreationCancel() {
		// click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
		// click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
		// fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
		// click on submit in branch creation page
		branchCreationPageObj.clickCancelButton();
	}

	// For Role Creation page

	@Test(priority = 7)
	public void roleCreation() {
		// click on Roles button in admin home page
		roleDetailsPageObj = adminHomePageObj.clickRoles();
		// click on new role button in roles details page
		roleCreationPageObj = roleDetailsPageObj.clickNewRoleButton();
		// fill a form in Role creation page
		roleCreationPageObj.fillformRoleCreation("Rolenamew", "E");
		// click on submit in Role creation page
		alert = roleCreationPageObj.clickInsertRoleButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();

	}

	@Test(priority = 8)
	public void roleCreationWithDuplicate() {
		// click on Roles button in admin home page
		roleDetailsPageObj = adminHomePageObj.clickRoles();
		// click on new role button in roles details page
		roleCreationPageObj = roleDetailsPageObj.clickNewRoleButton();
		// fill a form in Role creation page
		roleCreationPageObj.fillformRoleCreation("Rolenamew", "E");
		// click on submit in Role creation page
		alert = roleCreationPageObj.clickInsertRoleButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();
	}

	@Test(priority = 9)
	public void roleCreationWithBlank() {
		// click on Roles button in admin home page
		roleDetailsPageObj = adminHomePageObj.clickRoles();
		// click on new role button in roles details page
		roleCreationPageObj = roleDetailsPageObj.clickNewRoleButton();
		// click on submit in Role creation page
		alert = roleCreationPageObj.clickInsertRoleButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();
	}

	@Test(priority = 10)
	public void roleCreationReset() {
		// click on Roles button in admin home page
		roleDetailsPageObj = adminHomePageObj.clickRoles();
		// click on new role button in roles details page
		roleCreationPageObj = roleDetailsPageObj.clickNewRoleButton();
		// fill a form in Role creation page
		roleCreationPageObj.fillformRoleCreation("Rolenamew", "E");
		// click on reset in Role creation page
		roleCreationPageObj.clickResetRoleButton();

	}

	@Test(priority = 11)
	public void roleCreationCancel() {
		// click on Roles button in admin home page
		roleDetailsPageObj = adminHomePageObj.clickRoles();
		// click on new role button in roles details page
		roleCreationPageObj = roleDetailsPageObj.clickNewRoleButton();
		// fill a form in Role creation page
		roleCreationPageObj.fillformRoleCreation("Rolenamew", "E");
		// click cancel in Role creation page
		roleCreationPageObj.clickCancelRoleButton();

	}

	// for Employee creation

	@Test(priority = 12)
	public void empCreation() {

//	click on emp button in admin home page
		empPageObj = adminHomePageObj.clickEmployees();
//	click on new emp button in emp details page
		empCreationPageObj = empPageObj.clickNewEmpButton();
//	fill a form in emp creation page
		empCreationPageObj.fillEmployeeDetails("david", "password", "manager", "ABranch1");
//	click on submit in emp creation page
		alert = empCreationPageObj.clickSubmitEmpButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();

	}

	@Test(priority = 13)
	public void empCreationWithDuplicate() {
//		click on emp button in admin home page
		empPageObj = adminHomePageObj.clickEmployees();
//		click on new emp button in emp details page
		empCreationPageObj = empPageObj.clickNewEmpButton();
//		fill a form in emp creation page
		empCreationPageObj.fillEmployeeDetails("david", "password", "manager", "ABranch1");
//		click on submit in emp creation page
		alert = empCreationPageObj.clickSubmitEmpButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();

	}

	@Test(priority = 14)
	public void empCreationWithBlank() {
//		click on emp button in admin home page
		empPageObj = adminHomePageObj.clickEmployees();
//		click on new emp button in emp details page
		empCreationPageObj = empPageObj.clickNewEmpButton();
//		click on submit in emp creation page
		alert = empCreationPageObj.clickSubmitEmpButton();
		System.out.println(alert.getText());
		// handle alert
		alert.accept();

	}

	@Test(priority = 15)
	public void empCreationReset() {
//		click on emp button in admin home page
		empPageObj = adminHomePageObj.clickEmployees();
//		click on new emp button in emp details page
		empCreationPageObj = empPageObj.clickNewEmpButton();
//			fill a form in emp creation page
		empCreationPageObj.fillEmployeeDetails("david", "password", "manager", "ABranch1");
//		click on reset in emp creation page
		empCreationPageObj.clickResetEmpButton();

	}

	@Test(priority = 16)
	public void empCreationCancel() {
//		click on emp button in admin home page
		empPageObj = adminHomePageObj.clickEmployees();
//		click on new emp button in emp details page
		empCreationPageObj = empPageObj.clickNewEmpButton();
//			fill a form in emp creation page
		empCreationPageObj.fillEmployeeDetails("david", "password", "manager", "ABranch1");
//		click on cancel in emp creation page
		empCreationPageObj.clickCancelEmpButton();

	}

	@Test(priority = 20)
	public void tearDown() {
		closeBrowser();
	}

}
