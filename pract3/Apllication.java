import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Apllication {

    public static void main (String arg[]){

        Collection<String> c = new ArrayList<>();

        c.add("linux");
        c.add("explotation");
        c.add("python");
        c.add("java");
        c.add("linux");

        Collection<String> favoriteTopic = new HashSet<>(c);

        System.out.println(favoriteTopic);
    }
    
}
