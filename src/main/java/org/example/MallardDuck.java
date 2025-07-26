package org.example;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("mallard fly");
    }

    @Override
    public void quack() {
        System.out.println("mallard Quack");
    }
}
