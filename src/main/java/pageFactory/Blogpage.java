package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import techBase.BaseClass;

public class Blogpage extends BaseClass{

	By blog = By.xpath("//a[contains(text(),'Blog')]");
	
	By AllCategory = By.id("All Categories");
	
	By SearchButton = By.xpath("//ul/li[4]/input[@type='submit']");
	
	public Blogpage() {
		PageFactory.initElements(driver, this);
	}
	public void clickBlog() {
		driver.findElement(blog).click();
	}
	
	public void clickAllCategori() {
	   driver.findElement(AllCategory).click();		
		
	    WebElement allCatDropdown = (WebElement) AllCategory;
  		Select select01 = new Select(allCatDropdown);
		select01.selectByVisibleText("education");
	}
	public void  clickSerchButton()	{
		driver.findElement(SearchButton).click();
	}
}
