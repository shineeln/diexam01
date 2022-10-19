package kr.co.connect.diexam01;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Engine constructor");
    }

    public void exec() {
        System.out.println("Engine executed");
    }
}
