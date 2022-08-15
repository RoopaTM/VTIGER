package com.StepDefiniton;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.vtiger.objectRepo.CreateNewOrganizationPage;
import com.vtiger.objectRepo.HomePage;
import com.vtiger.objectRepo.LoginPage;
import com.vtiger.objectRepo.OrganizationInformationPage;
import com.vtiger.objectRepo.OrganizationPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOrganizationTest 
{
	WebDriver driver;
	CreateNewOrganizationPage cnop;
	HomePage homepage ;
	//String name="chandana";


	@Given("lanuch the browser")
	public void lanuch_the_browser() {
	
	}

	@And("navigate the url {string}")
	public void navigate_the_url(String url) 
	{
		
	}
	@When("enter the userName {string} and password {string} and click on submit button")
	public void enter_the_user_name_and_password_and_click_on_submit_button(String userName, String password) {
		LoginPage login = new LoginPage(driver);
		login.loginAction(userName, password);
	}

	
	@When("Enter the Organization name and phonenumber")
	public void enter_the_organization_name_and_phonenumber(DataTable dataTable) {
	   List<String> data = dataTable.asList(String.class);
	   for(String np:data) {
		   homepage	= new HomePage(driver);
			homepage.homePageOrganizationAction();
			OrganizationPage organ = new OrganizationPage(driver);
			organ.createNewOrganization();
			Random ran = new Random();
			int num=ran.nextInt(1000);
			cnop = new CreateNewOrganizationPage(driver);
			cnop.enterTheOrganizationName(np+num);
			cnop.phnTxtfld(np);
		   
	   }
	}



//	@When("Enter the Organization name {string} and {string}")
//	public void enter_the_organization_name_and(String name, String number){
//		
//
////	}

	@When("click on the save")
	public void click_on_the_save() throws InterruptedException {
		cnop.saveTheOrganization();
		Thread.sleep(4000);
	}

	@When("validate the created Organization Name")
	public void validate_the_created_Organization_Name() {
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		System.out.println(oip.getcreatedOrgnizationName());

		//  Assert.assertTrue(orgsnizationName.contains(name));
	}

	@Then("logout the application")
	public void logout_the_application() {
		homepage.signOutIconMouseHoverAction(driver);
		
	}
	@When("click on the cancel")
	public void click_on_the_cancel() {
		cnop.cancelbtn();
	}


}
