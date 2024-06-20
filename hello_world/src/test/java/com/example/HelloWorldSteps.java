package com.example;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloWorldSteps {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @Given("the application is started")
    public void theApplicationIsStarted() {
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @When("I run the HelloWorld program")
    public void iRunTheHelloWorldProgram() {
        HelloWorld.main(new String[]{});
    }

    @Then("I should see {string} in the output")
    public void iShouldSeeInTheOutput(String expectedOutput) {
        assertEquals(expectedOutput, outputStream.toString().trim());
        System.setOut(originalOut);
    }
}