import Beispiel3.NumberTester;

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
    }
}