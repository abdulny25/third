package com.AmazonMaven.pageObjects;

import org.openqa.selenium.By;

import com.AmazonMaven.testCases.BaseClass;

public class TodaysDealPage extends BaseClass{
	
	public void todaysDealPageClick() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
	}
	
	public void BabyCheckBoxclick() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[5]")).click();
		System.out.println("we are on todays deal BABY page");
		Thread.sleep(2000);
	}

}
