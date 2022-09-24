import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberTester {
        NumberTest oddTester;
        NumberTest primeTester;
        NumberTest palindromTester;

        public NumberTester(String fileName)
        {
                try(Scanner scanner = new Scanner(new File(fileName)))
                {
                        int n = Integer.parseInt(scanner.nextLine());
                        ArrayList<Integer> ZahlenZumTesten = new ArrayList<Integer>();

                        scanner.forEachRemaining((String s) -> ZahlenZumTesten.add(Integer.valueOf(s)));        //Genius (:D

                        
                } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                }


        }

        public void testFile(){
                //TODO
        }


        public void setOddEvenTester(NumberTest oddTester)
        {
                this.oddTester = oddTester;
        }

        public void setPrimeTester( NumberTest primeTester ) {this.primeTester = primeTester;}

        public void setPalindromTester(NumberTest palindromTester) {this.palindromTester = palindromTester;}
}
