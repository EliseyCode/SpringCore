package ru.enovikow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.enovikow.robot.model.impl.robot.ModelT1000;


public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ModelT1000 robotGolden = (ModelT1000) context.getBean("model1");
        robotGolden.action();

        ModelT1000 robotBlack = (ModelT1000) context.getBean("model2");
        robotBlack.action();
    }
}