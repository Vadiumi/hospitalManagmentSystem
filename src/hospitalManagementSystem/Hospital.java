package hospitalManagementSystem;

import java.util.List;

public class Hospital {

    private List<Doctor> doctors;
    private List<Patient> patients;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private static int totalBalance;

    public Hospital(List<Doctor> doctors, List<Patient> patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    /**
     * Add object and update money
     */

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent += MoneySpent;
    }

    /**
     * Getters and Setters
     */

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public int getTotalBalance() {
        return getTotalMoneyEarned() - getTotalMoneySpent();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "doctors=" + doctors +
                ", patients=" + patients +
                '}';
    }
}
