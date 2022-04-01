package main;

import clase.Singleton_EagerInitialization;
import clase.Singleton_LazyInitialization;
import clase.Singleton_ThreadSafe;

public class Main {
    public static void main(String[] args) {
        Singleton_EagerInitialization s1 = Singleton_EagerInitialization.getInstance();
        Singleton_EagerInitialization s2 = Singleton_EagerInitialization.getInstance();
        Singleton_LazyInitialization s3 = Singleton_LazyInitialization.getInstance();
        Singleton_LazyInitialization s4 = Singleton_LazyInitialization.getInstance();
        Singleton_ThreadSafe s5 = Singleton_ThreadSafe.getInstance();
        Singleton_ThreadSafe s6 = Singleton_ThreadSafe.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
