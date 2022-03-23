import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Room {

    private  Boolean avaliable ;

    private LocalDate checkIn;

    private LocalDate checkOut;

    private Integer roomNumber;

    public static Date parseDate(String checkOut) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(checkOut);
        } catch (ParseException e) {
            return null;
        }
       }

       public static Date parseDate2(String checkIn) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(checkIn);
        } catch (ParseException e) {
            return null;
        }
       }

    public Boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        this.avaliable = avaliable;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

       


    
}
