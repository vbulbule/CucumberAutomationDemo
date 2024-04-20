


Feature: Application Login

   
   Background:
   Given setup the entries in database 
   And hit the home page of banking url
   

   @smoke @regression
   Scenario: Admin Page default login
   Given User is on Netbanking Login page
   When User Login into application as user "adminUser" with password "pwd"
   Then Home Page is displayed
   And admin Cards are displayed
   
   @regression
   Scenario: Admin Page default login
   Given User is on Netbanking Login page
   When User Login into application as user "morgageUser" with password "agshasd"
   Then Home Page is displayed
   And morgage Cards are displayed
   
   @regression
   Scenario: Admin Page default login
   When User Login into application as user "homeLoanUser" with password "agaegfbety"
   Then Home Page is displayed
   And home loan Cards are displayed
   
   @smoke @regression
   Scenario Outline: net banking login verification
   Given User is on Netbanking Login page
   When User Login into application as user "<UserName>" with password "<Password>"
   Then Home Page is displayed
   And Cards are displayed
   Examples:
   | UserName    |   Password    |
   |adminUser    | pwd           |
   |morgageUser  |agshasd        |
   |homeLoanUser |agaegfbety     |
   
   @regression
   Scenario: Admin Page default login
   When User Login into application as user 6872368472683 with password auu1231290
   Then Home Page is displayed
   And home loan Cards are displayed
   
   
   # DataDriven Testing in cucumber FW
   
   @smoke @regression
   Scenario: user creates an Fecbbok account
   Given User is on Facebook account creation page
   Then user creates an account
   | FieldName    |   FieldValues   |
   | Name         |   Vitthal       |
   | Surname      |   Bulbule       |
   | mobileNo     |   1234567893    |
   | password     |   test@123      |
   Then user enter values as list
   |Vitthal|
   |Bulbule|
   |1234567893|
   |test@123|
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                 
    
    
    
    
                             
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   