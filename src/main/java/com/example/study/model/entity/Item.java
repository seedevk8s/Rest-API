package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    private Integer price;

    private String content;

    // 1 : N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")       //연관관계 타입은 반드시 LAZY를 추천함. 관련된 것만 select함.   EAGER 타입은 1:1의 경우에 사용 추천함.
    private List<OrderDetail> orderDetailList;

    // LAZY, EAGER 타입 두개 존재함.
    // ----  -----
    //지연로딩, 즉시로딩

    // LAZY 타입 : SELECT * FROM item where id = ?
    // EAGER 타입 :
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    // JOIN
    // select item0_.id as id1_0_0_, item0_.content as content2_0_0_, item0_.name as name3_0_0_, item0_.price as price4_0_0_, orderdetai1_.item_id as item_id3_1_1_, orderdetai1_.id as id1_1_1_, orderdetai1_.id as id1_1_2_, orderdetai1_.item_id as item_id3_1_2_, orderdetai1_.order_at as order_at2_1_2_, orderdetai1_.user_id as user_id4_1_2_, user2_.id as id1_2_3_, user2_.account as account2_2_3_, user2_.created_at as created_3_2_3_, user2_.created_by as created_4_2_3_, user2_.email as email5_2_3_, user2_.phone_number as phone_nu6_2_3_, user2_.updated_at as updated_7_2_3_, user2_.updated_by as updated_8_2_3_ from item item0_ left outer join order_detail orderdetai1_ on item0_.id=orderdetai1_.item_id left outer join user user2_ on orderdetai1_.user_id=user2_.id where item0_.id=?


}












