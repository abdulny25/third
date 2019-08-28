package com.AmazonMaven.testCases;

import org.testng.annotations.Test;

import com.AmazonMaven.pageObjects.HomePage;

public class TC_HomePage001 extends BaseClass{

	HomePage hp = new HomePage();
	
	@Test
	public void HomePageExecution() {
		hp.searchInSearchBox();
		hp.BackSpaceOnWebPage();
		hp.LinksInHomePage();
		hp.DressForSuccessSeeMore();
		hp.BackSpaceOnWebPage();
		hp.ScrollToBottomOfThePage();
	}
	
}
