package com.ana.projectatestat.doctor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ana.projectatestat.R;
import com.ana.projectatestat.pacient.AppointmentListAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DoctorFeedActivity  extends AppCompatActivity {
    private RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorfeedactivity);
        recyclerView1= findViewById(R.id.appointmentListDoctor);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(manager);

        AppointmentDoctorListAdapter adapter=new AppointmentDoctorListAdapter(getData());
        recyclerView1.setAdapter(adapter);

    }
    public List<AppointmentDoctor> getData()
    {
        List<AppointmentDoctor> appointmentDoctorList= new ArrayList<>();
        appointmentDoctorList.add(new AppointmentDoctor("Anika Pogel",new Date(2021, Calendar.MARCH, 12), "headache"));
        appointmentDoctorList.add(new AppointmentDoctor("Geremy Hich",new Date(2021, Calendar.APRIL, 12) , "cancer"));


        return appointmentDoctorList;
    }
}
