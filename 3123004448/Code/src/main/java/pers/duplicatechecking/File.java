package pers.duplicatechecking;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class File {
      //读取文件
      public static String readFile(String path) throws IOException {
            //因为字符流没法指定编码，所以要使用字节流，然后转换成字符流，再将基本流包装成高级流
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
                  String line;
                  while ((line = reader.readLine()) != null) {
                        content.append(line);
                  }
            }
            return content.toString();
      }

      //写入文件
      public static void writeFile(String path, double similarity) throws IOException {
            try (PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8))) {
                  writer.printf("%.2f%%", similarity * 100);
            }
      }
}
