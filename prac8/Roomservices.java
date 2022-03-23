import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Roomservices {

    Collection<Room> room;

    public void RoomService(){
        // Initialize  collection and asign it to room inventory
        this.room = new LinkedHashSet<>();
    }

    public void createRoom(Boolean avaliable,Integer room_number, LocalDate avaliableDate, Double rate){
        // Add new room to the Room room using the provided parameters
        this.room.add(new Room(avaliable,room_number,avaliableDate,rate));
    }

    





    

    
}
