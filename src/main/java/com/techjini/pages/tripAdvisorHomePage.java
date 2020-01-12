package com.techjini.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.techjini.base.base;

public class tripAdvisorHomePage extends base {

	
	public void tripHome() {

		driver.get("https://www.tripadvisor.in/");
		driver.findElement(
				By.xpath("//span[@class='ui_icon search brand-global-nav-action-search-Search__icon--2DVjd']")).click();

		driver.findElement(By.xpath("//input[@id='mainSearch']")).click();
		driver.findElement(By.xpath("//input[@id='mainSearch']")).sendKeys("Club Mahindra");
		driver.findElement(By.xpath("//div[@class='inner']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")).click();
		
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='hotels-hotel-review-atf-info-parts-Rating__reviewCount--1sk1X']")).click();
		driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).isDisplayed();
		driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		//driver.findElement(By.cssSelector("body.rebrand_2017.desktop_web.Hotel_Review.js_logging:nth-child(2) div.page:nth-child(3) div.delineation.accessible_red_3:nth-child(2) div.ui_container.is-fluid.page-section:nth-child(2) div.ppr_rup.ppr_priv_resp_hr_ad_wrapper:nth-child(7) div.column_wrap.ui_columns.is-multiline div.content_column.ui_column.is-8-desktop.is-12 div.ppr_rup.ppr_priv_hr_community_content:nth-child(1) div.react-container div.was-ssr-only div.ssr-init-26f.hotels-hotel-review-layout-Section__tabbedTop--2clFd.hotels-hotel-review-layout-Section__joinable--2me0g:nth-child(2) div.hotels-hotel-review-layout-Header__header--3l3Ub.hotels-hotel-review-layout-Header__divider--29A6X div.hotels-community-content-common-ContextualCTA__wrapper--1QPc2:nth-child(3) div.hotels-community-content-common-ContextualCTA__contextualCTA--3K7gq div.hotels-community-content-common-ContextualCTA__currentOption--3Wd5D > a.ui_button.primary")).click();
		ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab1.get(3));
		System.out.println(driver.getTitle());
		Actions ac = new Actions(driver);
		String rating =driver.findElement(By.xpath("//*[contains(@class,'ui_bubble_rating fl bubble_')]")).getAttribute("class");
		System.out.println(rating);
		WebElement ele = driver.findElement(By.xpath("//*[contains(@class,'ui_bubble_rating fl bubble_')]"));
        ac.dragAndDropBy(ele, 50, 0).build().perform();
        String fiveStar =driver.findElement(By.xpath("//*[contains(@class,'ui_bubble_rating fl bubble_')]")).getAttribute("class");
		System.out.println(fiveStar);
		driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("My review");
		driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys("awesome experience fwfowen nfofmwowm eonewmogmwr woiwmwogwm eoermrwowrgw ergoremerorem egormreeron eiowrkmforewfmwo egiowremerowenol enoiwrgrewgoewrgnwrogwgn goiwgwogweng nwiogwngwogn wgionwfwoegnweon woginwegnweoignw bwogiwegnwo");
		driver.findElement(By.xpath("//div[contains(@class,'c-cell jfy_cloud tag content category-Business')]")).click();
		driver.findElement(By.xpath("//select[@id='trip_date_month_year']")).click();
		WebElement sel = driver.findElement(By.xpath("//select[@id='trip_date_month_year']"));
		Select s = new Select(sel);
		s.selectByIndex(2);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,2000)");
		 
		  driver.findElement(By.xpath("//input[@id='noFraud']")).click();
		  driver.findElement(By.xpath("//div[@id='SUBMIT']")).click();
	}
	

}