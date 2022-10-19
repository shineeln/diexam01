package kr.co.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam04 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig2.class);

//        Car car = (Car) ac.getBean("car");
//        파라미터로 요청하는 class 타입으로 지정 가능합니다.
        Car car = (Car) ac.getBean(Car.class);
        car.run();
    }
}
