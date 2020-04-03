package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MaxSearchAlghoritms myAlgorithms = new MaxSearchAlghoritms();
        Class<?> reflect = myAlgorithms.getClass();

        Method[] methods = reflect.getMethods();

        for(Method currentMethod : methods) {
            if(currentMethod.getName().contains("scan")) {
                Method callMethod = reflect.getDeclaredMethod(currentMethod.getName(), int[].class);
                System.out.println(callMethod.getName() + " " + callMethod.invoke(myAlgorithms, myAlgorithms.someTestNumbers));
            }
        }
    }
}
