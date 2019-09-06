package launch.renucasest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class copyclass {
WebDriver driver;
	@Given("the browser is launched")
	public void the_browser_is_launched() {
		System.setProperty("webdriver.chrome.driver","C:\\ren\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		
	}

	@When("the user {string} enter his user name")
	public void the_user_enter_his_user_name(String a) {
		driver.findElement(By.id("userName")).sendKeys(a);
		  
	   
	}

	@When("he enters his firstname {string}")
	public void he_enters_his_firstname(String b) {
		 driver.findElement(By.id("firstName")).sendKeys(b);
	}

	@When("he enters his lastname {string}")
	public void he_enters_his_lastname(String c) {
		 driver.findElement(By.id("lastName")).sendKeys(c);
	}

	@When("he enters his  password{string}")
	public void he_enters_his_password(String d) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(d);
	}

	@When("he enters his  confirms pass{string}")
	public void he_enters_his_confirms_pass(String e) {
		 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(e);
	}
	@When("he enters his gender")
	public void he_enters_his_gender() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}


	
	@When("he enters his email {string}")
	public void he_enters_his_email(String g) {
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(g);
	}

	@When("he enters his mobileno {string}")
	public void he_enters_his_mobileno(String h) {
		 driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(h);
	}

	@When("he enters his dob {string}")
	public void he_enters_his_dob(String i) {
		 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(i);
	}

	@When("he enters his address {string}")
	public void he_enters_his_address(String j) {
		 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(j);
	}

	@When("he enters his question {string}")
	public void he_enters_his_question(String k) {
		 driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).sendKeys(k);
	}

	@When("he enters his answer {string}")
	public void he_enters_his_answer(String l) {
		 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(l);
	}

	@Then("he clicks on register button")
	public void he_clicks_on_register_button() {
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("the login page is displayed")
	public void the_User_is_successfully_registered() {
		
	  
	}
}