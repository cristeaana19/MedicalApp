package com.ana.projectatestat.pacient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ana.projectatestat.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FeedActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        recyclerView= findViewById(R.id.appointmentList);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        AppointmentListAdapter adapter=new AppointmentListAdapter(getData());
        recyclerView.setAdapter(adapter);

    }
    public List<Appointment> getData()
    {
        List<Appointment> appointmentList= new ArrayList<>();
        appointmentList.add(new Appointment("Dermatology",new Date(2021, Calendar.MARCH, 12), "Linda Maecury"));
        appointmentList.add(new Appointment("Ginecology",new Date(2021, Calendar.APRIL, 9), "August Smith"));
        appointmentList.add(new Appointment("Candiology",new Date(2021, Calendar.AUGUST, 1), "Andreas Walch"));
        appointmentList.add(new Appointment("Dermatology",new Date(2021, Calendar.AUGUST, 4), "Linda Marcury"));
        appointmentList.add(new Appointment("Dermatology",new Date(2021, Calendar.SEPTEMBER, 12), "Linda Marcury"));
        appointmentList.add(new Appointment("Dermatology",new Date(2021, Calendar.OCTOBER, 12), "Linda Marcury"));
        return appointmentList;
    }

    public void goToAppointmentChanger(View view) {
        Intent intent=new Intent( this, AppointmentChangerActivity.class);
        startActivity(intent);
    }
}