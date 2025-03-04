package pers.duplicatechecking;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pers.duplicatechecking.Frequency.getFrequency;
import static pers.duplicatechecking.Similarity.calculateSimilarity;

public class Main {
    public static void main(String[] args) {
        //原文
        String filePath1 = args[0];
        //抄袭
        String filePath2 = args[1];
        //相似度结果
        String outputPath = args[2];

        try {
            // 读取文件内
            String originalText = File.readFile(filePath1);
            String copiedText = File.readFile(filePath2);

            // 分词
            List<String> originalChars = Tokenize.tokenize(originalText);
            List<String> copiedChars = Tokenize.tokenize(copiedText);

            // 统计字符频率
            Map<String, Integer> freqOriginal = getFrequency(originalChars);
            Map<String, Integer> freqCopied = getFrequency(copiedChars);

            // 计算相似度
            double similarity = calculateSimilarity(freqOriginal, freqCopied);

            // 写入文件
            File.writeFile(outputPath, similarity);



        } catch (IOException e) {
            System.err.println("文件读写错误：" + e.getMessage());
        }
    }
}

