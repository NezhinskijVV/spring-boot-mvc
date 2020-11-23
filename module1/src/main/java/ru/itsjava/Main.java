package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.repository.UserRepository;
import ru.itsjava.service.UserService;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        var context = new SpringApplication(Main.class).run();
        System.out.println(context.getBean(UserService.class).findById(1L));
    }
}
