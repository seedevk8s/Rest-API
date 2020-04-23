package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // select * from user where account = ?   <--- test03, test04
    Optional<User> findByAccount(String account);         //account에 매칭되는 것을 찾겠다.

    Optional<User> findByEmail(String email);            //email로 검색하겠다.

    // select * from user where account = ?  and email = ?
    // 쿼리를 메서드 형식으로 작성함 =>  QueryMethod라고 함.
    Optional<User> findByAccountAndEmail(String account, String email);

}
