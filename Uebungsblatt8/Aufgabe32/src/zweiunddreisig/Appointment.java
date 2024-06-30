package zweiunddreisig;

import java.util.ArrayList;
import java.util.Iterator;

public class Appointment {
    private Patient patient;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Appointment(Patient p, ArrayList<Doctor> d) throws AppointmentEception {
        try {
            linkPatient(p);
        } catch (AppointmentEception e) {
            e.printStackTrace();
        }

    }

    public void linkPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getlinkPatient() {
        return Patient;
    }

    public boolean checkDoctors(ArrayList<Doctor> doctors) {
        boolean truefalse = false;
        Iterator<Doctors> it = doctors.iterator();

        while (it.hasNext()) {
            if(it.next().getStatus().equals(CredentialStatus.ALLOWED)) {
                truefalse = true;
            }
        }

        return truefalse;
    }

    public void linkDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void unlinkDoctor() throws AppointmentEception {
        if (doctors.isEmpty()) {
            throw new AppointmentEception("there are no doctors to remove from this appointment");
        }
    }

    public ArrayList<Doctor> getlinkDoctors() {
        return doctors;
    }
}
