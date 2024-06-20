package com.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/features", // Ensure this path is correct
    glue = "com.example"
)
public class RunCucumberTest {
}

