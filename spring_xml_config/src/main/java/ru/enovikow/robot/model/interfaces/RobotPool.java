package ru.enovikow.robot.model.interfaces;

import java.util.Collection;
import java.util.Map;

public interface RobotPool {
    Collection<Robot> getRobotCollection();

    Map<Integer, Robot> getRobotMap();
}
