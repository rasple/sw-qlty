package src;

public class System1 implements SystemInterface {
    public double reliability(Component[] components) {
        double totalFailureRate = 1;
        for (Component comp : components) {
            totalFailureRate *= (1 - Math.exp(-comp.getFailureRate() * 87600));
        }
        return 1-totalFailureRate;
    }
}