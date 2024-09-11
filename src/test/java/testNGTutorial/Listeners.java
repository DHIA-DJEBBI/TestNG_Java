package testNGTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // Code that runs before each test method
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Code that runs after each successful test
    	System.out.println("I was sucsessfully executed the Code ");
       
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Code that runs after each failed test // Screen Shots.... 
    	
    	System.out.println("the Test didn't run well .......  "+ result.getName());
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Code that runs after each skipped test
    
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Code that runs if a test fails but is within the success percentage
       
    }

    @Override
    public void onStart(ITestContext context) {
        // Code that runs before the start of the test
        
    }

    @Override
    public void onFinish(ITestContext context) {
        // Code that runs after all tests are complete
     
    }
    
    
}

