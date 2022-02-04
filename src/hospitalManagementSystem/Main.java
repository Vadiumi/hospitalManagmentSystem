package hospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * This is a hospital management system.
     * In it, you can set the characteristics of doctors and patients.
     * For example, name, ID number, health status, salary.
     * You can also record and count all the money deposited and spent.
     */
    public static void main(String[] args) {

        Doctor Martin = new Doctor(1, "Martin", 1000);
        Doctor Ann = new Doctor(2, "Ann", 1200);
        Doctor John = new Doctor(3, "John", 850);

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(Martin);
        doctorList.add(Ann);
        doctorList.add(John);

        doctorList.forEach(System.out::println);

        System.out.println();
        Patient Maggy = new Patient(1, "Maggy", "Good");
        Patient Harry = new Patient(2, "Harry", "Excellent");
        Patient Adam = new Patient(3, "Adam", "Not Good");

        List<Patient> patientList = new ArrayList<>();
        patientList.add(Maggy);
        patientList.add(Harry);
        patientList.add(Adam);

        patientList.forEach(System.out::println);

        Hospital hospital = new Hospital(doctorList, patientList);

        System.out.println("-----Received money-----");
        Harry.payFees(9500);
        System.out.println("Harry received: " + Harry.getFeesPaid());
        Maggy.payFees(11100);
        System.out.println("Maggy received: " + Maggy.getFeesPaid());
        Adam.payFees(13200);
        System.out.println("Adam received: " + Adam.getFeesPaid());
        System.out.println("Total received money: " + hospital.getTotalMoneyEarned());


        System.out.println("-----Spent money-----");
        Ann.setSalary(7500);
        Ann.receiveSalary(Ann.getSalary());
        System.out.println("Ann get salary: " + Ann.getSalary());
        Martin.setSalary(9600);
        Martin.receiveSalary(Martin.getSalary());
        System.out.println("Martin get salary: " + Martin.getSalary());
        John.setSalary(10450);
        John.receiveSalary(John.getSalary());
        System.out.println("John get salary: " + John.getSalary());
        System.out.println("Total spent money: " + hospital.getTotalMoneySpent());

        System.out.println();
        System.out.println("Total hospital money balance: " + hospital.getTotalBalance());
    }
}
