package ru.complexhex.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do initialization");
    }

    @Override
    public String getSong() {
        return "Spring";
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do destruction");
    }
}
