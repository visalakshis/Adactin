package org.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel {
	

	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement selectbtn;
	
	@FindBy(id="hotel_name_0")
	private WebElement hotelname;
	
	@FindBy(xpath="//input[@name='location_0']")
	private WebElement hotellocation;
	
	@FindBy(id="rooms_0")
	private WebElement hotelroom;
	
	@FindBy(id="arr_date_0")
	private WebElement araivaldate;
	
	@FindBy(id="dep_date_0")
	private WebElement depaturedate;
	
	@FindBy(id="no_days_0")
	private WebElement numofdays;
	
	@FindBy(id="room_type_0")
	private WebElement typesofrooms;
	
	@FindBy(id="price_night_0")
	private WebElement priceinnight;
	
	@FindBy(id="total_price_0")
	private WebElement totalprice;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	
	public WebElement getSelectbtn() {
		return selectbtn;
	}


	public WebElement getHotelname() {
		return hotelname;
	}


	public WebElement getHotellocation() {
		return hotellocation;
	}


	public WebElement getHotelroom() {
		return hotelroom;
	}


	public WebElement getAraivaldate() {
		return araivaldate;
	}


	public WebElement getDepaturedate() {
		return depaturedate;
	}


	public WebElement getNumofdays() {
		return numofdays;
	}


	public WebElement getTypesofrooms() {
		return typesofrooms;
	}


	public WebElement getPriceinnight() {
		return priceinnight;
	}


	public WebElement getTotalprice() {
		return totalprice;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public AdactinSelectHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
