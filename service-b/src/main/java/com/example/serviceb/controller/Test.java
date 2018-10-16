package com.example.serviceb.controller;
import com.example.common.bo.TestRequestBo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @PostMapping("/rpc")
    public String rpc(TestRequestBo testRequestB){
       return 1/0+"来自B1的消息："+testRequestB.toString();
    }

    @PostMapping("/fallback")
    public String fallback(){
        return "B1 FALLBACK";
    }

}
