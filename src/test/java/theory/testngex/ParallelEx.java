package theory.testngex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelEx {

    long startTime;

    @BeforeClass
    public void startTimer(){
        startTime = System.currentTimeMillis();
    }

    @AfterClass
    public void endTimer(){
        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Test
    public void method1() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(2000);
            System.out.println("method1 : " + i);
        }
    }

    @Test
    public void method2() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(1000);
            System.out.println("method2 : " + i);
        }
    }

    @Test
    public void method3() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(1500);
            System.out.println("method3 : " + i);
        }
    }

    @Test
    public void method4() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(2500);
            System.out.println("method4 : " + i);
        }
    }

    @Test
    public void method5() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(500);
            System.out.println("method5 : " + i);
        }
    }
}
