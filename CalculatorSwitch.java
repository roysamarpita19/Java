import java.util.Scanner;




public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double addition = a+b;
        double substraction = a-b;
        double multiplication = a*b;
        double division = a/b;
        double modulo = a%b;
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("The addition is"+ addition);
            break;
            case 2: System.out.println("The substraction is"+ substraction);
            break;
            case 3: System.out.println("The multiplication is"+ multiplication);
            break;
            case 4: System.out.println("The division is"+ division);
            break;
            case 5: System.out.println("The modulo is"+ modulo);
            break;
            default: System.out.println("Invalid choice");
        }
           
    }

    
}
