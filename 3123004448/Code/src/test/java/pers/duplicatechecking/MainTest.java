package pers.duplicatechecking;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testMain() {
        String[] arg = new String[3];


        arg[0] = "D:\\IDEACODE\\XiaonanLin\\3123004448\\Code\\src\\file\\orig.txt";
        arg[1] = "D:\\IDEACODE\\XiaonanLin\\3123004448\\Code\\src\\file\\orig_0.8_add.txt";
        arg[2] = "D:\\IDEACODE\\XiaonanLin\\3123004448\\Code\\src\\file\\ans.txt";

        Main.main(arg);
    }


}