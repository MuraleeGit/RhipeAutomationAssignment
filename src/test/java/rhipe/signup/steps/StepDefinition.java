package rhipe.signup.steps;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import rhipe.signup.library.GetConfigProperties;
import rhipe.signup.library.SetDrivers;
import rhipe.signup.pagefactory.RhipeSignUpPageFactory;
import rhipe.signup.pages.RhipeSignUpPage;

public class StepDefinition {

	public static Logger log = LogManager.getLogger(StepDefinition.class.getName());

	/*
	 * Constructor declaration
	 * 
	 */
	public StepDefinition() {

	}

	WebDriver driver;
	RhipeSignUpPageFactory rhipeSignUpPageFactory;
	RhipeSignUpPage rhipeSignUpPage;

	@Steps
	GetConfigProperties getProps = new GetConfigProperties();
	SetDrivers setDrivers = new SetDrivers();
	Properties prop = new Properties();

	/*
	 * This method initializes the webdriver and login in to rhipe sign up page
	 * 
	 * 
	 */
	@Before
	public void init() {
		prop = getProps.getConfigProperty();
		String runEnv = System.getProperty("runEnv");
		driver = setDrivers.setDrivers(runEnv);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Rhipe Page initialization");
	}

	@Given("^I am on sign up with Rhipe page$")
	public void i_am_on_sign_up_with_Rhipe_page() {
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("I am in Sign Up with Rhipe page");
	}

	@When("^I enter general information details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")

	public void i_enter_general_information_details(String customerName, String regNumber, String addressLine1,
			String addressLine2, String line3, String city, String state, String country, String postCode,
			String mainPhone, String fax, String website, String email, String source, String industryType) {

		rhipeSignUpPage = new RhipeSignUpPage(driver);
		rhipeSignUpPage.enterGeneralInformation(customerName, regNumber, addressLine1, addressLine2, line3, city, state,
				country, postCode, mainPhone, fax, website, email, source, industryType);
		log.info("Entering General information");
	}

	@And("^I enter authorized signatory contact information details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_authorized_signatory_contact_information_details(String firstName, String lastName,
			String directPhone, String jobTitle, String primaryContactEmail) throws InterruptedException {
		rhipeSignUpPage.enterSignatoryContact(firstName, lastName, directPhone, jobTitle, primaryContactEmail);
		log.info("Entering authorised signatory contact information");
	}

	@After
	public void quitBrowsers() {
		driver.quit();
		log.info("Quit Browser");
	}

}
