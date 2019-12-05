package main;

import configuration.SingletonConfigProperties;

public class Main {
    public static void main(String[] args) {
        System.out.println(SingletonConfigProperties.getProperties().toString());
        System.out.println(SingletonConfigProperties.getPropertiesValues("size"));



    }
}
