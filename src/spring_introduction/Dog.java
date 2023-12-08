package spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component

public class Dog implements Pet {
    private String name;

    @Override
    public void say() {
        System.out.println("bow - wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog init metod");
//
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Destroy metod");
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}
