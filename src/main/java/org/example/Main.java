package org.example;
abstract class animal{
    abstract void AnimalNoise();
}
class cat extends animal{
    public void AnimalNoise(){
        System.out.println("cat says meow meow");
    }
}
class dog extends animal{
    public void AnimalNoise(){
        System.out.println("dog barking");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}