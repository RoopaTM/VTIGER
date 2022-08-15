package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This POM Class used for OrganizationPage
 * @author CHANDAN KUMARa
 *
 */
public class OrganizationPage {
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrganizationtn;

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement organizationSearchTxt;

	@FindBy(xpath = "//select[@id='bas_searchfield']")
	private WebElement colunameDropDown;

	
	
	@FindBy(xpath = "//table[@class='lvt small']//td/input[@id='selectCurrentPageRec']")
	private WebElement selectOrganization;

	@FindBy(xpath = "//td/span[.='Search']/ancestor::td/following-sibling::td/input[@value=' Search Now ']")
	private WebElement searchNowBtn;
	
	@FindBy(xpath = "//font[.='Filters :']/ancestor::table/following-sibling::table[2]//input[@value='Delete']")
	private WebElement deleteBtn;
	


	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createNewOrganization() {
		createNewOrganizationtn.click();
	}

	public void organizationSearchTxt(String orgname) {
		organizationSearchTxt.sendKeys(orgname);
	}

	
	public void searchNowBtn() {
		searchNowBtn.click();
	}
	
	public void deleteBtn() {
		deleteBtn.click();
	}
	
	public void selectOrganization() {
		selectOrganization.click();
	}



}
