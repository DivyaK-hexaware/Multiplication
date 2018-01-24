package com.divya;
import com.divya.Multiplication;
import org.junit.Test;
public class MultiplicationTest{
    @Test
    public void testsub(){
        Multiplication m = new Multiplication();
        int res= m.mul(2,3);
        System.out.println(res);
    }
}