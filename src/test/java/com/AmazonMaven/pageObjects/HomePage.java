package com.AmazonMaven.pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.AmazonMaven.testCases.BaseClass;

public class HomePage extends BaseClass{
	
	public void searchInSearchBox() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Clothes for mens");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	}
	
	public void BackSpaceOnWebPage() {
		driver.navigate().back();
	}
	
	public void LinksInHomePage() {
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		 System.out.println(links.size());
		}
	
	public void DressForSuccessSeeMore() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.xpath("//a[@aria-label='Dress for success with BUTTONED DOWN - See more']"));
		jse.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		String Acutal = "Amazon.com: Buttoned Down";
		String Expected = "Amazon.com: Buttoned Down";
		Assert.assertEquals("Amazon.com: Buttoned Down", Expected);
		if(Acutal == Expected) {
			System.out.println("We are on dress for success page");
		}
		
		        
		
	}
	
	public void ScrollToBottomOfThePage() {
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("scroll(0, 10000);");
	 WebElement Element = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[3]/a"));

	        //This will scroll the page till the element is found		
	       
	        Element.click();
	}
	
	
}
