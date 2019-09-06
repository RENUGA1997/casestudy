package launch.renucasest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class details {
WebDriver driver;
@Given("the browse is launched and opening testme app")
public void the_browse_is_launched_and_opening_testme_app() {
	System.setProperty("webdriver.chrome.driver","C:\\ren\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/");
    
}

@When("the user enters the {string}")
public void the_user_enters_the(String str1) {
	 driver.findElement(By.id("myInput")).sendKeys(str1);
	 driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
}

@When("the user add the product to cart")
public void the_user_add_the_product_to_cart() {
	String strin=driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(1) > center:nth-child(1) > h4")).getText();
    System.out.println(strin);
	if(strin.equalsIgnoreCase("Headphone"))
	{
    	System.out.println("\n Success!!! \n");
    	driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	    driver.findElement(By.partialLinkText("Cart")).click();
	    driver.findElement(By.partialLinkText("Checkout")).click();
	    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div")).click();
}



}
}
