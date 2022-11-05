package edu.ualr.intentsassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactFormActivity extends AppCompatActivity {
    // TODO 01. Create a new layout file to define the GUI elements of the ContactFormActivity.
    // TODO 02. Define the basic skeleton of the ContactFormActivity. Inflate the layout defined in the first step to display the GUI elements on screen.
    // TODO 06. Create a new method that reads the values in the several EditText elements of the layout and then uses the Contact class to send those data to ContactInfoActivity

    private String firstName, lastName, phoneNumber, emailAddress, mainAddress, website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactformactivity);
    }

    public void makeContact(View view) {
        EditText fName = findViewById(R.id.firstNameTV);
        EditText lName = findViewById(R.id.lastNameTV);
        EditText pNumber = findViewById(R.id.phoneNumberTV);
        EditText eAddress = findViewById(R.id.emailTV);
        EditText mAddress = findViewById(R.id.addressTV);
        EditText wAddress = findViewById(R.id.websiteTV);

        firstName = fName.getText().toString();
        lastName = lName.getText().toString();
        phoneNumber = pNumber.getText().toString();
        emailAddress = eAddress.getText().toString();
        mainAddress = mAddress.getText().toString();
        website = wAddress.getText().toString();

        startActivityForResult(firstName, lastName, phoneNumber, emailAddress, mainAddress, website);
    }

    private void startActivityForResult(String first, String last, String phone, String email, String address, String web) {
        Intent intent = new Intent(getApplicationContext(), ContactInfoActivity.class);
        intent.putExtra("firstName", first);
        intent.putExtra("lastName", last);
        intent.putExtra("phoneNumber", phone);
        intent.putExtra("emailAddress", email);
        intent.putExtra("mainAddress", address);
        intent.putExtra("website", web);

        startActivity(intent);
    }

}


