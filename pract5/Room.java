public class Room {
    
    private String name;
    
    private String type;

    private Integer capacity;

    private Double rate;

    public Room(String name, String type, Integer capacity, Double rate) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.rate = rate;
	}

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public Double getRate() {
        return rate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((rate == null) ? 0 : rate.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        if (capacity == null) {
            if (other.capacity != null)
                return false;
        } else if (!capacity.equals(other.capacity))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rate == null) {
            if (other.rate != null)
                return false;
        } else if (!rate.equals(other.rate))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    @Override
	public String toString() {
		return "Room [name=" + name + ", type=" + type + ", capacity=" + capacity + ", rate=" + rate
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
