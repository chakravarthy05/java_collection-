import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedHashSet;



public class UserServices {

    Collection<User> user;
    
    public void userService(){
        // Initialize  collection and asign it to room inventory
        this.user = new LinkedHashSet<>();
    }

    public void createUser(Integer room_number,LocalDate checkIn,LocalDate checkOut){
        // Add new room to the Room room using the provided parameters
        this.user.add(new User(room_number,checkIn,checkOut));
    }

    public Room[] asArray(){
        //Return all Rooms as an Array of Room  in the **order** they were added.  
        return this.user.toArray(new Room[0]);
    }


}
