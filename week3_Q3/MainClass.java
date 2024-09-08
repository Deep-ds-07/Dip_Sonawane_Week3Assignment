package week3_Q3;

public class MainClass {
    public static void main(String[] args) {
    	
    	System.out.println("<<<<<< WELCOME TO SONAWANE >>>>>>");

    	Doctor doc1 = new Doctor("Shubham Chaudhari", 26, "MBBS", 6);
        Doctor doc2 = new Doctor("Sonali Khairnar", 23, "BHMS", 3);

        Patient pat1 = new Patient("Leena", 17, "Dengue ", 27);
        Patient pat2 = new Patient("Chirag", 13, "viral Fever", 16);

        // Create a hospital with doctors and patients
        Doctor[] doctors = {doc1, doc2};
        Patient[] patients = {pat1, pat2};

        Hospital hospital = new Hospital(doctors, patients);

        hospital.Details();

        hospital.assignDoctors();
    }
}
