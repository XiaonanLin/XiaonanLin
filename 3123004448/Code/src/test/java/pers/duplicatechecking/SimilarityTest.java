package pers.duplicatechecking;

import junit.framework.TestCase;


import java.util.List;
import java.util.Map;

import static pers.duplicatechecking.Frequency.getFrequency;
import static pers.duplicatechecking.Similarity.calculateSimilarity;
import static pers.duplicatechecking.Tokenize.tokenize;

public class SimilarityTest extends TestCase {


    public void testCalculateSimilarity() {
        String text1 = "今 天 我看了何 藩的《A HONG KONG MEMOIR》,昨 天我没 有看";
        String text2 = "前 天 我看了 薇薇安迈尔 的《我是这个世界的间谍》";

        List<String> tokens1 = tokenize(text1);
        List<String> tokens2 = tokenize(text2);

        Map<String,Integer> freq1 = getFrequency(tokens1);
        Map<String,Integer> freq2 = getFrequency(tokens2);

        double result = calculateSimilarity(freq1,freq2);

        System.out.printf("%.2f%%",result * 100);
    }
}