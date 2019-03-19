package org.maven.pom;

import org.openqa.selenium.WebDriver;




public class PageObjectManager {
	private WebDriver driver;
	
	private AdactinLoginPage lp;
	
	public PageObjectManager(WebDriver pdriver) {
		this.driver=pdriver;
		
		
	}

	private AdactinHomepage sp;
	private AdactinSelectHotel sh;
	private SelectHotelPage SH;
	
		
	public AdactinHomepage getSp() {
		if(sp==null)
			sp=new AdactinHomepage(driver);
		return sp;
	}
	
	public AdactinLoginPage getLp() {
		if(lp==null) {
			lp=new AdactinLoginPage(driver);
		}
		return lp;
	}

	
	public AdactinSelectHotel getSh() {
		if(sh==null) {
			sh=new AdactinSelectHotel(driver);
		}
		return sh;
	}
	public SelectHotelPage getSH() { 
		if(SH==null)
			SH=new SelectHotelPage(driver);
	return SH;
	}
}