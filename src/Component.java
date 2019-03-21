package src;

public class Component {
    private double failureRate;

    Component(double failureRate) {
        this.failureRate = failureRate;
    }

    /**
     * @return the failureRate
     */
    public double getFailureRate() {
        return failureRate;
    }

    /**
     * @param failureRate the failureRate to set
     */
    public void setFailureRate(double failureRate) {
        this.failureRate = failureRate;
    }

}