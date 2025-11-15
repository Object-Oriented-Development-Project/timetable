package one.group.models.rooms;

public abstract class Room {

    private String id;
    private int capacity;
    private List <TimetableSlot> bookings;

    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
        this.bookings = new ArrayList<>();
    }
    public int getId () {
        return id;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public List <TimetableSlot> getBookings() {
        return bookings;
    }
    public boolean isAvailable (TimetableSlot slot) {
        for (TimetableSlot existingslot : bookings) {
            if (existingSlot.overlaps(slot)) {
                return false;
            }
        }
        return true;
    }
    public boolean addBooking(TimetableSlot slot) {
        if (isAvailable(slot)) {
            bookings.add(slot);
            return true;
        }
        return false
            }
    public abstract RoomType getRoomType();

    @Override
    public String toString() {
        return id + "(" + getRoomType() + ", capacity=" + capacity + ")";
    }
}
