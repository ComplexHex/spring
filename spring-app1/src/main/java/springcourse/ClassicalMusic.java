package springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private String song;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruction");
    }


    @Override
    public String getSong() {
        return song;
    }
}
