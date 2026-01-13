package assignment_10;

public class Policy {
    private int policyId;
    private double premium;
    public Policy(int policyId, int age) {
        this.policyId = policyId;
        calculatePremium(age); 
    }
    private void calculatePremium(int age) {
        if (age < 25) {
            premium = 5000;
        } else if (age <= 40) {
            premium = 3000;
        } else {
            premium = 2000;
        }
    }
    public String getPolicyDetails() {
        return "Policy ID: " + policyId + ", Premium: " + premium;
    }
}
