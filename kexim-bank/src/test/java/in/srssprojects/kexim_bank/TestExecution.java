package in.srssprojects.kexim_bank;

import org.testng.annotations.Test;

public class TestExecution extends BaseClass{
	BankHomePage bankHomePageObj;
	AdminHomePage adminHomePageObj;
	BranchDetialsPage branchDetailsPageObj;

	
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
		branchDetailsPageObj.clickNewBranchButton();
//		click on new branch button in branch details page
//		fill a form in branch creation page
//		click on submit in branch creation page
	}
	
	@Test(priority = 2)
	public void tearDown() {
		closeBrowser();
	}

	

}
