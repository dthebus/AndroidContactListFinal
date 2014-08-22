package com.example.dthebus.contactlist.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.dthebus.contactlist.R;
import com.example.dthebus.contactlist.Repository.DataSourceDAOImpl;
import com.example.dthebus.contactlist.domain.Contact;

public class ContactActivity extends Activity {
    TextView firstname;
    TextView lastname;
    TextView email;
    TextView cell;
    TextView home;

    DataSourceDAOImpl db = new DataSourceDAOImpl(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        int ID = this.getIntent().getExtras().getInt("contactId");

        Contact cons = db.getContact(ID);

        firstname = (TextView) findViewById(R.id.first_textview);
        lastname = (TextView) findViewById(R.id.last_textview);
        email = (TextView) findViewById(R.id.email_textview);
        cell = (TextView) findViewById(R.id.cell_textview);
        home = (TextView) findViewById(R.id.home_textview);

        firstname.setText(cons.getFirstName().toUpperCase());
        lastname.setText(cons.getLastName().toUpperCase());
        email.setText(cons.getEmailAddress().toUpperCase());
        cell.setText(cons.getCellNumber().toUpperCase());
        home.setText(cons.getHomeNumber().toUpperCase());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }
}
