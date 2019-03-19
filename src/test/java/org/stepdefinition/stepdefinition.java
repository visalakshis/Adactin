package org.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.cucumber.baseclass.BaseClass;
import org.junit.Assert;
import org.maven.pom.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pm = new PageObjectManager(driver);
	
	

	@Given("^User should launch the browser and navigate to application$")
	public void user_should_launch_the_browser_and_navigate_to_application() throws Throwable {

		//getUrl("https://adactin.com/HotelApp/index.php");
		getUrl("https://adactin.com/HotelAppBuild2/");

	}
	

	@When("^User should enter the username in the login page$")
	public void user_should_enter_the_username_in_the_login_page() throws Throwable {
		inputValue(pm.getLp().getUserInputField(), "LakshmiSri");

	}

	@When("^User should enter the password ih the login page$")
	public void user_should_enter_the_password_ih_the_login_page() throws Throwable {
		inputValue(pm.getLp().getPasswordInputField(), "password");

	}

	@When("^User click on the login button in the login page$")
	public void user_click_on_the_login_button_in_the_login_page() {

		elementClick(pm.getLp().getLoginBtn());

	}

	@When("^User Wait for '(.*)' seconds$")
	public void user_Wait_for_seconds(int arg1) throws InterruptedException {

		Thread.sleep(arg1 * 1000);
	}

	@When("^User click the logout button in homepage$")
	public void user_click_the_logout_button_in_homepage() {

		elementClick(pm.getLp().getLogoutbtn());

	}
	@When("^User should enter the Location using drop down$")
	public void user_should_enter_the_Location_using_drop_down() throws Throwable {
		selectValuesfromDD(pm.getSp().getLocation(), "index", "1");
	
	}
	@When("^User should enter the Location using drop down \"([^\"]*)\"$")
	public void user_should_enter_the_Location_using_drop_down(String arg1) throws Throwable {
	    selectValuesfromDD(pm.getSp().getLocation(), "index", arg1);
	}

	
	@When("^User should select the hotel using drop down$")
	public void user_should_select_the_hotel_using_drop_down() throws Throwable {
		selectValuesfromDD(pm.getSp().getHotels(), "index", "1");

	}

	@When("^User should select the room using drop down$")
	public void user_should_select_the_room_using_drop_down() throws Exception {
		selectValuesfromDD(pm.getSp().getRoomtype(), "index", "1");

	}

	@When("^User select the no of rooms$")
	public void user_select_the_no_of_rooms() throws Throwable {
		selectValuesfromDD(pm.getSp().getRoomsnos(), "index", "2");

	}

@When("^User select the no of rooms \"([^\"]*)\"$")
public void user_select_the_no_of_rooms(String arg1) throws Throwable {
	elementClick(pm.getSp().getRoomsnos());
	selectValuesfromDD(pm.getSp().getRoomsnos() , "index", arg1);
}

    


	@When("^User should select the (\\d+)rooms \"([^\"]*)\"$")
	public void user_should_select_the_rooms(int arg1, String arg2) throws Throwable {
	    String attribute = getAttribute(pm.getSH().getNoofroms());
	    Assert.assertEquals(attribute, arg1);
	    System.out.println(attribute);
	    
	}


@When("^User select the Check-in-date today date$")
public void user_select_the_Check_in_date_today_date() throws Throwable {
	inputValue(pm.getSp().getCheckin(), "17/4/2019");
    
}

@When("^User select the Checkout date today date$")
public void user_select_the_Checkout_date_today_date() throws Throwable {
	inputValue(pm.getSp().getCheckout(), "10/4/2019");
    
}


	@When("^User select the Adult room$")
	public void user_select_the_Adult_room() throws Throwable {
		selectValuesfromDD(pm.getSp().getAdultroom(), "index", "1");
	}




	@When("^User select the children room$")
	public void user_select_the_children_room() throws Exception {
		selectValuesfromDD(pm.getSp().getChildroom(), "index", "0");
	}

	
	@Then("^User should get error message if checkin date is previous date$")
	public void user_should_get_error_message_if_checkin_date_is_previous_date() throws Throwable {
	    String actual=getText(pm.getSp().getChecindateerrormsg());
	    Assert.assertEquals("Check-In Date shall be before than Check-Out Date", actual.trim());
	    System.out.println(actual);
	    
	}
	
	
	@Then("^User should get error message if checkout date is previous date$")
	public void user_should_get_error_message_if_checkout_date_is_previous_date() throws Throwable {
	    String actual=getText(pm.getSp().getCheckoutdateerrormsg());
	    Assert.assertEquals("Check-Out Date shall be after than Check-In Date", actual.trim());
	    System.out.println(actual);
	}
	@When("^User click on search button$")
	public void user_click_on_search_button() {
		elementClick(pm.getSp().getSearch());

	}
	@Then("^User should verify the Location same in next page using parameter \"([^\"]*)\"$")
	public void user_should_verify_the_Location_same_in_next_page_using_parameter(String arg1) throws Throwable {
		String attribute1 = getAttribute(pm.getSh().getHotellocation());
		   Assert.assertEquals(arg1, attribute1);
		   System.out.println(attribute1);
	}
	
	@When("^User select the Check-in-date as today date$")
	public void user_select_the_Check_in_date_as_today_date() throws Throwable {
	    inputValue(pm.getSp().getCheckin(), "11/04/2019");
	}

	@When("^User select the Checkout date as today date$")
	public void user_select_the_Checkout_date_as_today_date() throws Throwable {
	    inputValue(pm.getSp().getCheckout(), "12/04/2019");
	}

	@Then("^User should verify the check in and check out date is same after search button \"([^\"]*)\"$")
	public void user_should_verify_the_check_in_and_check_out_date_is_same_after_search_button(String arg1) throws Throwable {
		String attribute=getAttribute(pm.getSH().getArrivaldate());
		 Assert.assertEquals(arg1, attribute);
		 System.out.println(attribute);
	    
	}

