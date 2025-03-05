package pers.duplicatechecking;

import junit.framework.TestCase;


import java.util.List;

import static pers.duplicatechecking.Tokenize.tokenize;

public class TokenizeTest extends TestCase {

    public void testTokenize() {
        String text = "今天我看了何 藩的《A HONG KONG MEMOIR》";

        List<String> tokens = tokenize(text);

        for(String token : tokens){
            System.out.println(token);
        }
    }
}