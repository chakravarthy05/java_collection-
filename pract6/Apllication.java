import java.util.Collection;
import java.util.stream.*;

public class Apllication {

    public static void main(String arg []){

        Room cambridge = new Room("cambridge", "premiere room", 4 , 175.00);
        Room machester = new Room("machester", "suite", 2 , 105.00);
        Room oxford = new Room("oxford", "Guest room", 3 , 250.00);
        Room paccidilly = new Room("paccidilly", "suite", 4 , 125.00);

        
        // This code for java 8 version

        Collection<Room> rooms = Stream.of(cambridge,machester,oxford,paccidilly).collect(
            Collectors.toList()
        );
        // This code will run on java 9 and above version

        // Collection<Room> rooms =  new ArrayList<>(Arrays.asList(cambridge,machester,oxford,paccidilly));
 
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
      
    }

   
    
}
