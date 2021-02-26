@tests 

Feature: Sign up with Rhipe 

Scenario Outline: Sign up with Rhipe 
	Given I am on sign up with Rhipe page 
	When I enter general information details "<Customer name>" "<Registration number>" "<Address line1>" "<Address line 2>" "<Line 3>" "<City>" "<State>" "<Country>" "<Post Code>" "<Main Phone>" "<Fax>" "<Website>" "<Email>" "<Source>" "<Industry Type>" 
	And I enter authorized signatory contact information details "<First Name>" "<Last Name>" "<Direct Phone>" "<Job Title>" "<Email1>" 
	
	
	
	Examples: 
		|Customer name|Registration number|Address line1    |Address line 2 |Line 3|City	  |State   |Country     |Post Code|Main Phone|Fax       |Website									   |Email  |First Name   |Last Name|Direct Phone|Job Title			|Email1 |Source       |Industry Type              |
		|Test Company |765789876          |2 Lonsdale Street|Near Parliament|Test  |Melbourne |Victoria|Singapore	|3039	  |0435579876|0675456724|https://dev-rhipe-signup.azurewebsites.net/   |a@b.com|Muraleedharan|Pallayil |0437789876  |Automation Engineer|c@d.com|Rhipe Website|Application Service Provider|
