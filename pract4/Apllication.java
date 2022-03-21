import java.util.ArrayList;
import java.util.Collection;

public class Apllication {
    public static void main (String arg []){
        
        Collection<Room> room =  new ArrayList<>();

        room.add(new Room("hyderabad", "suite",4,175.00));
        room.add(new Room("kothagudem", "ac room",3,105.00));
        room.add(new Room("visakhapatnam", "delux",5,251.00));


        room.stream().forEach(r -> System.out.println(r.getName()));

    }
}
