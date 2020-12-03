package org.tunderwood.GHAHelloWorld;

public class GHAHelloWorld {
    public static void main(String[] args) {
        hello(args[0]);
    }

    public static void hello(String name) {
        if(name.equals("CoP")){
            System.out.println("Hello " + name +", Welcome to GitHub Actions!");
        }
        System.out.println("Hello " + name);
    }
}
