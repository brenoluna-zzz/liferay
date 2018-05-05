package page.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPageFactory {

	WebDriver driver;
	
	public FormPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initializes the WebElements in this class
	}
	
	// Page Elements
	@FindBy(id="_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$Qual…SeuNome$RTcoaxkf$0$$en_US")
	WebElement nameField;
	
	@FindBy(xpath="//div[@id='yui_patched_v3_18_1_1_1525541902199_1271']//input")
	WebElement dobField;
	
	@FindBy(id="_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$PorqueVocÍIngressouNa¡reaDeTestes$htHBdPf1$0$$en_US")
	WebElement textArea;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	
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
	
	public boolean hasErrorMsg(WebElement element) {
		WebElement errorMsg = element.findElement(By.xpath("ancestor::div[constains(@class,'input-group')]/following-sibling::div[contains(text(), 'This field is required.')]"));
		
		if(errorMsg == null) return false;
		return true;
	}
}
