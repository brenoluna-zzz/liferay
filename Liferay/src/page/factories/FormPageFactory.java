package page.factories;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPageFactory {

	WebDriver driver;
	List<WebElement> formFields;

	// Page Elements to find
	@FindBy(xpath = "//input[contains(@id, 'Qual…SeuNome')]")
	WebElement nameField;

	@FindBy(xpath = "//input[contains(@name, 'Qual…ADataDoSeuNascimento')]/preceding-sibling::input")
	WebElement dobField;

	@FindBy(xpath = "//textarea[contains(@id, 'PorqueVocÍIngressouNa¡reaDeTestes')]")
	WebElement textArea;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	// Page Factory Constructor
	public FormPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initializes the WebElements in this class

		formFields = new ArrayList<WebElement>();
		formFields.add(nameField);
		formFields.add(dobField);
		formFields.add(textArea);
	}

	// Page Elements' methods
	public void setNameField(String name) {
		nameField.sendKeys(name);
	}

	public void setDobField(String dob) {
		dobField.sendKeys(dob);
	}

	public void setTextArea(String text) {
		textArea.sendKeys(text);
	}

	public void clickSubmitBtn() {
		submitBtn.click();
	}

	public List<WebElement> getFormFields() {
		return formFields;
	}
}
