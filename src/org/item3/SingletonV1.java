package org.item3;

import java.util.UUID;


/**
 * Created by verlorener on 18.08.15.
 */
public class SingletonV1 {
    private static long idCounter = 33;
    private static final SingletonV1 INSTANCE = new SingletonV1();


    private SingletonV1() {++idCounter;}

    public static SingletonV1 getInstance() {
        return INSTANCE;
    }

    public void showIdCounter() {
        System.out.println(idCounter);
    }

    public static void main(String[] args) {
        SingletonV1 Single1 = SingletonV1.getInstance();
        Single1.showIdCounter();

        SingletonV1 Single2 = SingletonV1.getInstance();
        Single2.showIdCounter();



    }
}
