package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person{
    private Animal animal =null;
    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        /*
        @Qualifier  按名称装配bean
         */
        System.out.println("延迟注入");
        this.animal= animal;
    }
}
