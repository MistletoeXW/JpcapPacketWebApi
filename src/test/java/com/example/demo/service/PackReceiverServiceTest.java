package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PackReceiverServiceTest {

    @Test
    public void startPocketThread() {
        PackReceiverService packReceiverService = new PackReceiverService();
        DisplayPacket displayPacket = new DisplayPacket();
        System.out.print(displayPacket.startPocketThread(0));
    }
}