package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
/**
 * This POM Class used for CreateNewOrganizationPage
 * @author CHANDAN KUMARa
 *
 */

public class CreateNewOrganizationPage {
	
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationTxt;
	
	@FindBy(xpath = "//b[.='Organization Information']/ancestor::tr/preceding-sibling::tr//div//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@title='Cancel [Alt+X]']")
	private WebElement cancelbtn;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(name = "accounttype")
	private WebElement accounttypeDropDown;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']")
	private WebElement savedDropDown;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phnTextfld;
	
	
	/*@FindBy(how =How.ID_OR_NAME,id="Education")
	private WebElement industryDropDownByValue;*/
	
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
    public void enterTheOrganizationName(String organizationName ) {
    	organizationTxt.sendKeys(organizationName);
    }
    
    public void saveTheOrganization() {
    	saveBtn.click();
    }
    
    public void cancelbtn() {
    	cancelbtn.click();
    }
     public void phnTxtfld(String number) {
    	 phnTextfld.sendKeys(number);
     }
   
}
