Description:This is part of Test Automation Engineer - Technical Assessment by Rhipe

This project is an Automation Project for Signing up with Rhipe.

Scenario1: Steps involved in Signing up with Rhipe

   	Navigate to Rhipe sign up page
   	Enter the general details
   	Enter the Authorised Signatory Contact details

Technology stack:

Used Selenium with Java, Cucumber, Serenity, Log 4j, Maven and JUnit 

Usage:
Clone the Github repository to the local machine
In command promt open the location where the repository is cloned
Run using Maven command in cmd ->  mvn clean install -DrunEnv=chrome -Dtags=@tests

To View The serenity Report
Navigate to the folder target->site->serenity->index.html in automation suite
Copy the location of the index.html and paste it in a browser to get the serenity report.