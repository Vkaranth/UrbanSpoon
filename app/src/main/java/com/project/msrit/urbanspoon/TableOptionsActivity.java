package com.project.msrit.urbanspoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dhamini-poorna-chandra on 08/01/18.
 */

public class TableOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_options);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.view_all_tables)
    public void onClickViewAllTables() {
        Intent intent = new Intent(this, TableListActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.add_new_guest)
    public void onClickAddNewGuest() {
        Intent intent = new Intent(this, NewGuestActivity.class);
        startActivity(intent);
    }

}
