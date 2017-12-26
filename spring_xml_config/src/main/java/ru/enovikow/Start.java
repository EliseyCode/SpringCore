package ru.enovikow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.enovikow.robot.model.impl.pool.RobotPoolImpl;
import ru.enovikow.robot.model.impl.robot.ModelT1000;
import ru.enovikow.robot.model.interfaces.Robot;
import ru.enovikow.robot.model.interfaces.RobotConveyor;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");

        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator1 " + terminator1);
        System.out.println("terminator2 " + terminator2);
        System.out.println("terminator3 " + terminator3);

        RobotPoolImpl t1000Pool = (RobotPoolImpl) context.getBean("t1000Pool");
        t1000Pool.action();

        ModelT1000 t1000Property = (ModelT1000) context.getBean("t1000Property");
        t1000Property.action();

        ModelT1000 t1000Constructor = (ModelT1000) context.getBean("t1000Constructor");
        t1000Constructor.action();
    }
}