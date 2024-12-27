package stepDef;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pageObjects.CreateAccount;

public class steps {
public WebDriver driver;
public CreateAccount lp;
public Actions A;

@Given("user Launch Chrome browser")
public void user_launch_chrome_browser() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	lp = new CreateAccount(driver);
	A=new Actions(driver);
   
	
}

@When("user open url {string}")
public void user_open_url(String url) {
   driver.get(url);
}

@Then("page Title should be {string}")
public void page_title_should_be(String title) {
	Assert.assertEquals(title, driver.getTitle());
}

@Then("user click Create an Account button")
public void user_click_create_an_account_button() {
	lp.Click_Create_btn();
}

@When("the user enters valid first name, last name, email, and password")
public void the_user_enters_valid_first_name_last_name_email_and_password() {
lp.First_name("venky");
lp.Last_name("b");
lp.EmailAddress("vllo56kllbv@gmail.com");
lp.password("Bla@1523");
lp.conf_pwd("Bla@1523");
  
}



@When("clicks the Create an Account button")
public void clicks_the_create_an_account_button() {
  lp.btnCreateAccount();
}

@When("the user should see a success message {string}")
public void the_user_should_see_a_success_message(String message) {
	
	
	String conf = driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']")).getText();
	
	Assert.assertEquals(message, conf);
    
}


@Then("Click on singOut button")
public void click_on_sing_out_button() throws InterruptedException {
	Thread.sleep(2000);
	 A.moveToElement(driver.findElement(By.xpath("//button[@type='button' and @class='action switch' and @data-action='customer-menu-toggle']"))).click().perform();
	 
    lp.ClickSignOut();
    driver.close();
}



@When("Click on SingIn option")
public void click_on_sing_in_option() {
	lp.ClickSignIn();
  
}
@Then("User enter Email and Password")
public void user_enter_email_and_password() {
	
	lp.setUesr("venkk@gmail.com");
	lp.setPassword("Bca@1243");
   
}

@Then("Click on SingIn")
public void click_on_sing_in() {
	
	lp.btn_Signin();
  
}

}