@Then("^User should verify the check out date is same after search button \"([^\"]*)\"$")
public void user_should_verify_the_check_out_date_is_same_after_search_button(String arg1) throws Throwable {
    String attribute=getAttribute(pm.getSH().getDepaturedate());
    Assert.assertEquals(arg1, attribute);
	 System.out.println(attribute);   
}
@Then("^User should verify the no of rooms is same after search button \"([^\"]*)\"$")
public void user_should_verify_the_no_of_rooms_is_same_after_search_button(String arg1) throws Throwable {
    String attribute=getAttribute(pm.getSH().getNoofdays());
    Assert.assertEquals(arg1, attribute);
    System.out.println(attribute);
    
}

@Then("^User should verify the room type is same after search in homepage \"([^\"]*)\"$")
public void user_should_verify_the_room_type_is_same_after_search_in_homepage(String arg1) throws Throwable {
	//selectValuesfromDD(pm.getSp().getRoomtype(), "index", arg1);
    String attribute=getAttribute(pm.getSH().getNoofroms());
    Assert.assertEquals(arg1, attribute);
    System.out.println(attribute);
}

@When("^User select the Checkoutdate after (\\d+)days from checkin date$")
public void user_select_the_Checkoutdate_after_days_from_checkin_date(int arg1) throws Throwable {
	inputValue(pm.getSp().getCheckout(), "12/04/2019");
}


@Then("^User should verify the total price being the calculate per night excluding gst \"([^\"]*)\"$")
public void user_should_verify_the_total_price_being_the_calculate_per_night_excluding_gst(String arg1) throws Throwable {
	String totaldays=getAttribute(pm.getSh().getNumofdays());
	String todaypricepernight=getAttribute(pm.getSh().getPriceinnight());
	String totalpriceexcludegst=getAttribute(pm.getSh().getTotalprice());
	String totalRooms=getAttribute(pm.getSH().getHotelroom());
	String totalrooms = totalRooms.substring(0, 1);
	//System.out.println(totalrooms);
	String todaytrim = totaldays.substring(0, 1);
	System.out.println(todaytrim);
	String todaypricetrim = todaypricepernight.substring(5).trim(); 
	System.out.println(todaypricetrim);
	int totalprice=Integer.parseInt(arg1)*Integer.parseInt(todaytrim)*Integer.parseInt(todaypricetrim)*Integer.parseInt(totalrooms);
	System.out.println(todaypricepernight);
	String tprice = String.valueOf(totalprice);
	if(totalpriceexcludegst.contains(tprice)) {
		System.out.println("Total price is same as calculated");
	}else {
		System.out.println("Total price is not same");
	}
	
	
	
	
		    
}
@When("^User select the hotel radiobutton$")
public void user_select_the_hotel_radiobutton() throws Throwable {
	elementClick(pm.getSH().getSelectbtn());    
}

@When("^User click the continue button$")
public void user_click_the_continue_button() throws Throwable {
    elementClick(pm.getSH().getClickcontinue());
}
@When("^User enter the details and click on book now$")
public void user_enter_the_details_and_click_on_book_now() throws Throwable {
	inputValue(pm.getSH().getFirstname(), "visalakshi");
    inputValue(pm.getSH().getLastname(), "siva");
    inputValue(pm.getSH().getAddress(), "chennai");
    inputValue(pm.getSH().getCreditcard(), "4564567891237895");
    selectValuesfromDD(pm.getSH().getCreditcardtype(), "index", "1");
    selectValuesfromDD(pm.getSH().getCcexpmonth(), "index", "1");
    selectValuesfromDD(pm.getSH().getCcexpyear(), "index", "11");
    inputValue(pm.getSH().getCvvnum(), "456");
    elementClick(pm.getSH().getBooknow());
}
@Then("^User Check the details, click on logout and verify we have been logged out of the application\\.$")
public void user_Check_the_details_click_on_logout_and_verify_we_have_been_logged_out_of_the_application() throws Throwable {
  Thread.sleep(3000);
  elementClick(pm.getSH().getLogout());
}@When("^User should select the (\\d+)rooms$")
public void user_should_select_the_rooms_using_drop_down(String arg1) throws Throwable {
    selectValuesfromDD(pm.getSp().getRoomsnos(), "index", "arg1");
    String x=getAttribute(pm.getSp().getRoomsnos());
    if(x.contains(arg1))
    //String x = String.valueOf(arg1);
    Assert.assertEquals(x, arg1);
    		System.out.println(x);		
}
/*@Then("^User should verify that total-price is being calculated as \\(priceper- night\\*no-ofrooms\\*no-of-days\\)$")
public void user_should_verify_that_total_price_is_being_calculated_as_priceper_night_no_ofrooms_no_of_days(String arg1) throws Throwable {
    String attribute = getAttribute(pm.getSH().getTotalprice());
    Assert.assertEquals(arg1, attribute);
    if(attribute==arg1) {
    	//int attribute1 = (attribute)+(attribute%10);
    	 System.out.println(attribute1);
    }*/
      
}

		
