package pers.duplicatechecking;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 计算相似度
public class Similarity {
    public static double calculateSimilarity(Map<String,Integer> freq1,Map<String,Integer> freq2){
          Set<String> allTokens = new HashSet<>();
          allTokens.addAll(freq1.keySet());
          allTokens.addAll(freq2.keySet());

          double dotProduct = 0, sum1 = 0, sum2 = 0;
          for (String token : allTokens) {
              int c1 = freq1.getOrDefault(token, 0);
              int c2 = freq2.getOrDefault(token, 0);
              dotProduct += c1 * c2;
              sum1 += c1 * c1;
              sum2 += c2 * c2;
          }

          //求余弦相似度公式
          //两个向量的点积（对应分量乘积之和）除以两个向量长度
          return (sum1 == 0 || sum2 == 0) ? 0.0 :
                 dotProduct / (Math.sqrt(sum1) * Math.sqrt(sum2));
    }
}
