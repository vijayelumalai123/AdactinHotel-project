package cucumber.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.Adactinpageobject.manager.SingleTonePattern;
import com.Runnerclass.RunnerClass;

import Baseclass.baseClass;
import adactinproperties.ConfigurationHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends baseClass {
	
public static	WebDriver driver = RunnerClass.driver;
	SingleTonePattern stp= new SingleTonePattern(driver);

	@Given("^ser Launch The Given Url$")
	public void ser_Launch_The_Given_Url() throws Throwable {
		//String url = ConfigurationHelper.getIntanceCr().geturl();
		lanuchUrl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The UserName In The Username Field or Box$")
	public void user_Enter_The_UserName_In_The_Username_Field_or_Box() throws Throwable {
		String getusername = ConfigurationHelper.getIntanceCr().getusername();
		userInput(stp.loginPage().getusernmae(),getusername);
		
	}

	@When("^user Enter The Password In The Password Field or Box$")
	public void user_Enter_The_Password_In_The_Password_Field_or_Box() throws Throwable {

		String getpassword = ConfigurationHelper.getIntanceCr().getpassword();
	userInput(stp.loginPage().getpassword(), getpassword);	
	}

	@Then("^user Clicks The Login Button Which Navigates To The Search Hotel Page$")
public void user_Clicks_The_Login_Button_Which_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(stp.loginPage().getlogin());
	}

	@Given("^user Enter The Location  IN The Location Field$")
	public void user_Enter_The_Location_IN_The_Location_Field() throws Throwable {
		selectCase(stp.searchhotel().getLocation(), "index", "6");
	}

	@When("^user Enter The Hotel Name In  The Hotel Field$")
	public void user_Enter_The_Hotel_Name_In_The_Hotel_Field() throws Throwable {
		selectCase(stp.searchhotel().getHotel(), "index", "2");
	}

	@When("^user Select The RoomType IN The RoomType Field$")
	public void user_Select_The_RoomType_IN_The_RoomType_Field() throws Throwable {
		selectCase(stp.searchhotel().getroomtype(), "text", "Double");
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The No Of Rooms In The Room NO DropDown Options Field$")
	public void user_Select_The_No_Of_Rooms_In_The_Room_NO_DropDown_Options_Field() throws Throwable {
		selectCase(stp.searchhotel().getNoofroom(), "index", "2");
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user Select The AdultRoom In The AdultRoom Field$")
	public void user_Select_The_AdultRoom_In_The_AdultRoom_Field() throws Throwable {
		selectCase(stp.searchhotel().getadroom(), "index", "2");
	}

	@When("^user Select The ChildRoom In The ChildRoom Field$")
	public void user_Select_The_ChildRoom_In_The_ChildRoom_Field() throws Throwable {
		selectCase(stp.searchhotel().getchildroom(), "index", "2");
	}

	@Then("^user The Sumbit Button$")
	public void user_The_Sumbit_Button() throws Throwable {
		clickOnElement(stp.searchhotel().getSumbit());
	}
		
	@Given("user Click The Radio Button")
	public void user_click_the_radio_button() {
		clickOnElement(stp.selectClass().getradiobtn());

		
	}
	@Then("user Click The Continue Button")
	public void user_click_the_continue_button() {
		clickOnElement(stp.selectClass().getcontinuebtn());

	}
		
	@Given("user Given The First Name In The FisrtName Field Or Box")
	public void user_given_the_first_name_in_the_fisrt_name_field_or_box() {
		JsSendkey(stp.BookHotel().getfirstname(),"vijay");
	
	}
	@When("user Given The Last Name In The LastName Field Or Box")
	public void user_given_the_last_name_in_the_last_name_field_or_box() {
		JsSendkey(stp.BookHotel().getlastname(), "elumalai");

	}
	
	@When("user Given The User Address In The Address Field")
	public void user_given_the_user_address_in_the_address_field() {
		JsSendkey(stp.BookHotel().getaddress(), "4a,nehru street,ambattur");

	}
	
	@When("user Given The User CardNo Details IN The Field Box")
	public void user_given_the_user_card_no_details_in_the_field_box() throws Throwable {
		String cardno = ConfigurationHelper.getIntanceCr().getcardno();
		JsSendkey(stp.BookHotel().getcardno(),cardno);
	}
	
	@When("user Given The User Bank Card Type Name IN The Field Box")
	public void user_given_the_user_bank_card_type_name_in_the_field_box() {
		selectCase(stp.BookHotel().getbank(), "text", "VISA");

	}
	
	@When("user Given The Card Expire Month IN The Field Box")
	public void user_given_the_card_expire_month_in_the_field_box() {
		selectCase(stp.BookHotel().getexpiremonth(), "index", "4");

	}
	
	@When("user Given The Card Expire Year IN The Field Box")
	public void user_given_the_card_expire_year_in_the_field_box() {
		selectCase(stp.BookHotel().getexpireyear(), "index", "12");

	}
	
	@When("user Given The Cvv Card No IN The Field Box")
	public void user_given_the_cvv_card_no_in_the_field_box() throws Throwable {
		String CvvNo = ConfigurationHelper.getIntanceCr().getcvvcard();
		JsSendkey(stp.BookHotel().getcvvcard(),CvvNo);
	}
	
	@Then("user Click The Booknow Button")
	public void user_click_the_booknow_button() {
		clickOnElement(stp.BookHotel().getBooknow());

	}

	}


