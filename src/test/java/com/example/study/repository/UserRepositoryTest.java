package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends StudyApplicationTests {

    // Dependency Injection(DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        // String sql = insert into user (%s, %s, %d) value (account, email, age);

        User user = new User();
        user.setAccount("chjin3");
        user.setEmail("chjin3@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("chjin3");

        User newUser = userRepository.save(user);
        System.out.println("newUser3 : " +newUser);
    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
