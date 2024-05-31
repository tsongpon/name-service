package io.songpon.nameservice;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class TestAPI {

    @Test
    public void testCallAPI() throws Exception {
        var client = new RestTemplate();
        while (true) {
//            Random random = new Random();
//            int sleepTime = random.nextInt(500); // Generate random between 500 and 3000 (inclusive)
//            System.out.println("Sleeping for " + sleepTime + " milliseconds.");
//            Thread.sleep(sleepTime);
//            System.out.println("Woke up!");
            try {
                var res = client.getForEntity("http://13.229.182.110/greeting", String.class);
                System.out.println(res);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
