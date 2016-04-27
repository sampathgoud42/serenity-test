package com.sam.automation.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sam.automation.tests.Test001;
import com.sam.automation.tests.Test002;
import com.sam.automation.tests.Test003;
import com.sam.automation.tests.Test004;
import com.sam.automation.tests.Test005;
import com.sam.automation.tests.Test006;

@RunWith(Suite.class)
@SuiteClasses({

		
	Test001.class,
	Test002.class,
	Test003.class,
	Test004.class,
	Test005.class,
	Test006.class,
	

})

public class TestSuite {

}

