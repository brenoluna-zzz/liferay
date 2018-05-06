package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.factories.FormPageFactory;

public class TestingSteps {
	static WebDriver driver;
	FormPageFactory formPage;

	@Given("^User is on Liferay form page$")
	public void user_is_on_Liferay_form_page() {
		// Initializes WebDriver and page factory objects
		driver = new ChromeDriver();
		formPage = new FormPageFactory(driver);

		String baseUrl = "https://forms.liferay.com/web/forms/shared/-/form/372406";
		// Manages browser window and loading timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Requests web page
		driver.get(baseUrl);
	}

	@When("^User fills the name field$")
	public void user_fills_the_name_field() {
		formPage.setNameField("John Doe");
	}

	@When("^User fills the date of birth field with valid value$")
	public void user_fills_the_date_of_birth_field_with_valid_value() {
		formPage.setDobField("01/13/1990");
		// Clicks out of the field to dismiss UI calendar
		driver.findElement(By.xpath("//div[contains(@class, 'lfr-ddm-form-page')]")).click();
	}

	@When("^User fills the text area$")
	public void user_fills_the_text_area() {
		formPage.setTextArea("Lorem ipsum dolor sit amet, vix stet eloquentiam ut.");
	}

	@When("^User fills all fields with valid values$")
	public void user_fills_all_fields_with_valid_values() {
		user_fills_the_name_field();
		user_fills_the_date_of_birth_field_with_valid_value();
		user_fills_the_text_area();
	}

	@When("^User clicks the submit button$")
	public void user_click_submits_button() throws InterruptedException {
		Thread.sleep(1500);
		formPage.clickSubmitBtn();
	}

	@Then("^Error message is displayed under (?:any empty input|all inputs)$")
	public void error_message_is_displayed_under_any_empty_input() {
		int expected = 0;
		// Calculates the amount of empty fields
		for (WebElement inputField : formPage.getFormFields()) {
			if (inputField.getAttribute("value").equals(""))
				expected++;
		}
		// Gets the amount of error messages
		int actual = driver.findElements(By.xpath("//div[contains(text(), 'This field is required.')]")).size();

		System.out.println("exp.: " + expected + ", act.: " + actual);

		// Assert the amount of empty fields is equal to the amount of error messages
		Assert.assertEquals(expected, actual);
	}

	@Then("^Text \"([^\"]*)\" is on the form$")
	public void defined_text_is_on_the_form(String text) {
		driver.findElement(By.xpath("//div[contains(@class, 'lfr-ddm-form-page')]")).getText().contains(text);
	}

	@Then("^User is redirected to success page$")
	public void user_is_redirected_to_success_page() throws InterruptedException {
		Thread.sleep(2500);

		driver.findElement(By.xpath("//h1[contains(text(), 'Informações enviadas')]"));
	}

	@Then("^Browser is closed$")
	public void browser_is_closed() throws InterruptedException {
		Thread.sleep(1500);
		driver.quit();
	}
}
