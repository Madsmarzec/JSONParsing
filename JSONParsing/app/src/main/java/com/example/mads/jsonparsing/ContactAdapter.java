package com.example.mads.jsonparsing;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mads on 14-06-2017.
 */

public class ContactAdapter extends ArrayAdapter {
    List list = new ArrayList();

    public ContactAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public void add( Contacts object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row;
        row = convertView;
        ContactHolder contactHolder;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            contactHolder = new ContactHolder();
            contactHolder.tx_player_name = (TextView) row.findViewById(R.id.tx_player_name);
            contactHolder.tx_goals = (TextView) row.findViewById(R.id.tx_goals);
            contactHolder.tx_assists = (TextView) row.findViewById(R.id.tx_assists);
            row.setTag(contactHolder);
        }
        else {
            contactHolder = (ContactHolder) row.getTag();
        }
        Contacts contacts = (Contacts) this.getItem(position);
        contactHolder.tx_player_name.setText(contacts.getPlayer_name());
        contactHolder.tx_goals.setText(contacts.getGoals());
        contactHolder.tx_assists.setText(contacts.getAssists());
        return row;
    }
    static class ContactHolder{
        TextView tx_player_name, tx_goals, tx_assists;
    }
}
