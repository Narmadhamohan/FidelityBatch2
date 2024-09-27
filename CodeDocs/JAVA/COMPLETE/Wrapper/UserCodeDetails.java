package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class UserCodeDetails {


    public static void main(String[] args) {

        Map<String,Integer> userCodeMap = new HashMap<>();
        userCodeMap.put("admin",1);
        userCodeMap.put("user",2);
        userCodeMap.put("user2",3);
        userCodeMap.put("user3",4);
        userCodeMap.forEach((key,value) -> System.out.println(key+":"+value));

        for(Integer value: userCodeMap.values()){
            System.out.println("Values:"+value);
        }
    }

}
