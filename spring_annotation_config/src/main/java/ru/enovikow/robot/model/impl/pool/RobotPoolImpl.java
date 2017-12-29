package ru.enovikow.robot.model.impl.pool;

import org.springframework.beans.factory.annotation.Autowired;
import ru.enovikow.robot.model.impl.robot.Color;
import ru.enovikow.robot.model.impl.robot.ColorQualifier;
import ru.enovikow.robot.model.impl.robot.ModelT1000;
import ru.enovikow.robot.model.interfaces.Robot;
import ru.enovikow.robot.model.interfaces.RobotPool;

public class RobotPoolImpl implements RobotPool {

    @Autowired
    @ColorQualifier(color = Color.GOLDEN)
    private ModelT1000 goldenHeadRobot;

    @Autowired
    @ColorQualifier(color = Color.BLACK)
    private Robot blackHeadRobot;


    public RobotPoolImpl() {
    }
}
