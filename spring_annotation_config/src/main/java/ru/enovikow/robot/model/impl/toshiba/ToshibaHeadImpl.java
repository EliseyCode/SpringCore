package ru.enovikow.robot.model.impl.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.enovikow.robot.model.interfaces.Head;

@Component
@Lazy
public class ToshibaHeadImpl implements Head {
    public void thinking() {
        System.out.println("Thinking by Toshiba head");
    }

}
