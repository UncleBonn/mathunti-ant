/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unclebonn.mathutil.core.test;

import com.unclebonn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Fstore
 */

@RunWith(value = Parameterized.class)
public class MathUtilityAdvancesTest {
    
  // chuẩn bị data là mảng 2 chiều kiểu Object
   //JUnit tự loop duyệt mảng lôi tách data ra
    //giúp ta nhồi vào hàm assertEquals()
    
    @Parameterized.Parameters
    public static Object[][] unitData(){
        int a[] = {5,10,15,20};
        return new  Object [][] 
                                {
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720}
                                };
                              // n,expected

    }
    
    //map từng cột của từng dòng vào 2 biến tương ứng n và expected 
    @Parameterized.Parameter(value = 1) 
    public long expected;
    @Parameterized.Parameter(value = 0) 
    public int n;
    
    
    //so sánh expected và actual
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
