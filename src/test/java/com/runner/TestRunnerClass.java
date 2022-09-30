package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
/**
 * 
 * @author Hareesh K
 * @Description To execute classes
 * @Date 08/07/2022
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags="@Search",snippets=SnippetType.CAMELCASE,monochrome=true,dryRun = false,plugin= {"pretty", "json:target/report.json"}
,features= {"src\\test\\resources\\Features"},glue= {"com.stepdefinition"})
public class TestRunnerClass {
/**
 * Description creating JVM Report
 * Date 08/07/2022
 */
/*@AfterClass
	public static void afterClass() {
Reporting.generateJVMReport("C:\\Users\\Scandy\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\report.json");
	}*/
	}
