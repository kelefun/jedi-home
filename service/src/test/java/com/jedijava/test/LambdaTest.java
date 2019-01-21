package com.jedijava.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author liukaiyang
 * @date 2019/1/21 17:57
 */
public class LambdaTest {

    @Test
    public void testLambda() {
        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
//        System.out.println("sum is:"+nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2)
//                .peek(System.out::println).skip(2).limit(4).sum());
        IntStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * 2)
                .peek(e -> System.out.println("Mapped value: " + e))
                .sum();
    }
}
