public class Resistor {
    private double resistance;
    private double failureRate;

    /**
     * @return the failureRate
     */
    public double getFailureRate() {
        return failureRate;
    }

    /**
     * @return the resistance
     */
    public double getResistance() {
        return resistance;
    }

    /**
     * @param resistance the resistance to set
     */
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    /**
     * @param failureRate the failureRate to set
     */
    public void setFailureRate(double failureRate) {
        this.failureRate = failureRate;
    }

}