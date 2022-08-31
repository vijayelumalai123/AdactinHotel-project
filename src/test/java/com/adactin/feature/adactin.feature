Feature: Hotel Booking Application

Scenario: Login Page //first page
Given ser Launch The Given Url
When user Enter The UserName In The Username Field or Box
And user Enter The Password In The Password Field or Box
Then user Clicks The Login Button Which Navigates To The Search Hotel Page

Scenario: Search Page //second page
Given user Enter The Location  IN The Location Field
When user Enter The Hotel Name In  The Hotel Field
And  user Select The RoomType IN The RoomType Field 
And user Select The No Of Rooms In The Room NO DropDown Options Field
And user Select The AdultRoom In The AdultRoom Field
And user Select The ChildRoom In The ChildRoom Field
Then user The Sumbit Button
 
Scenario: Select Hotel // third page
Given user Click The Radio Button
Then user Click The Continue Button

Scenario: BookHotel // Forth page
Given user Given The First Name In The FisrtName Field Or Box
When user Given The Last Name In The LastName Field Or Box
And user Given The User Address In The Address Field
And user Given The User CardNo Details IN The Field Box
And user Given The User Bank Card Type Name IN The Field Box
And user Given The Card Expire Month IN The Field Box
And user Given The Card Expire Year IN The Field Box
And user Given The Cvv Card No IN The Field Box
Then user Click The Booknow Button 

