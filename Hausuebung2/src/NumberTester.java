import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class NumberTester {
        ArrayList<Integer> ZahlenZumTesten = new ArrayList<>();
        NumberTest oddTester;
        NumberTest primeTester;
        NumberTest palindromTester;

        public NumberTester(String fileName)
        {
                try(Scanner scanner = new Scanner(new File(fileName)))
                {
                        int n = Integer.parseInt(scanner.nextLine());

                        scanner.forEachRemaining((String s) -> ZahlenZumTesten.add(Integer.valueOf(s)));        //Genius (:D

                } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                }

                setOddEvenTester((int number) -> number%2 != 0);

                setPrimeTester((int number) -> {for (int i = number - 1; i > 1;i--){
                        if (number%i == 0.0) {
                                return false;
                        }
                }
                        return true;
                });

                setPalindromTester((int number) -> {
                        String str = String.valueOf(number);
                        int i = 0, j = str.length() - 1;
                        while (i < j) {
                                if (str.charAt(i) != str.charAt(j))
                                        return false;
                                i++;j--;
                        }
                        return true;
                });

                //System.out.println(oddTester.testNumber(ZahlenZumTesten.get(3)));     Wollte schauen ob es funktioniert
        }

        public void testFile(){
                for (int i = 0; i < ZahlenZumTesten.size(); i++)
                {
                        switch (ZahlenZumTesten.get(i))
                        {
                                case 1: System.out.println("Odd = " + oddTester.testNumber(ZahlenZumTesten.get(++i)));
                                        break;
                                case 2: System.out.println("Prime = " + primeTester.testNumber(ZahlenZumTesten.get(++i)));
                                        break;
                                case 3: System.out.println("Palindrome = " + palindromTester.testNumber(ZahlenZumTesten.get(++i)));
                                break;
                                default: ++i; System.out.println("Ungültig");
                                break;
                        }
                }
        }


        public void setOddEvenTester(NumberTest oddTester) {this.oddTester = oddTester;}

        public void setPrimeTester( NumberTest primeTester ) {this.primeTester = primeTester;}

        public void setPalindromTester(NumberTest palindromTester) {this.palindromTester = palindromTester;}
}
