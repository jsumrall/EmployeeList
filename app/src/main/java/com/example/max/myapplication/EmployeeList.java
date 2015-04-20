package com.example.max.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class EmployeeList extends Activity {
    private EmployeeListAdapter adapter;

    private ListView employeeListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employees);

        employeeListView = (ListView) findViewById(R.id.list_employees);

        adapter = new EmployeeListAdapter(this);
        adapter.setList(Employee.getEmployees());
        employeeListView.setAdapter(adapter);
    }
}

