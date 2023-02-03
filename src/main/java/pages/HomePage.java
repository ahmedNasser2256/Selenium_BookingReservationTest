package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//input[@name='ss']")
	WebElement destination;
	
	@FindBy (xpath = "//span[@class='b6dc9a9e69 a804864eef e6c50852bd b8c9de5937']")
	WebElement calendar;
	
	@FindBy (xpath = "//span[@data-date='2023-04-01']")
	WebElement firstdate;
	
	@FindBy (xpath = "//span[@data-date='2023-04-14']")
	WebElement seconddate;
	
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement search;
	
	@FindBy (xpath = "//div[@class=\"efdb2b543b\"]/h1[@class=\"e1f827110f d3a14d00da\"]")
	public WebElement searchResultElement;
	
	@FindBy (xpath = "//button[@class=\"fc63351294 a822bdf511 e3c025e003 fa565176a8 cfb238afa1 ae1678b153 c9fa5fc96d be298b15fa\"]")
	public WebElement navegateBetweenDates;
	
	@FindBy(xpath = "(//div[@data-testid=\"title\"])[2]")
	public WebElement hotelNameElement;
	
	@FindBy(xpath = "(//span[@class=\"e57ffa4eb5\"])[5]")
	public WebElement selectThirdElement;
	

	
	@FindBy(xpath = "(//h2[@class=\"d2fee87262 pp-header__title\"]")
	public WebElement seconedHotelDetailsPagElement1;
	
	
	
	
	
	public void userSearchforDestination( String location) throws InterruptedException
	
	{
		
		destination.sendKeys(location);
		calendar.click();
		Thread.sleep(1000);
		navegateBetweenDates.click();
		navegateBetweenDates.click();
		navegateBetweenDates.click();
		navegateBetweenDates.click();
		Thread.sleep(3000);
		firstdate.click();
		seconddate.click();
		search.click();
		System.out.println(searchResultElement.getText());
		

	}
	
	
	
	
	public void clickOnSeeAvailablity() throws InterruptedException {
		selectThirdElement.click();
		Thread.sleep(3000);
		
	}
	
	

}
