package week3_Q3;

public class Patient extends Person {
    String illness;
    int roomNumber;

    public Patient(String name, int age, String illness, int roomNumber) {
        super(name, age);
        this.illness = illness;
        this.roomNumber = roomNumber;
    }

    public void GetIllness() {
        System.out.println(name + " is suffering from: " + illness);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Illness: " + illness + ", Room Number: " + roomNumber);
    }
}
