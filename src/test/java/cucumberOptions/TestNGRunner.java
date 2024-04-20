package cucumberOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitations",
		monochrome = true,
		tags = "@regression"
	
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

/*
 * we can user the multiple tags with their combinition as givnen below
 * 
 *  1. if we want to combine two or more tags and run the test with containing those tags only then we
 *  can use : tags = "@smoke and @regression"
 *  
 *  2. if we want to run tests either tag1 or tag2 tests then we can use
 *      tags = "@smoke or @regression"
 *      
 *  3. if we want to exclude any tag then we can use
 *      tags = "not @regression"   
 *      
 *       
 *   
 *          
  
  # what are cucumber tags
   
   
   
   
   
   # background keyword
   
   
   Bckground in cucumber is used to define a step or series of steps that are common to all the tests/ scenerios in
   the feature file.
   It allow you to add some context to the scenarios for a features where it is defined.
   A abckground is much like a scenerio containing a number of steps
   but it runs before each and every scenerio were for a feature in which it is defined
   
   
   for example 
   to purchase a product on any Ecommerce website you need to do the following steps
   
   1. navigate to login page
   2. submit UserName and password
   
   After these steps only you will be able to add a product to your cart and able to do the payment
   
   to add to cart functionality, these tests become common for all tests so instead of writing then again and again
   for all tests we can move it under background keyword
   
   Feature File will look like :
   
   Feature : verify add to cart/basket functionality
   Description : the purpose of this feature is to test the cart functionlity
   
   
   Background : User is logged in
                GIven I navigate to the login page
                When I submit Userame and password
                THen I should be logged in
                
    Scenario : Search product and add the first product to the user basket
               Given I search for lenovo laptop
               When add the first laptop that appears in the search result to the basket
               Then user basket should display with added item
               
    Scenario : Navigate to product and add the same to the User basket
               Given User navigate for Lenovo Laptop
               When add the laptop to the basket
               Then user basket shuld display with added item
               
               
               
    Dry Run in cucumber
    
    we can quickly validate the steps in your feature file using Dry Run in cucumber.
    without having run the code inside the appropriate step definitions, to ensure that the
    every step has its corresponding Step definition present in step definition file.
    
    A cucumber dry run is used to confirm the compilation faults and compile the step definition
    and feature file
    
    the DryRun option can either be set as true or false
    By default it is false
    
    Dry RUn as true :
    
    @CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitations",
		monochrome = true,
		tags = "@smoke",
		dryRun = true
		)
    public class TestNGRunner extends AbstractTestNGCucumberTests{

    }
    
    -- 
    In case of dry run as true, none of the Steps is executed, 
    but Cucumber has only made sure that every Step has the interconnected method available 
    in the Step Definition file. Take a look at the time duration at the end of every Step.
    It is extremely less.
           
           
           
    ------------------------   Cucumber Hooks -------------------------------
    
    cucumber supports hooks which are blocks of code that run before and after each scenerio
    You can define then anywher in your project or step definition layers,
    using the methods @Before and @After.
    CUcumber Hooks allows us to better manage the code workfloe and helps us to reduce the 
    code redundancy.
    
    we can say that is an unseen step, which allos us to perform our scenarios or test
    
    In the world of testinf you must have encountered the situatuins where you need to
    perform some prerequisits steps before testing any test scenario
    this can be anything from
    1. starting web browser
    2. setting upp the DB connections
    3. setting up data
    4. setting tup cookies
    5. navitgating to certain page
    or anything before the test
    
    in same way there are always after steps as well
    
    1. killing the webderiver
    2. closing the DB connections
    3. clearing the test data
    4. logging out from the application
    5. printing report logs
    6 taking screenshot error for failed tests
    ar any thing after the test
    
    to handle these kind of situations cucumber hooks are the best choice to use
    unlike TestNG Annotations
    
    ccumber supports only two hooks (Before anf After)
     which works at start and the end of the scenerio
     
     As the name suggests @before hoook gets executed well before any other test scenerio
     and @after hook executed aftr executing the scenerio
     
     
     before and after hooks can be used to set some prerequisites for specific test scenerios
     
     
     For example
     
     we have two test scenerios in our feature 
     1. test for Insurance user login
     2. test for carloan insurance login
     
     and to run both the test cases successfully we need to set different prerequisites 
     for both the test cases
     
     but if we user background keyword then we nned ho have the same prerequisites for both 
     the test cases result will failure in tests
     
     so we can set the defferent different prerequisites using Hooks like
     
     @Before("@insurance")
	public void beforeForInsurance() {
		System.out.println("------------before insurance-----------------");
		System.out.println("Setting data for Insurance test case");
		System.out.println("------------before end insurance -----------------");
	}
	
	
	@Before("@carloan")
	public void beforeForcarloan() {
		System.out.println("------------before carloan-----------------");
		System.out.println("Setting data for carloan test case");
		System.out.println("------------before end carloan -----------------");
	}
	
	@After("@insurance")
	public void afterInsurance() {
		System.out.println("------------after insurance-----------------");
		System.out.println("clean the insurance databse");
		System.out.println("-----------------------------------");
	}
	
	@After("@carloan")
	public void aftercarloan() {
		System.out.println("------------after carloan-----------------");
		System.out.println("clean the carloan databse");
		System.out.println("-----------------------------------");
	}
	
	Above mentioned before and after hooks are run for the perticular scenerio which is tagged 
	with
	@insurance and @carloan
	
	-- test scenerio will look like 
	
   @smoke @regression @insurance
   Scenario: Insurance Page default login
   Given User is on Netbanking Login page
   When User Login into application as user "InsuranceUser" with password "insurePWD"
   Then Home Page is displayed
   And admin Cards are displayed
   
   @regression @carloan
   Scenario: CarLoan Page default login
   Given User is on Netbanking Login page
   When User Login into application as user "CarloanUser" with password "carloanUser"
   Then Home Page is displayed
   And morgage Cards are displayed
   
   the execution flow of cucumber is 
   
   hooks (Before) - >(Hooks Before scenerio specific mentioned then before"@sceneriotag")
   -> background -> scenerio -> (Hooks After scenerio specific mentioned then after"@sceneriotag") 
   -> hooks After
   
   
   
   
   
   
   
   
   
   
	
     
     
     
    
    
    
    
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
 * 
 */
