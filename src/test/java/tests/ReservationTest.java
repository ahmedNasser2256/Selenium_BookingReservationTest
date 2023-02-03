package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import pages.HomePage;
import pages.HotelDetailsPage;

public class ReservationTest extends TestBase{

	HomePage homeobject;
	HotelDetailsPage detailsPageObject;

	
	@Test
	public void userSearch() throws InterruptedException
	{
		
		homeobject = new HomePage(driver);
		

		homeobject.userSearchforDestination("Alexandria");
		//Assert the navigate to correct page
		Assert.assertTrue(homeobject.searchResultElement.getText().contains("Alexandria"));
		
		
		System.out.println(homeobject.hotelNameElement.getText());
		String hotelNameAssertionString = homeobject.hotelNameElement.getText();
		homeobject.clickOnSeeAvailablity();
		
		detailsPageObject = new HotelDetailsPage(driver);
		
		for(String windowIDString : driver.getWindowHandles()) 
		{
			String titleString = driver.switchTo().window(windowIDString).getTitle();
			if (titleString.equals(hotelNameAssertionString)) 
			{
				assertEquals(hotelNameAssertionString, driver.getTitle());
				detailsPageObject.userClickOnIWillReserve();
				assertTrue(detailsPageObject.bedPreferencElement.isSelected());
				Assert.assertEquals(detailsPageObject.checkinDatElement, "Sat, Apr 1, 2023");
				Assert.assertEquals(detailsPageObject.checkinDatElement, "Sat, Apr 14, 2023");

			}
			
			
		}
		
		

		
	}
	
	
}
