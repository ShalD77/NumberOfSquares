package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calculateTest() {
        SQRService service = new SQRService();
        int actual =  service.square(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected,actual);
    }

}

class SQRServiceTest2 {
    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.square(100, 9801);
        int expected = 89;
        Assertions.assertEquals(expected,actual);
    }
}

class SQRServiceTest3 {
    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.square(99, 101);
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
}

class SQRServiceTest4 {
    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.square(9800, 9802);
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
}