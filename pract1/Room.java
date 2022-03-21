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
