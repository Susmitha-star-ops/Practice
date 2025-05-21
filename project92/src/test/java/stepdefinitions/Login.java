package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver driver;

	@Given("User should be in google search page")
	public void user_should_be_in_google_search_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	@When("User enters sample test and submit")
	public void user_enters_sample_test_and_submit() {
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).submit();
	}

	@Then("User should get search reults")
	public void user_should_get_search_reults() {
		if (driver.getTitle().contains("selenium")) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}

}
