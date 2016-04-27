package com.sam.automation.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sam.automation.steps.Test1Steps;
import com.sam.automation.tools.AbstractTest;



@RunWith(SerenityRunner.class)
public class Test001 extends AbstractTest {

	@Managed()
	WebDriver driver;
	
	
    @Steps
    private Test1Steps test1Steps;

    String url="https://www.google.ie";


    @Test
    @Title("Test001")
    public void test_001() {
    	
    	test1Steps.test1();
   
    }
    
    
}
