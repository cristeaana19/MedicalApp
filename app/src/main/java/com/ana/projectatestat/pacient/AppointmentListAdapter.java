package com.ana.projectatestat.pacient;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ana.projectatestat.R;

import java.util.List;

public class AppointmentListAdapter extends RecyclerView.Adapter<AppointmentListAdapter.AppointmentListViewHolder> {
    private List<Appointment> appointmentList;

    public AppointmentListAdapter(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    @NonNull
    @Override
    public AppointmentListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_list_item, parent, false);
        return new AppointmentListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentListViewHolder holder, int position) {
        Appointment appointment = appointmentList.get(position);
        holder.getAppointmentNameTextView().setText(appointment.getAppointmentname());
        holder.getDateTextView().setText(appointment.getDate().toString());
        holder.getDoctorTextView().setText(appointment.getDoctor());

    }

    @Override
    public int getItemCount() {
        return appointmentList.size();
    }

    public static class AppointmentListViewHolder extends RecyclerView.ViewHolder {
        private final TextView appointmentNameTextView;
        private final TextView dateTextView;
        private final TextView doctorTextView;

        public AppointmentListViewHolder(@NonNull View itemView) {
            super(itemView);
            appointmentNameTextView= itemView.findViewById(R.id.name_textView);
            dateTextView = itemView.findViewById(R.id.date_textView);
            doctorTextView = itemView.findViewById(R.id.doctor_textView);

        }


        public TextView getAppointmentNameTextView() {
            return appointmentNameTextView;
        }

        public TextView getDateTextView() {
            return dateTextView;
        }
        public TextView getDoctorTextView() {
            return doctorTextView;
        }
    }
}

