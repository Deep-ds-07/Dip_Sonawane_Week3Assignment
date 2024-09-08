package week3_Q3;

public class Doctor extends Person {
    String specialization;
    int experienceYears;

    public Doctor(String name, int age, String specialization, int experienceYears) {
        super(name, age);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " (Specialization: " + specialization + ") is consulting to patient: " + patient.name);
    }

    public void consultationTime() {
        System.out.println("Consultation time: 30 minutes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization in: " + specialization + ", Years of Experience: " + experienceYears);
    }
}
