package com.ana.projectatestat.doctor;

import java.util.Date;

public class AppointmentDoctor {

        private String pacient;
        private Date date;
        private String problem;


    public AppointmentDoctor(String pacient, Date date, String problem) {
        this.pacient = pacient;
        this.date = date;
        this.problem = problem;
    }
        public String getPacient() {return pacient;}
        public Date getDate() {return date;}
        public String getProblem() {return problem;}
    }

