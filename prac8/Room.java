import java.time.LocalDate;

public class Room {
   
    private Boolean avaliable;

    private Integer room_number;

    private LocalDate avaliableDate;

    private Double rate;

    

    public Room(Boolean avaliable, Integer room_number, LocalDate avaliableDate, Double rate) {
        this.avaliable = avaliable;
        this.room_number = room_number;
        this.avaliableDate = avaliableDate;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Room [avaliable=" + avaliable + ", avaliableDate=" + avaliableDate + ", rate=" + rate + ", room_number="
                + room_number + "]";
    }

    public Boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        this.avaliable = avaliable;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public LocalDate getAvaliableDate() {
        return avaliableDate;
    }

    public void setAvaliableDate(LocalDate avaliableDate) {
        this.avaliableDate = avaliableDate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((avaliable == null) ? 0 : avaliable.hashCode());
        result = prime * result + ((avaliableDate == null) ? 0 : avaliableDate.hashCode());
        result = prime * result + ((rate == null) ? 0 : rate.hashCode());
        result = prime * result + ((room_number == null) ? 0 : room_number.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        if (avaliable == null) {
            if (other.avaliable != null)
                return false;
        } else if (!avaliable.equals(other.avaliable))
            return false;
        if (avaliableDate == null) {
            if (other.avaliableDate != null)
                return false;
        } else if (!avaliableDate.equals(other.avaliableDate))
            return false;
        if (rate == null) {
            if (other.rate != null)
                return false;
        } else if (!rate.equals(other.rate))
            return false;
        if (room_number == null) {
            if (other.room_number != null)
                return false;
        } else if (!room_number.equals(other.room_number))
            return false;
        return true;
    }

    
}
