package org.maven.pom;

import org.apache.poi.util.SuppressForbidden;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement selectbtn;
	@FindBy(id="continue")
	private WebElement clickcontinue;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditcard;
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getClickcontinue() {
		return clickcontinue;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}


	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id="hotel_name_0")
	private WebElement hotelname;
	@FindBy(id="location_0")
	private WebElement hotellocation;
	@FindBy(id="rooms_0")
	private WebElement rooms;
	@FindBy(id="arr_date_0")
	private WebElement arrivaldate;
	@FindBy(id="dep_date_0")
	private WebElement depaturedate;
	@FindBy(id="no_days_0")
	private WebElement noofdays;
	@FindBy(id="room_type_0")
	private WebElement noofroms;
	@FindBy(id="price_night_0")
	private WebElement nightprice;
	@FindBy(id="total_price_0")
	private WebElement totalprice;
	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getHotellocation() {
		return hotellocation;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getArrivaldate() {
		return arrivaldate;
	}

	public WebElement getDepaturedate() {
		return depaturedate;
	}

	public WebElement getNoofdays() {
		return noofdays;
	}

	public WebElement getNoofroms() {
		return noofroms;
	}

	public WebElement getNightprice() {
		return nightprice;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	
	public SelectHotelPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}

}
 