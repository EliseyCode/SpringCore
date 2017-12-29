package ru.enovikow.robot.model.impl.sony;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.enovikow.robot.model.interfaces.Head;

@Component
@Lazy
public class SonyHeadImpl implements Head {
    public void thinking() {
        System.out.println("Thinking by Sony head");
    }
}
