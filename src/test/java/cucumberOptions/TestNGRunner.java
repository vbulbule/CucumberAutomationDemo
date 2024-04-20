package cucumberOptions;

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
           
           
           
           
           
           
 * 
 */
