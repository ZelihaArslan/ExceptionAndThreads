package com.kodluyoruz.annotation;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        tags = {"test"}
)

public class TestExample {
    @Test
    void test1(){
        throw new RuntimeException("Fail");
    }
    @Test(enabled = false)
    void test2(){
        throw new RuntimeException("Ignored");
    }
    @Test(enabled = true)
    void test3(){
        if(10>1){

        }
    }
@Test
    void test4(){
        System.out.println("Not Run");
    }
}
