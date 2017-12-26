package ru.enovikow.robot.model.impl.robot;

import ru.enovikow.robot.model.interfaces.Hand;
import ru.enovikow.robot.model.interfaces.Head;
import ru.enovikow.robot.model.interfaces.Leg;
import ru.enovikow.robot.model.interfaces.Robot;

public abstract class BaseModel implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " BaseModel constructor()");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
