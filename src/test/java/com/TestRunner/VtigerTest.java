package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={".\\src\\test\\java\\Features\\CreateOrganizationalongwithPhonenumber.feature"},
		glue={"com.StepDefiniton","Hooks"},
		plugin= {"pretty"},
		tags="@sanity",
		monochrome=true,
		dryRun=true
		
		
		)
public class VtigerTest extends AbstractTestNGCucumberTests{

}
