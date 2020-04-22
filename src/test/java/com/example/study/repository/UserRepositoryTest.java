package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Optional;

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

    @Test
    public User read(@RequestParam Long id) {
        Optional<User> user = userRepository.findById(id);

        user.ifPresent(selectUser -> {
            System.out.println("selectUser " + selectUser);
            System.out.println("email : " + selectUser.getEmail());
        });

        return user.get();
    }

    public void update() {

    }

    public void delete() {

    }
}
