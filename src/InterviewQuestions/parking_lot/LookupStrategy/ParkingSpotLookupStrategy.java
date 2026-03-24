package InterviewQuestions.parking_lot.LookupStrategy;

import InterviewQuestions.parking_lot.entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}
