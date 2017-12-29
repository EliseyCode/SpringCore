package ru.enovikow.robot.model.impl.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.enovikow.robot.model.interfaces.Leg;

@Component
@Lazy
public class ToshibaLegImpl implements Leg {
    public void moving() {
        System.out.println("Move by Toshiba legs");
    }
}
