package week3_Q3;

public class Hospital {
    Doctor[] doctors;
    Patient[] patients;

    // Constructor
    public Hospital(Doctor[] doctors, Patient[] patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public void Details() {
        System.out.println("Hospital Details:");

        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            doctor.displayInfo();
        }

        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            patient.displayInfo();
        }
    }

    public void assignDoctors() {
        System.out.println("\nAssigning Doctors to Patients:");

        for (int i = 0; i < patients.length; i++) {
            doctors[i % doctors.length].consult(patients[i]);
            doctors[i % doctors.length].consultationTime();
        }
    }
}
