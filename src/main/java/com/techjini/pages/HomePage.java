package com.techjini.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.techjini.base.base;

public class HomePage extends base {

	public  void searchItem() {

		// Amazon scenario
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("XR (64GB) – Yellow");
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		driver.findElement(By.xpath("//*[text()='Apple iPhone XR (64GB) - Yellow']")).click();
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		driver.switchTo().window(newTab.get(0));
		String priceOnAmazon = driver.findElement(By.xpath("//*[@id='priceblock_ourprice']")).getText();
		String priceOnAmazon1 = priceOnAmazon.substring(2);
		String StringOriginalPriceOnAmazon = priceOnAmazon1.replace(",", "");
		double OriginalPriceOnAmazon = Double.parseDouble(StringOriginalPriceOnAmazon);

		//System.out.println(OriginalPriceOnAmazon);

		// flipkart scenario
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//*[@title='Search for products, brands and more']"))
				.sendKeys("XR (64GB) – Yellow");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		String priceOnFlipKart = driver
				.findElement(By
						.xpath("html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"))
				.getText();
		
		String priceOnFlipKart1 = priceOnFlipKart.substring(1);
		String StringOriginalPriceOnFlipKart = priceOnFlipKart1.replace(",", "");
		double OriginalPriceOnFlipKart = Double.parseDouble(StringOriginalPriceOnFlipKart);
		//System.out.println(OriginalPriceOnFlipKart);
		
		if (OriginalPriceOnAmazon > OriginalPriceOnFlipKart){	
			
			System.out.println("Lessor price of iphone is " +OriginalPriceOnFlipKart );
		}
		else {
			System.out.println("Lessor price of iphone is " +OriginalPriceOnAmazon );
		}
			

	}

}