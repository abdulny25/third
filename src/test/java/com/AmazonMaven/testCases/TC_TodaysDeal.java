package com.AmazonMaven.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AmazonMaven.pageObjects.TodaysDealPage;

public class TC_TodaysDeal extends BaseClass{
	TodaysDealPage TDP = new TodaysDealPage();
	@Test
	public void TodayDealPAGEFunctions() throws InterruptedException {
		TDP.todaysDealPageClick();
		TDP.BabyCheckBoxclick();
	}

}
