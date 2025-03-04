package pers.duplicatechecking;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.util.ArrayList;
import java.util.List;
// 分词
public class Tokenize {
    public static List<String> tokenize(String text){
        String cleanedText = text
                .replaceAll("\\s+", "");
        //Term是分词结果的一个数据结构
        List<Term> terms = HanLP.segment(cleanedText);
        //用来存分词结果
        List<String> tokens = new ArrayList<>();
        for (Term term : terms) {
            //word字段是内容 统一小写
            String word = term.word.trim().toLowerCase();
            if (!word.isEmpty()) {
                tokens.add(word);
            }
        }
        return tokens;
    }
}
