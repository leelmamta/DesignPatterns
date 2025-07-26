package org.example;

public class TurkeyAdaptor implements Duck {

    /**
     * This adaptor used by the Duck to use the Turkey interface
     * This kind of adaptor is also known as Object Adaptor
     * First you implement the interface of type you are adapting to. this interface your client expects
     * to see.
     */
    Turkey turkey;
    TurkeyAdaptor(Turkey turkey){
        /**
         * Next , we need to get a reference to the object that we are adopting ; here we do
         * that through the constructor.
         */
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {

      turkey.gobble();
    }

}
