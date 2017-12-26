package ru.enovikow.robot.model.impl.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.enovikow.robot.model.interfaces.Hand;
import ru.enovikow.robot.model.interfaces.Head;
import ru.enovikow.robot.model.interfaces.Leg;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {
    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super(head, hand, leg);
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean hasSound) {
        super(head, hand, leg);
        this.color = color;
        this.year = year;
        this.soundEnabled = hasSound;
    }

    @Override
    public void action() {
        getHead().thinking();
        getLeg().moving();
        getHand().catching();

        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Can produce sound: " + isSoundEnabled());
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INIT");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DESTROY");
    }
}