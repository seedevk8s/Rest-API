package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     //자동적으로 order_detail 테이블에 연결됨
@ToString(exclude = {"user","item"})    //ToString 함수에서 user와 item 변수를 제외시키겠다.--상호참조하고 있는것은 연관관계가 있으므로 제외해줘야함.
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
