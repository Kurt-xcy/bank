package com.bank;

import com.bank.utils.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankApplicationTests {


    @Test
    public void contextLoads() {
        String pass = "82357366";
        String change = MD5.string2MD5(pass);
        System.out.println(change);

    }




}
