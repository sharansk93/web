package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/feature",glue="com.stepdefinition",plugin={"html:target/req.html","json:target/req.json"})
public class Runner {

}


