package lifeCycle;

import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton
public class Student{
    private String name;

    public String getName() {
        return name;
    }
    @PostConstruct
    private  void inilialize(){
        System.out.println("This will be called after bean initialization");
        System.out.println("Testing student...");
    name="Ajay";τ
    }

    @PreDestroy
    private void destroy(){
        System.out.println("This will be called before bean destruction");
    }
}
