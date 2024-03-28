public class Memory {
    private double value;

    public void addToMemory(double newValue) {
        value += newValue;
    }

    public double recallMemory() {
        return value;
    }

    public void clearMemory() {
        value = 0.0;
    }
}
