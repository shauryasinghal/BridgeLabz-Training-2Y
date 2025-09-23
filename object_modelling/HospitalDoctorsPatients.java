
// Self Problem 3: Hospital, Doctors, and Patients (Association + Communication)
import java.util.*;

class Doctor {
    String name;
    Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Hospital {
    String name;
    Hospital(String name) { this.name = name; }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Smith");
        Patient p1 = new Patient("Alex");

        d1.consult(p1);
    }
}
