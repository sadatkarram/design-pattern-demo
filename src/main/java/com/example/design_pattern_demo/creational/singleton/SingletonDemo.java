package com.example.design_pattern_demo.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        OnePunch.getInstance().showMessage();
    }
}

/*
7. Where It’s Used in Spring Boot
Spring-managed beans (@Component, @Service, @Repository, etc.) are Singletons by default.

Used for infrastructure services like logging, DB connections, API clients.

8. Is There a Need to Explicitly Implement in Spring Boot?
No, in most cases, Spring Boot implicitly implements Singleton pattern through its IoC container and Bean Scopes.



*/
