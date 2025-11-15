package one.group.models.rooms;

import java.util.ArrayList;
import java.util.List;
import one.group.models.timeslots.TimetableSlot;

/**
*An abstract representation of a room within the timetable system.
*A room has a unique ID, a capacity, and a list of timetable bookings.
*
*<p> This class provides functionality for checking room availabilty,
*retrieving room attributes, and managing bookings. <p>
*/
public abstract class Room {

    /**Unique identifier for the room. */
    private String id;

    /**Maximum number of occupants teh room can hold.*/
    private int capacity;

    /**List of timetable slots during which the room is booked. */
    private List <TimetableSlot> bookings;

    /**
    *Constructs a Room with a specified ID and capacity.
    *
    *@param id     the unique identifier for the room
    *@param capacity the maximum number of people the room can hold
    */
    public Room(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
        this.bookings = new ArrayList<>();
    }

    /**
    *Returns the unique identifier of the room.
    *
    *@return the room ID
    */
    public int getId () {
        return id;
    }

    /**
    *Returns the maximum capacity of the room.
    *
    *@return the room capacity
    */
    public int getCapacity() {
        return capacity;
    }

    /**
    *Returns the list of timetable slots for which the room is booked.
    *
    *@return a list of booked TimetableSlot.
    */
    public List <TimetableSlot> getBookings() {
        return bookings;
    }

    /**
    *Checks whether the room is available during a specific timetable slot.
    *A room is unavailable if an existing booking overlaps with the given slot.
    *
    *@param slot the timetable slot to check availability for
    *@return true if the room is free at the given slot,
    *@return false otherwise
    */
    public boolean isAvailable (TimetableSlot slot) {
        for (TimetableSlot existingslot : bookings) {
            if (existingSlot.overlaps(slot)) {
                return false;
            }
        }
        return true;
    }

    /**
    *Attemps to add a booking to this room if the given time is available.
    *
    *@param slot the TimetableSlot to be booked
    *@return true if the booking was succesfully added
    *@return false otherwise.
    */
    public boolean addBooking(TimetableSlot slot) {
        if (isAvailable(slot)) {
            bookings.add(slot);
            return true;
        }
        return false
            }
    /**
    *Returns the type of this room.
    *
    *@return the room type associated with this room
    */
    public abstract RoomType getRoomType();

    /**
    *Returns a string represntation of this room, including its ID,
    *type, and capacity.
    *
    *@return a formatted string describing the room
    */
    @Override
    public String toString() {
        return id + "(" + getRoomType() + ", capacity=" + capacity + ")";
    }
    /**
    *Checks whether a given timeslot is available for booking
    *Assumed to exist based on usage
    *
    *@param slot the slot to check
    *@return code true if slot is free
    *@return false otherwise
    */
    protected abstract boolean isAvailable(TimetableSlot Slot);
}
   
