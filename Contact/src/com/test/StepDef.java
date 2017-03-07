package com.test;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Driver {

	@FindBy(id = "com.example.android.contactmanager:id/contactNameEditText")
	WebElement name;

	@FindBy(id = "com.example.android.contactmanager:id/contactPhoneEditText")
	WebElement number;

	@FindBy(id = "com.example.android.contactmanager:id/contactEmailEditText")
	WebElement email;

	@FindBy(id = "com.example.android.contactmanager:id/contactSaveButton")
	WebElement buttonSave;
	@FindBy(id = "android:id/title")
	WebElement title;

	@FindBy(id = "com.example.android.contactmanager:id/contactEntryText")
	List<WebElement> allElements;

	String s = "Android";

	@Given("^User is landed on App Home page$")
	public void landingPage() throws MalformedURLException {
Boolean p =driver.findElement(By.id("com.example.android.contactmanager:id/addContactButton")).isDisplayed();
Assert.assertTrue(p, "Not found");
	}

	@When("^user taps on Add contact button$")
	public void tapOnAddContact() {
		driver.findElement(
				By.id("com.example.android.contactmanager:id/addContactButton"))
				.click();

	}

	@Then("^user navigates to Add contact page$")
	public void verifyAddContactPage() {

	}

	// User Adds a contact using name<bhavik>, mobile<12345678> and email<v@v.com>
	@When("^user Adds a contact using name \"([^\"]*)\", mobile \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void AddDetails(String n,String r, String o) {
		System.out.println(n);
		name.sendKeys(n);
		number.sendKeys(r);
		email.sendKeys(o);
		buttonSave.click();
	}
         //Verify the name<bhavik> under the list
	@Then("^verify the name \"([^\"]*)\" under the list$")
	public void verifyAddedName(String t) {
		Assert.assertTrue(title.getText().equalsIgnoreCase("Contact Manager"),
				"Not found");
		for (WebElement e : allElements) {
			System.out.println(e.getText());
			if (e.getText().equals(t)) {
				System.out.println("Found " + s + " in the list");
				Assert.assertTrue(true, "not found");
				break;
			}
		}
	}
}