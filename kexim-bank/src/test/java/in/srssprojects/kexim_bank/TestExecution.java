package in.srssprojects.kexim_bank;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass{
	BankHomePage bankHomePageObj;
	AdminHomePage adminHomePageObj;
	BranchDetialsPage branchDetailsPageObj;
	BranchCreationPage branchCreationPageObj;
	Alert alert;

	
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
//		click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
//		click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
//		fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
//		click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test(priority = 3)
	public void branchCreationWithDuplicatedata() {
//		click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
//		click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
//		fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
//		click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test(priority = 4)
	public void branchCreationWithBlankData() {
//		click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
//		click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
//		click on submit in branch creation page
		alert = branchCreationPageObj.clickSubmitButton();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test(priority = 5)
	public void branchCreationReset() {
//		click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
//		click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
//		fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
//		click on submit in branch creation page
		branchCreationPageObj.clickResetButton();
		
	}
	
	@Test(priority = 6)
	public void branchCreationCancel() {
//		click on brnaches button in admin home page
		branchDetailsPageObj = adminHomePageObj.clickBranches();
//		click on new branch button in branch details page
		branchCreationPageObj = branchDetailsPageObj.clickNewBranchButton();
//		fill a form in branch creation page
		branchCreationPageObj.fillBranchCreationForm("branchNameBranch", "addresss", "43211", "INDIA", "GOA", "GOA");
//		click on submit in branch creation page
		branchCreationPageObj.clickCancelButton();
	}
	
	
	@Test(priority = 20)
	public void tearDown() {
		closeBrowser();
	}

	

}
