import java.util.List;
import java.util.function.Consumer;

public class HalloJavaForEach {
    List <String> liste;

    public HalloJavaForEach(List<String> liste) {
        this.liste = liste;
    }

    public void listeausgeben()
    {
        for (String zeile : liste) {
            System.out.println(zeile);
        }

        liste.forEach((String s) -> System.out.println(s));

        Consumer<String> consumer = (String s) -> System.out.println(s);
        liste.forEach(consumer);

        liste.forEach(System.out::println);
    }
}
