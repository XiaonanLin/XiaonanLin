package pers.duplicatechecking;

import junit.framework.TestCase;

import java.util.List;
import java.util.Map;

import static pers.duplicatechecking.Frequency.getFrequency;
import static pers.duplicatechecking.Tokenize.tokenize;

public class FrequencyTest extends TestCase {

    public void testGetFrequency() {
        String text = "今 天 我看了何 藩的《A HONG KONG MEMOIR》,昨 天我没 有看";

        List<String> tokens = tokenize(text);

        Map<String,Integer> freq = getFrequency(tokens);

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }

    }
}