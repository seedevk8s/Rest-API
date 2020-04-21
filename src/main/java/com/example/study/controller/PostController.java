package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // <POST 방식>
    // HTML <Form> 태그
    // ajax 검색 (비동기)
    // http post 통신시 body에 data를 집어넣어 보내겠다.
    // json, xml, multipart-form / text-plain 형태 지원함.

    //@RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {

        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put() {

    }

    @PatchMapping("/patchMethod")
    public void patch() {

    }
}














