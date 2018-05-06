package tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/feature", glue = { "stepdefinition" })

public class TestRun {	

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}

}
