
import java.util.Collection;
import java.util.Iterator;
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
        oxford.setPetFriendly(true);
        machester.setPetFriendly(true);

        // This code will run on java 9 and above version
        
        // Collection<Room> rooms =  new ArrayList<>(Arrays.asList(cambridge,machester,oxford,paccidilly));

        //  Method :: 1

        // Collection<Room> removeRooms = new ArrayList<>();

        // for (Room room : rooms) {
        //     if(room.isPetFriendly()){
        //        removeRooms.add(room);
        //     }
        // }

        // rooms.removeAll(removeRooms);

        // Method :: 2

        Iterator<Room> iterator = rooms.iterator();
        while(iterator.hasNext()){
            Room room = iterator.next();
            if(room.isPetFriendly()){
                iterator.remove();
            }
        }
        

        rooms.stream().forEach(r -> System.out.println(r.getName())); 
    }
}
