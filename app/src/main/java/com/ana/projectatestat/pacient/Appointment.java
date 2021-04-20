package com.ana.projectatestat.pacient;

import java.util.Date;

public class Appointment {
    private String appointmentname;
    private Date date;
    private String doctor;


    public Appointment(String appointmentname, Date date, String doctor) {
        this.appointmentname = appointmentname;
        this.date = date;
        this.doctor = doctor;
    }
    public String getAppointmentname() {return appointmentname;}
    public Date getDate() {return date;}
    public String getDoctor() {return doctor;}
}
