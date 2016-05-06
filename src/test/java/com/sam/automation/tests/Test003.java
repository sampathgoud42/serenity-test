package com.sam.automation.tests;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sam.automation.steps.Test1Steps;



@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "csv/test03.csv", separator = ',')
public class Test003 extends TestCase {

    @Steps
    private Test1Steps test1Steps;

    String url="https://www.etsy.com";
    @Managed(uniqueSession = false)
    public WebDriver driver;
    public Pages pages;
    String ip1;
    
    @Test
    @Title("Test003 - 1Test-3Iterations(1shouldPass+2ShouldFail)")
    public void test_003() {
    	
    	test1Steps.navigateToUrl(url);
    	test1Steps.test3(ip1);
   
    }
    
    
}
