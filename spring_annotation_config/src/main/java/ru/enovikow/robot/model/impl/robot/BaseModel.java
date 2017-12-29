package ru.enovikow.robot.model.impl.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.enovikow.robot.model.interfaces.Hand;
import ru.enovikow.robot.model.interfaces.Head;
import ru.enovikow.robot.model.interfaces.Leg;
import ru.enovikow.robot.model.interfaces.Robot;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("sonyHeadImpl")
    private Head head;

    @Autowired
    @Qualifier("sonyHandImpl")
    private Hand hand;

    @Autowired
    @Qualifier("toshibaLegImpl")
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " BaseModel constructor()");
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
