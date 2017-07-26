package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {

	WebDriver driver=null;
	
	@Given("^user opens sephora application$")
	public void user_opens_sephora_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/Software/chromedriver.exe");
        driver = new ChromeDriver();

	    driver.get("http://m-qa.sephora.com/");
	}

	@Then("^user clicks on left nav$")
	public void user_clicks_on_left_nav() throws Throwable {
	    driver.findElement(By.xpath("//div[@data-comp='LeftNav Flex Base']/button")).click();
	}

	@Then("^user opens sign in page$")
	public void user_opens_sign_in_page() throws Throwable {
	    driver.findElement(By.xpath("//button[@data-at='sign_in']")).click();
	}

	@Then("^user enters login id$")
	public void user_enters_login_id() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='signin_username']")).sendKeys("testbday@com.com");
	}

	@Then("^user enters paasword$")
	public void user_enters_paasword() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='signin_password']")).sendKeys("123456");
	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
	    driver.findElement(By.xpath("//button[@data-comp='ButtonPrimary Button Base']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   driver.quit();
	}


}
