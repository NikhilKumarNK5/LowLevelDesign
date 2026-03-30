package InterviewQuestions.elevator;

import InterviewQuestions.elevator.enums.ElevatorDirection;

import java.util.List;

public interface ElevatorSelectionStrategy {
    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}
