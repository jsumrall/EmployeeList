package com.example.max.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by max on 4/20/15.
 */
public class EmployeeListAdapter extends BaseAdapter {

    private Context context;
    private List<Employee> employees;

    public EmployeeListAdapter(Context context){
        this.context = context;
    }

    public void setList(List employees){
        this.employees = employees;
    }

    @Override
    public int getCount() {
        return employees.size();
    }

    @Override
    public Object getItem(int position) {
        return employees.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item_employee, parent, false);

        TextView fullNameView = (TextView) rowView.findViewById(R.id.fullName);
        TextView yearBornView = (TextView) rowView.findViewById(R.id.yearBorn);
        TextView formattedSalaryView = (TextView) rowView.findViewById(R.id.formattedSalary);
        fullNameView.setText(employees.get(position).getFullName());
        yearBornView.setText(employees.get(position).getYearBorn() + "");
        formattedSalaryView.setText(employees.get(position).getFormattedSalary());

        return rowView;
    }
}
