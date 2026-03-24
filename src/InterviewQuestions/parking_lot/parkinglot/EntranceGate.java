package InterviewQuestions.parking_lot.parkinglot;

import InterviewQuestions.parking_lot.Ticket;
import InterviewQuestions.parking_lot.entity.Vehicle;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}
