
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Locator3;

public class Pcv extends MultiThread {
	CommonLogin cl = new CommonLogin();
	Common2 cl2 = new Common2();
	public Locator3 pcvLocator1;

	public Pcv() {
		this.pcvLocator1 = new Locator3();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.pcvLocator1);
	}

	public void pcv(String url) {
		getDriver().navigate().to(url);
		cl.commonLogin();
	}

	public void dashboard() throws InterruptedException {

		waitClickOn(getDriver(), this.pcvLocator1.selectPcv, 30);
		this.pcvLocator1.selectPcv.click();
		
		waitClickOn(getDriver(), this.pcvLocator1.openQuote, 10);
		this.pcvLocator1.openQuote.click();
	}
	public void getQuote() throws InterruptedException {
		waitClickOn(getDriver(), this.pcvLocator1.rtoCity, 10);
		this.pcvLocator1.rtoCity.sendKeys("mum");
		waitClickOn(getDriver(), this.pcvLocator1.wantedRtoCity, 10);
		this.pcvLocator1.wantedRtoCity.click();
		
		waitClickOn(getDriver(), this.pcvLocator1.dateField, 10);
		this.pcvLocator1.dateField.click();
		this.pcvLocator1.selectDate.click();
		
		waitClickOn(getDriver(), this.pcvLocator1.state, 10);
		Select dropd = new Select(this.pcvLocator1.state);
		dropd.selectByValue("27");
		
		waitVisibilityOfElement(getDriver(), this.pcvLocator1.loader, 8);
		waitInvisibilityOfElement(getDriver(), this.pcvLocator1.loader, 10);
		Select Manufact = new Select(this.pcvLocator1.manufacturer);
		Manufact.selectByVisibleText("ARJUN MOTORS PVT LTD");

		waitVisibilityOfElement(getDriver(), this.pcvLocator1.loader, 8);
		waitInvisibilityOfElement(getDriver(), this.pcvLocator1.loader, 10);
		Select SubClas = new Select(this.pcvLocator1.typeOfManufacturer);
		SubClas.selectByVisibleText("C1(A) - 4 WHEELED VEHICLE WITH CARRYING CAPACITY NOT EXCEEDING 6 PASSENGER");

		waitVisibilityOfElement(getDriver(), this.pcvLocator1.loader, 8);
		waitInvisibilityOfElement(getDriver(), this.pcvLocator1.loader, 10);
		Select Model = new Select(this.pcvLocator1.model);
		Model.selectByVisibleText("ARJUN 500");
		
		waitClickOn(getDriver(), this.pcvLocator1.vehicleUsage, 10);
		Select VehUsage = new Select(this.pcvLocator1.vehicleUsage);
		VehUsage.selectByValue("38");

		waitClickOn(getDriver(), this.pcvLocator1.operationArea, 10);
		Select AOO = new Select(this.pcvLocator1.operationArea);
		AOO.selectByValue("20");

		waitClickOn(getDriver(), this.pcvLocator1.drivenBy, 10);
		Select Vehdriver = new Select(this.pcvLocator1.drivenBy);
		Vehdriver.selectByValue("17");

		waitClickOn(getDriver(), this.pcvLocator1.calculatePremium, 20);
		this.pcvLocator1.calculatePremium.click();

		waitClickOn(getDriver(), this.pcvLocator1.continueButton, 30);
		this.pcvLocator1.continueButton.click();
	}
	public void last() throws InterruptedException {
		cl2.nextPage();
		cl2.searchCustomer();
		cl2.lastAction();
	}

}
