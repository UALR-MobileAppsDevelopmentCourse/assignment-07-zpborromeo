package edu.ualr.intentsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactInfoActivity extends AppCompatActivity {
    // TODO 03. Create a new layout file to define the GUI elements of the ContactInfoActivity.
    // TODO 04. Define the basic skeleton of the ContactInfoActivity. Inflate the layout defined in the first step to display the GUI elements on screen.
    // TODO 07. Create a new method that reads the contact info coming from ContactFormActivity and use it to populate the several TextView elements in the layout.

    private String firstName, lastName, phoneNumber, emailAddress, mainAddress, website;
    private String fullName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfoactivity);

        TextView contactTV = findViewById(R.id.contactNameTV);
        TextView phoneTV = findViewById(R.id.phoneNumberTV);
        TextView emailTV = findViewById(R.id.emailTV);
        TextView addressTV = findViewById(R.id.addressTV);
        TextView websiteTV = findViewById(R.id.websiteTV);

        Intent intent = getIntent();
        firstName = intent.getStringExtra("firstName");
        lastName = intent.getStringExtra("lastName");
        phoneNumber = intent.getStringExtra("phoneNumber");
        emailAddress = intent.getStringExtra("emailAddress");
        mainAddress = intent.getStringExtra("mailAddress");
        website = intent.getStringExtra("website");

        fullName = firstName + lastName;

        contactTV.setText(fullName);
        phoneTV.setText(phoneNumber);
        emailTV.setText(emailAddress);
        addressTV.setText(mainAddress);
        websiteTV.setText(website);
    }


    // TODO 08. Create a new method that invokes a Phone Dialer app, using as parameter the phone number included in the contact info received from ContactFormActivity in the previous step
    public void callContact() {

    }

    // TODO 09. Create a new method that invokes a Messages app, using as parameter the phone number included in the contact info received from ContactFormActivity in the 7th step
    public void textContact() {

    }
    // TODO 10. Create a new method that invokes a Maps app, using as parameter the address included in the contact info received from ContactFormActivity in the 7th step
    public void openMaps() {

    }
    // TODO 11. Create a new method that invokes an Email app, using as parameter the email address included in the contact info received from ContactFormActivity in the 7th step
    public void emailContact() {

    }
    // TODO 12. Create a new method that invokes an Web Browser app, using as parameter the web url included in the contact info received from ContactFormActivity in the 7th step
    public void openWebsite() {

    }


}
