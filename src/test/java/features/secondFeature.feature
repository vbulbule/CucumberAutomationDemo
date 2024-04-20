


Feature: Application Login

   
   Background:
   And hit the home page of banking url
   

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
   
   
   
   #hooks (before) -> background -> scenerio -> hooks (after)
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                 
    
    
    
    
                             
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   