package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends TestBase{


	   WebDriver driver;
	  
	   public NewAccountPage(WebDriver driver) {
	    this.driver = driver;
	   }
	   @FindBy(how = How.XPATH, using = "//div[@id='wrapper']/nav/div/ul/li[10]/a/span[1]")WebElement BankAndCash;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")WebElement NewAccount;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement AccountTitle;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")WebElement Description;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")WebElement InitialBalance;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")WebElement AccountNumber;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")WebElement ContactPerson;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")WebElement Phone;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")WebElement InternetBankingUrl;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")WebElement SubmitButton;
	   @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")WebElement SuccessAlert;
	   

	   public void clickBankAndCash() {
		   BankAndCash.click();
	   }
	   
	   public void clickNewAccount() {
		   NewAccount.click();
	   }
	   
	   public void enterAccountTitle(String accountTitle) {
		   AccountTitle.sendKeys(accountTitle + randNum());
	   }
	   
	   public void enterDescription(String description) {
		   Description.sendKeys(description);
	   }
	   
	   public void enterInitialBalance(String initialBalance) {
		   InitialBalance.sendKeys(initialBalance);
	   }
	   
	   public void enterAccountNumber(String accountNumber) {
		   AccountNumber.sendKeys(accountNumber);
	   }
	   
	   public void enterContactPerson(String contactPerson) {
		   ContactPerson.sendKeys(contactPerson);
	   }
	   
	   public void enterPhone(String phone) {
		   Phone.sendKeys(phone);
	   }
	   
	   public void enterInternetBankingUrl(String internetBankingUrl) {
		   InternetBankingUrl.sendKeys(internetBankingUrl);
	   }
	   
	   public void clickSubmitButton() {
		   SubmitButton.click();
	   }

	   public String getSuccessAlert() {
		   System.out.println(SuccessAlert.getText());
		   return SuccessAlert.getText();
	   }























}


















