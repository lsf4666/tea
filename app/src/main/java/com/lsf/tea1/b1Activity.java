package com.lsf.tea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.content.Context;
public class b1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fg1);

        UserAdapter teacherAdapter = new UserAdapter(this, R.layout.item_user, User.getAllTeachers_b());

        ListView listView = (ListView) findViewById(R.id.user_list);

        listView.setAdapter(teacherAdapter);
    }
}



