package rhipe.signup.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Global file for locating the elements for Rhipe Sign Up Page
 * 
 * @author Muralee
 *
 */
public class RhipeSignUpPageFactory {

	@FindBy(id = "CustomerName")
	public WebElement customerName;

	@FindBy(id = "RegistrationNumber")
	public WebElement registrationNumber;

	@FindBy(id = "Street1")
	public WebElement address1;

	@FindBy(id = "Street2")
	public WebElement address2;

	@FindBy(id = "Street3")
	public WebElement line3;

	@FindBy(id = "City")
	public WebElement city;

	@FindBy(id = "State")
	public WebElement state;

	@FindBy(id = "Country")
	public WebElement country;

	@FindBy(id = "Postcode")
	public WebElement postCode;

	@FindBy(id = "MainPhone")
	public WebElement mainPhone;

	@FindBy(id = "Fax")
	public WebElement fax;

	@FindBy(id = "WebUrl")
	public WebElement webUrl;

	@FindBy(id = "Email")
	public WebElement email;

	@FindBy(id = "Source")
	public WebElement source;

	@FindBy(id = "IndustryType")
	public WebElement industryType;

	@FindBy(id = "PrimaryContactFirstName")
	public WebElement firstName;

	@FindBy(id = "PrimaryContactLastName")
	public WebElement lastName;

	@FindBy(id = "PrimaryContactPhone")
	public WebElement directPhone;

	@FindBy(id = "PrimaryContactJobTitle")
	public WebElement jobTitle;

	@FindBy(id = "PrimaryContactEmail")
	public WebElement primaryContactEmail;

}
