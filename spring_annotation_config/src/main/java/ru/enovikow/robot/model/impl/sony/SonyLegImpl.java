package ru.enovikow.robot.model.impl.sony;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.enovikow.robot.model.interfaces.Leg;

@Component
@Lazy
public class SonyLegImpl implements Leg {
    public void moving() {
        System.out.println("Move by Sony legs");
    }
}
