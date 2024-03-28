public class Calculator {
    private Memory memory = new Memory();

    public double add(double num1, double num2) {
        double result = num1 + num2;
        memory.addToMemory(result);
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        memory.addToMemory(result);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        memory.addToMemory(result);
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            memory.addToMemory(result);
            return result;
        } else {
            return 0;
        }
    }

    public double squareRoot(double num) {
        if (num >= 0) {
            double result = Math.sqrt(num);
            memory.addToMemory(result);
            return result;
        } else {
            return 0;
        }
    }

    public double recallMemory() {
        return memory.recallMemory();
    }

    public void clearMemory() {
        memory.clearMemory();
    }
    public void addToMemory(double value) {
        memory.addToMemory(value);
    }
}
