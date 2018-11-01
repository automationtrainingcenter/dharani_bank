package in.srssprojects.kexim_bank;

public class RoleDetailsPage {

	// new role button
	@FindBy(id = "btnRoles")
	private WebElement btnCreateRole;

	// click on New Role button
	public void clickNewRoleButton() {
		this.btnCreateRole.click();
	}

}
