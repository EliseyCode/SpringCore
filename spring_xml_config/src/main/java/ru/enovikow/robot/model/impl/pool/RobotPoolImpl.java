package ru.enovikow.robot.model.impl.pool;

import ru.enovikow.robot.model.interfaces.Robot;
import ru.enovikow.robot.model.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class RobotPoolImpl implements RobotPool {
    private Collection<Robot> robotCollection;
    private Map<Integer, Robot> robotMap;

    public RobotPoolImpl(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotMap(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Map<Integer, Robot> getRobotMap() {
        return robotMap;
    }

    public void action() {
        robotCollection.forEach(robot -> robot.action());
        robotMap.forEach((year, robot) -> robot.action());
    }
}
