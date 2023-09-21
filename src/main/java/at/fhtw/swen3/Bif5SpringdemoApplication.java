package at.fhtw.swen3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bif5SpringdemoApplication {

    @Autowired
    private ComponentA componentA;

    public static void main(String[] args) {
        SpringApplication.run(Bif5SpringdemoApplication.class, args);
    }

    @PostConstruct
    void startup(){
        componentA.demo();
    }

}
