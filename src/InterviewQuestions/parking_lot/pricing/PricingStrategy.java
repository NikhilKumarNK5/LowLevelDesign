package InterviewQuestions.parking_lot.pricing;

import InterviewQuestions.parking_lot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

