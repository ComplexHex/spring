package springcourse;

import org.springframework.stereotype.Component;

@Component()
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    // factory method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("initialization");
    }

    public void doMyDestroy() {
        System.out.println("destruction");
    }


    @Override
    public String getSong() {
        return "Rapsody";
    }
}
