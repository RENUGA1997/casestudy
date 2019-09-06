package launch.renucasest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class copy2 {
	WebDriver driver;
	@Given("the browser is launched")
public void the_browser_is_launched1() {
	System.setProperty("webdriver.chrome.driver","C:\\ren\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/");
   
}
@Given("the login page is displayed")
public void the_login_page_is_displayed() {
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	
}

@When("the user enters username {string}")
public void the_user_enters_usernam(String x) {
driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(x);
}

@When("the user enters the password {string}")
public void the_user_enters_the_passwor(String y) {
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(y);
}

@When("click on login button")
public void click_on_login_button() {
driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}

}