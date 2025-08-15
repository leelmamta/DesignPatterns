package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }

    public static void main(String[] args) {
       Duck duck = new MallardDuck();
       Turkey turkey = new WildTurkey();
       Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("Turkey says");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says ... ");
        testDuck(duck);

        System.out.println("The Adaptor says...");
        testDuck(duck);
    }
}