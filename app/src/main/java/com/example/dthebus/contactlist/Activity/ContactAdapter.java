package com.example.dthebus.contactlist.Activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dthebus.contactlist.R;
import com.example.dthebus.contactlist.domain.Contact;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    List<Contact> myContacts;

    public ContactAdapter(Context context, List<Contact> cons) {
        super(context, R.layout.activity_contact_adapter, cons);
        myContacts = cons;
    }

    public Contact getItem(int position) {

        return myContacts.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;

        Contact cons = (Contact)getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_contact_adapter, parent, false);
        }

        TextView lastName = (TextView) convertView.findViewById(R.id.text_last);
        TextView cell = (TextView) convertView.findViewById(R.id.text_cell);

        lastName.setText(cons.getLastName().toUpperCase());
        cell.setText(cons.getCellNumber());

        return convertView;
    }

    private static class ViewHolder {
        public TextView lastTextView;
        public TextView cellTextView;
    }

}
