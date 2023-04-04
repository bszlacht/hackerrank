package org.example.preperationkit.warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Socks {
    public static void main(String[] args) {
        System.out.println("asd");
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int result = 0;
        // Write your code here
        Map<Integer, Integer> socks = new HashMap<>();
        for (Integer sock : ar) {
            socks.compute(sock, (k, v) -> v == null ? 1 : v + 1);
        }
        for (Map.Entry<Integer, Integer> entry: socks.entrySet()){
            Integer sock = entry.getKey();
            Integer num_of_socks = entry.getValue();
            result += num_of_socks / 2;
        }
        return result;
    }
}