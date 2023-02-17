package com.unclebonn.mathutil.core.test;

import com.unclebonn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fstore
 */
public class MathUtilityTest {
    
    
    
    
    //Junit 4 không có hàm assertEquals() cho Exception
        //Junit 5 có hàm assertThrows()
        //dùng chiêu được cung cấp bỏi Junit 4, không phải assertEquals()
        //để đo lường,lắng nghe xem có ngoại lệ được né ra hay ko
    @Test(expected = Exception.class)
    public void testFactorialGivenRightArgumentThrowsException(){
        MathUtility.getFactorial(-5);
    }

    //ta sẽ biết các test case, các tình huống test để kiểm tra
    //hàm getF() chạy đúng hay không nếu ta đưa đầu vào n tử tế
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {

        
        //Test cáe #1: test getF() with n = 0;
        //Expected result: 1; kiểm tra 0! có đúng là 1 không ?
        int n = 0;
        long expected = 1; //hy vọng 0! = 1
        long actual = MathUtility.getFactorial(n); //gọi hàm

        Assert.assertEquals(expected, actual);

        //Test case #2: test getF() n = 1
        //Expected: 1 check if 1! return 1
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);

        //Test case #3: test getF() n = 2
        //Expected: 2; check if 2! return 2
        Assert.assertEquals(2, MathUtility.getFactorial(2));

        //Test case #4: test getF() n = 3
        //Expected: 3; check if 3! return 6
        Assert.assertEquals(6, MathUtility.getFactorial(3));

        //Test case #5: test getF() n = 5
        //Expected: 120; check if 5! return 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));

    }

    @Test
    public void testRedGreen() {
        Assert.assertEquals(69, 69);
    }

}
