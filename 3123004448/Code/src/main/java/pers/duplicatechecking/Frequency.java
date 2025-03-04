package pers.duplicatechecking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 统计字符频率
public class Frequency {
    public static Map<String,Integer> getFrequency(List<String> tokens){
           Map<String,Integer> freq = new HashMap<>();
           //如果freq里没有这个词就设为1 如果有就获取频度再加1
           for (String token : tokens) {
               freq.put(token, freq.getOrDefault(token, 0) + 1);
           }
           return freq;
    }
}
