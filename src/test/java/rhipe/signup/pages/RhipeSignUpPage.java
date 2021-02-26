package rhipe.signup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import rhipe.signup.pagefactory.RhipeSignUpPageFactory;

public class RhipeSignUpPage {

	WebDriver driver = null;
	private RhipeSignUpPageFactory pageFactory;

	/*
	 * Constructor declaration
	 * 
	 * 
	 */
	public RhipeSignUpPage() {

	}

	/*
	 * This method initializes the Webdriver
	 * 
	 * 
	 * 
	 */
	public RhipeSignUpPage(WebDriver driver) {

		this.driver = driver;
		pageFactory = PageFactory.initElements(driver, RhipeSignUpPageFactory.class);

	}

	/*
	 * This method selects the values and enter the values on rhipe signup page.
	 * 
	 * 
	 */

	public void enterGeneralInformation(String customerName, String regNumber, String addressLine1, String addressLine2,
			String line3, String city, String state, String country, String postCode, String mainPhone, String fax,
			String website, String email, String source, String industryType) {

		pageFactory.customerName.sendKeys(customerName);
		pageFactory.registrationNumber.sendKeys(regNumber);
		pageFactory.address1.sendKeys(addressLine1);
		pageFactory.address2.sendKeys(addressLine2);
		pageFactory.line3.sendKeys(line3);
		pageFactory.city.sendKeys(city);
		pageFactory.state.sendKeys(state);
		Select selectCountry = new Select(pageFactory.country);
		selectCountry.selectByVisibleText(country);
		pageFactory.postCode.sendKeys(postCode);
		pageFactory.mainPhone.sendKeys(mainPhone);
		pageFactory.fax.sendKeys(fax);
		pageFactory.webUrl.sendKeys(website);
		pageFactory.email.sendKeys(email);
		Select selectSource = new Select(pageFactory.source);
		selectSource.selectByVisibleText(source);
		Select selectIndustryType = new Select(pageFactory.industryType);
		selectIndustryType.selectByVisibleText(industryType);

	}

	public void enterSignatoryContact(String firstName, String lastName, String directPhone, String jobTitle,
			String primaryContactEmail) {
		pageFactory.firstName.sendKeys(firstName);
		pageFactory.lastName.sendKeys(lastName);
		pageFactory.directPhone.sendKeys(directPhone);
		pageFactory.jobTitle.sendKeys(jobTitle);
		pageFactory.primaryContactEmail.sendKeys(primaryContactEmail);
	}

}
