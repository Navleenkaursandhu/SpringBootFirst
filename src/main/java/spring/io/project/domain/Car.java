package spring.io.project.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Car {

    private final Engine engine;

    @Value("${engine.power}")
    private int power;

    public Car(Engine engine, @Value("${engine.power}") int power) {
        this.engine = engine;
        this.power = power;
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean about to initialize");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean about to terminate");
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", power=" + power +
                '}';
    }
}
