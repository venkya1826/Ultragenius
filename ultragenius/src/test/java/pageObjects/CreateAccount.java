package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	public WebDriver driver;
	
	public CreateAccount(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[text()='Create an Account']")
	WebElement btn_Create;
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	WebElement First_Name;
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	WebElement last_Name;
	
	@FindBy(xpath="//input[@id=\"email_address\"]")
	 WebElement Email_addres;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement Pwd;
	
	@FindBy(xpath="//input[@id=\"password-confirmation\"]")
	WebElement con_pwd;
	
	@FindBy(xpath="//span[text()='Create an Account']")
	WebElement btn_c_account;
	
	@FindBy(xpath="//a[normalize-space(text())='Sign Out']")
	WebElement btn_sign_out;
	
	@FindBy(xpath="//a[normalize-space(text())='Sign In']")
	WebElement btn_sing_in;
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@title=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement btn_singIn;
	
	
	public void Click_Create_btn() {
		
		btn_Create.click();
	}
	
	public void First_name(String Fname) {
		
		First_Name.sendKeys(Fname);
	}
   public void Last_name(String Lname) {
		
	   last_Name.sendKeys(Lname);
	}
   public void EmailAddress(String email) {
	
	   Email_addres.sendKeys(email);
   }
   
   public void password(String pwd) {
	   Pwd.sendKeys(pwd);
   }
	
   public void  conf_pwd(String pwd) {
	   con_pwd.sendKeys(pwd);
   }
   
   public void btnCreateAccount() {
	   btn_c_account.click();
   }
   
   public void ClickSignOut() {
	   btn_sign_out.click();
   }
	
   public void  ClickSignIn() {
	   btn_sing_in.click();
   }
   
   public void setUesr(String user) {
	   username.sendKeys(user);
	   
   }
   
   public void setPassword(String pwd) {
	   
	password.sendKeys(pwd);
   }
   
   public void btn_Signin() {
	   btn_singIn.click();
   }
	
	
	
	
	
	
	
}
