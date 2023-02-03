package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelDetailsPage extends PageBase {

	public HotelDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy (xpath = "//input [@name=\"bedPreference_868621005\"][@value=\"1\"]")
	public WebElement bedPreferencElement;
	
	@FindBy (id = "hprt_nos_select_1614813_361021222_0_1_0")
	WebElement noOfRoomsElement;
	
	@FindBy (id = "b_tt_holder_1")
	WebElement iWillReservebuttonElement;
	
	@FindBy (xpath = "(//span[@class='bui-date__title'])[1]")
	public WebElement checkinDatElement;
	
	@FindBy (xpath = "(//span[@class='bui-date__title'])[2]")
	public WebElement checkOutElement;
	
	
	Select Rooms = new Select(noOfRoomsElement);
	
	
	public void userClickOnIWillReserve () 
	{
		bedPreferencElement.click();;
		Rooms.selectByValue("1");
		iWillReservebuttonElement.click();
		
	}

}
