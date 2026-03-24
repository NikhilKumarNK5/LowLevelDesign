package InterviewQuestions.parking_lot;

import InterviewQuestions.parking_lot.entity.ParkingSpot;
import InterviewQuestions.parking_lot.parkinglot.ParkingLevel;
import InterviewQuestions.parking_lot.entity.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    private final Vehicle vehicle;
    private final ParkingLevel level;
    private final ParkingSpot spot;
    private final LocalDateTime entryTime;

    public Ticket(Vehicle vehicle,
                  ParkingLevel level,
                  ParkingSpot spot) {
        this.vehicle = vehicle;
        this.level = level;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingLevel getLevel() {
        return level;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
