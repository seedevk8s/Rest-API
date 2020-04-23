package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     //자동적으로 order_detail 테이블에 연결됨
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderAt;

    // N : 1
    @ManyToOne
    private User user;      // 하이버네이트에서 알아서 user_id를 찾아감

    // N : 1
    @ManyToOne
    private Item item;

}
