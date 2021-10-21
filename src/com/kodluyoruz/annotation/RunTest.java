package com.kodluyoruz.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Testing....");
        int passed=0, failed=0, count=0,ignored=0;

        for (Method method:
                TestExample.class.getDeclaredMethods()) { //methodların
            if(method.isAnnotationPresent(Test.class)){ //annotation olup olmadığını
                Test test=method.getAnnotation(Test.class);
                if(test.enabled()){
                    try {
                        method.invoke(TestExample.class.newInstance()); //
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Exception e) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(),e.getCause());
                        failed++;
                    }
                }else{
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                    ignored++;
                }

            }

        }
        System.out.printf("Result: Total: %d , Passed: %d, Failed %d, Ignore %d%n",count, passed, failed, ignored);
        ignored++;
    }
}
