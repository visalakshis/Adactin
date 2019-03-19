package org.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHomepage {

	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomsnos;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement checkindate;
	
	@FindBy(xpath="//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement checkoutdate;
	
	@FindBy(xpath="(//span[@class='reg_error'])[8]")
	private WebElement checindateerrormsg;
	
	@FindBy(id="checkout_span")
	private WebElement checkoutdateerrormsg;
	
	


	public WebElement getCheckoutdateerrormsg() {
		return checkoutdateerrormsg;
	}


	public WebElement getChecindateerrormsg() {
		return checindateerrormsg;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getRoomsnos() {
		return roomsnos;
	}


	public WebElement getCheckin() {
		return checkin;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAdultroom() {
		return adultroom;
	}


	public WebElement getChildroom() {
		return childroom;
	}


	public WebElement getSearch() {
		return search;
	}


	public AdactinHomepage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
			}
	}
