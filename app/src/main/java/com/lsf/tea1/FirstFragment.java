package com.lsf.tea1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import com.lsf.tea1.UserAdapter;
import com.lsf.tea1.User;
import android.view.LayoutInflater;
/**
 * Created by dm on 16-3-29.
 * 第一个页面
 */
public class FirstFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg1, container, false);
        //et_search = (ClearEditText) view.findViewById(R.id.et_search);
        // user_list = (ListView) view.findViewById(R.id.user_list);
        UserAdapter teacherAdapter = new UserAdapter(getActivity(), R.layout.item_user, User.getAllTeachers());

        ListView listView = (ListView) view.findViewById(R.id.user_list);

        listView.setAdapter(teacherAdapter);


        return view;
    }
}
