package com.demo;

public class helloServiceImp implements  helloService{
    @Override
    public String sayHelo(String name){
        return "hello," + name;
    }
}
