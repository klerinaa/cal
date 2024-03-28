import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator =new Calculator();
        while(true){
            System.out.println("Advanced Calculator");
            System.out.println("1.Addition(+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Memory Functions");
            System.out.println("7. Exit");
            System.out.print("Select an operation (1/2/3/4/5/6/7): ");

            int choice=scanner.nextInt();
            if(choice==7){
                System.out.println("Exiting Caluclator");
                break;
            }
            double result =0.0;
            double num1;
            double num2;
            switch (choice){
                case 1:
                    System.out.println("enter first number");
                    num1=scanner.nextDouble();
                    System.out.println("enter second number");
                    num2=scanner.nextDouble();
                    result= calculator.add(num1,num2);
                    break;
                case 2:
                    System.out.println("enter first number");
                    num1=scanner.nextDouble();
                    System.out.println("enter second number");
                    num2=scanner.nextDouble();
                    result= calculator.subtract(num1,num2);
                    break;
                case 3:
                    System.out.println("enter first number");
                    num1=scanner.nextDouble();
                    System.out.println("enter second number");
                    num2=scanner.nextDouble();
                    result= calculator.multiply(num1,num2);
                    break;
                case 4:
                    System.out.println("enter first number");
                    num1=scanner.nextDouble();
                    System.out.println("enter second number");
                    num2=scanner.nextDouble();
                    result= calculator.divide(num1,num2);
                    break;
                case 5:
                    System.out.println("enter  number");
                    num1=scanner.nextDouble();
                    result= calculator.squareRoot(num1);
                    break;
                case 6:
                    handleMemoryFunctions(scanner,calculator);
                    continue;
                default:
                    System.out.println("Invalid choice of menu");
                    continue;


            }
            System.out.println("Result : "+result);
        }

    }
    private static void handleMemoryFunctions(Scanner scanner, Calculator calculator){
        System.out.println("Memory Functions");
        System.out.println("1.Add to Memory (M+)");
        System.out.println("2.Clear Memory (MC)");
        System.out.println("3.Recall Memory (MR)");
        System.out.println("Select a memory function(1/2/3)");
        int memoryChoice=scanner.nextInt();
        switch (memoryChoice){
            case 1:
                System.out.println("Enter value to add to memory :");
                double valueToAdd=scanner.nextDouble();
                calculator.addToMemory(valueToAdd);
                System.out.println("Value added to memory");
                break;

            case 2:
                calculator.clearMemory();
                System.out.println("Memory cleared");
                break;
            case 3:
                double reCalledValue=calculator.recallMemory();
                System.out.println("Value recalled from memory : " + reCalledValue);
                break;
            default:
                System.out.println("Invalid Choice.");
        }


    }
}