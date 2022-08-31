package com.Runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Baseclass.baseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",
glue="cucumber.stepdefinition",
dryRun = false,
monochrome = false,
plugin ={ "pretty", 
	"html:target/cucumber-reports","json:target\\reports\\vj.json"}

)

public class RunnerClass extends baseClass{
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
driver=browserlanuch("Chrome");
	}
	@AfterClass
	public static void teardown() {
		close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
