package ru.enovikow.robot;

import ru.enovikow.robot.model.interfaces.Hand;
import ru.enovikow.robot.model.interfaces.Head;
import ru.enovikow.robot.model.interfaces.Leg;
import ru.enovikow.robot.model.interfaces.Robot;

public class ModelT1000 implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void fire() {
        head.thinking();
        leg.moving();
        hand.catching();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
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