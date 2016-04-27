package com.sam.automation.tools;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.StepEventBus;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public abstract class AbstractTest {
	
	private static final Logger LOG = LoggerFactory
			.getLogger(AbstractTest.class);
	

	
	@Managed(uniqueSession = false)
	public WebDriver driver;
	
	public Pages pages;
	
	
	@Before
	public void setup() {
		
		LOG.info("Done: Application URL launched successfully");
	}
	
	@After
	public void tearDown() {
		StepEventBus.getEventBus().clearStepFailures();
		LOG.info("Done: clearStepFailures");
		
		driver.close();
		
	}

}
