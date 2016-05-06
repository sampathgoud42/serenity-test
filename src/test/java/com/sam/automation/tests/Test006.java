package com.sam.automation.tests;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sam.automation.steps.Test1Steps;



@RunWith(SerenityRunner.class)
public class Test006 extends TestCase {

    @Steps
    private Test1Steps test1Steps;

    String url="https://www.google.ie";
    @Managed(uniqueSession = true)
    public WebDriver driver;
    public Pages pages;
    String ip1, ip2, ip3, ip4;

    @Test
    @Ignore
    @Title("Test006 Pending")
    public void test_006() {
    	

    	test1Steps.navigateToUrl(url);
    	test1Steps.test3(ip1);
   
    }
    
    
}
