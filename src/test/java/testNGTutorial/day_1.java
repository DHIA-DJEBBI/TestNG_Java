package testNGTutorial;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day_1 {
	
	@BeforeClass 
	
	public void avanttoutClass() { 
		System.out.println("avant tout dans ce Class ");
	} 

@AfterTest 

public void apresTout() {
	
	System.out.println("I will be executed as the Last function ");
}

@Parameters({"url"})  
	    @Test
		public void Demo(String url )  {
			
			System.out.println("Hello"); // automation tests ...
			System.out.println(url);

	}
	    
	    @BeforeSuite 
	    
	    public void avantTout() {
	    	
	    	System.out.println("I am the Number 1 as delifed :) ");
	    	
	    }
	    
	    @Test (dependsOnMethods= {"Demo"})
	    
	    public  void SecondTest()
	    {
	    	System.out.println("Thank You");
	    	
	    }
	    
	    @BeforeTest 
	    public void prerequiset() {
	    	
	    	System.out.println(" I will be execued First "); // THE function added will be executed first ( before All other functions ...
	    }
	    
	    
}










