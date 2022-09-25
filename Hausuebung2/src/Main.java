import Beispiel3.NumberTester;
import Beispiel4.*;
import Beispiel4.Number;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List l = new ArrayList();
        //l.add("Hallo");
        //l.add("Welt");
        //l.add("!");
        //Beispiel2.HalloJavaForEach hallo = new Beispiel2.HalloJavaForEach(l);
        //hallo.listeausgeben();

        NumberTester nt = new NumberTester("src/Dateien/ZahlenZumTesten");
        nt.testFile();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        RationalCalculator rationalCalculator = new RationalCalculator();
        VectorCalculator vectorCalculator = new VectorCalculator();
        ComplexCalculator complexCalculator = new ComplexCalculator();
        AbstractCalculator[] calculators = {rationalCalculator, vectorCalculator, complexCalculator};

        while (true)
        {
            int calculator = chooseCalculator(scanner);
            if (calculator == 4)
            {return;}
            Number x = null;
            Number y = null;
            x = erstelleNumber(scanner, "x");
            y = erstelleNumber(scanner, "y");

            int choosenOperation = 0;
            if (calculator == 2)
            {
                choosenOperation = chooseOperationForVector(scanner);
            }else
            {
                choosenOperation = chooseOperation(scanner);
            }

            switch (choosenOperation)
            {
                case 1:
                    solution(calculators[calculator -1].add(x,y), calculator, choosenOperation);
                    break;
                case 2:
                    solution(calculators[calculator -1].subtract(x,y), calculator, choosenOperation);
                    break;
                case 3:
                    solution(calculators[calculator -1].multiply(x,y), calculator, choosenOperation);
                    break;
                case 4:
                    solution(calculators[calculator -1].divide(x,y), calculator, choosenOperation);
                    break;
                default:
                    break;
            }
        }
    }

    public static int chooseCalculator(Scanner scanner)
    {
        System.out.println("1 _ Relational calculator");
        System.out.println("2 _ Vector calculator");
        System.out.println("3 _ Complex calculator");
        System.out.println("4 _ Exit program");

        int a = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return a;
    }

    public static Number erstelleNumber(Scanner scanner, String name)
    {
        Number x = new Number();
        System.out.print("Enter number " + name + " a");
        x.setA(Double.parseDouble(scanner.nextLine()));
        System.out.print("Enter number " + name + " b");
        x.setB(Double.parseDouble(scanner.nextLine()));
        System.out.println();
        return x;
    }

    public static int chooseOperation(Scanner scanner)
    {
        System.out.println("1 _ add");
        System.out.println("2 _ subtract");
        System.out.println("3 _ multiply");
        System.out.println("4 _ divide");
        System.out.println("5 _ cancel");

        int choosed = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return choosed;
    }

    public static int chooseOperationForVector(Scanner scanner)
    {
        System.out.println("1 _ add");
        System.out.println("2 _ subtract");
        System.out.println("3 _ multiply");
        System.out.println("5 _ enter numbers again");

        int choosed = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return choosed;
    }

    public static void solution(Number c, int calculator, int operation)
    {
        if (calculator == 2)
        {
            solutionVector(c, operation);
        }else {
            System.out.println("Solution:");
            System.out.println("a = " + c.getA());
            System.out.println("b = " + c.getB());
            System.out.println();
        }
    }

    public static void solutionVector(Number c, int operation)
    {
        if(operation == 3)
        {
            System.out.println("Solution: " + (c.getB() + c.getA()));
            System.out.println();
        }else {
            System.out.println("Solution:");
            System.out.println("a = " + c.getA());
            System.out.println("b = " + c.getB());
            System.out.println();
        }
    }
}