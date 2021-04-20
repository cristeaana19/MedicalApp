package com.ana.projectatestat.doctor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ana.projectatestat.R;


import java.util.List;

public class AppointmentDoctorListAdapter extends RecyclerView.Adapter<AppointmentDoctorListAdapter.AppointmentDoctorListViewHolder> {
    private List<AppointmentDoctor> appointmentDoctorList;

    public AppointmentDoctorListAdapter(List<AppointmentDoctor> appointmentList) {
        this.appointmentDoctorList = appointmentList;
    }

    @NonNull
    @Override
    public AppointmentDoctorListAdapter.AppointmentDoctorListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_doctor_list_item, parent, false);
        return new AppointmentDoctorListAdapter.AppointmentDoctorListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentDoctorListAdapter.AppointmentDoctorListViewHolder holder, int position) {
        AppointmentDoctor appointment = appointmentDoctorList.get(position);
        holder.getPacientTextView().setText(appointment.getPacient());
        holder.getDateTextView().setText(appointment.getDate().toString());
        holder.getProblemTextView().setText(appointment.getProblem());

    }

    @Override
    public int getItemCount() {
        return appointmentDoctorList.size();
    }

    public static class AppointmentDoctorListViewHolder extends RecyclerView.ViewHolder {
        private final TextView pacientTextView;
        private final TextView dateTextView;
        private final TextView problemTextView;

        public AppointmentDoctorListViewHolder(@NonNull View itemView) {
            super(itemView);
            pacientTextView= itemView.findViewById(R.id.pacient_textView);
            dateTextView = itemView.findViewById(R.id.date_textView);
            problemTextView = itemView.findViewById(R.id.problem_textView);

        }


        public TextView getPacientTextView() {
            return pacientTextView;
        }

        public TextView getDateTextView() {
            return dateTextView;
        }
        public TextView getProblemTextView() {
            return problemTextView;
        }
    }
}


