package hospitalManagementSystem;

/**
 * This class describes our patients, name , health status, paid.
 */

public class Patient {

    private int id;
    private String name;
    private String healthStatus;
    private int feesPaid;
    private int feesTotal;

    public Patient(int id, String name, String healthStatus) {
        this.id = id;
        this.name = name;
        this.healthStatus = healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        Hospital.updateTotalMoneyEarned(fees);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
