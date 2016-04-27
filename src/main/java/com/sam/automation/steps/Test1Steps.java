package com.sam.automation.steps;

	import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.sam.automation.pages.Test1Page;

	public class Test1Steps extends ScenarioSteps {
		private static final long serialVersionUID = -6683966261201431368L;
		Test1Page test1Page;
		
		@Step("Navigate to url: {0}")
		public void navigateToUrl(String url) {
			test1Page.navigateToUrl(url);
		}

		@Step("Step1")
		public void test1() {
			test1Page.test1();
		}
		
		@Step("Step2")
		public void test2() {
			test1Page.test2();
		}
		
		@Step("Step3 ERROR always")
		public void test3() {
			test1Page.test3();
		}
		
		@Step("Step4 FAILURE always")
		public void test4() {
			test1Page.test4();
		}
		
}
