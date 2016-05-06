package com.sam.automation.pages;

	import net.thucydides.core.annotations.Managed;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


	public class Test1Page extends AbstractPage {

		@Managed
		WebDriver driver;
		
		public Test1Page(final WebDriver driver) {
			super(driver);
			this.driver=driver;
			
		}


		public void navigateToUrl(String url) {
			getDriver().get(url);
			getDriver().manage().window().maximize();
		}

		public void test1() {
			System.out.println("test1");
		}
		
		public void test2() {
			System.out.println("test2");
		}
		
		public void test3(String ip1) {
			System.out.println("test3");
			getDriver().findElement(org.openqa.selenium.By.xpath("//nav//ul[@class='pl-xs-0']//li//a[contains(text(),'"+ip1+"')]"));
		}
		
		public void test4() {
			boolean found=false;
			Assert.assertTrue("should fail",found);
		}
		
}
