/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unclebonn.mathutil.main;

import com.unclebonn.mathutil.core.MathUtility;

/**
 *
 * @author Fstore
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        textFactorialGivenRightArgumentReturnWell();
        testFactorialGivenWrongArgumentThrowsException();
        
    }
    
    //Kiểm thử xem hàm getF() có báo lỗi hay không nếu đưa n cà chớn
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //test case #6: test getF() with n = -1;
        //Expected value: quăng lỗi thông báo n kh hợp lệ
        //thiết kế hàm trong itnhf huống này phải xuất hiện ngoại lệ
        
        System.out.println("Test -1!: expected: An illegal Argument Exception is throw !!! " +
                            " | actual: ??? ");
        MathUtility.getFactorial(-1);
    }
    
    
    //Kiểm tra xem hàm getF() có được viết đúng như thiết kế hay ko
    //thiết kế: đưa n tử tuế từ 0..20 ->>> tính đc n! dúng như kì vọng
    //          đưa n cà chớn, < 0 hoặc >20, chửi
    //ta phải giả lập các cách xài của user/của ai đó khác
    //cách xài nghĩa là đưa giá trị nào đó cho hàm ->>> xem hàm trả về
    //Mỗi cách xài, ứng với 1 n thì hàm sẽ chạy với n đó 
    //Mỗi cách xài hàm ta gọi là testcase
    //Quy tắc đặt tên hàm cho kiểm thử code
    //Cú pháp con lạc đà camelCase notation
    //Tên hàm mang luôn ý nghĩa/mục đích của việc test 
    public static void textFactorialGivenRightArgumentReturnWell(){
        //Text case #1: Tình huống xài hàm số 1 
                       //Test getF() with n = 0;
        //Expected value: 1
        //Vietsub: kiểm thử xem hàm getF() với 1 tức là tình 1!
                    //coi có trả về 1 không ?
                    
        int n =0;   //tính 0!
        long expectedValue = 1;  //hy vọng trả về 1 
        long actualValue = MathUtility.getFactorial(n); ////hfam tính, xem cụ thể kết quả là bao nhiêu
        //kiểm thử là so sánh expected và actual
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                            + " | actual: " + actualValue);
        
        
        //Test case #2: test getF() with n = 1;
        //Expected value : 1
        //Vietsub: kiểm tra tình huốnh xài hàm tính 1! coi có trả về 1 hay kh?
        
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                            + " | actual: " + actualValue);
        
        
        //Test case #3: test getF() with n = 2;
        //Expected value : 2
        //Vietsub: kiểm tra tình huốnh xài hàm tính 2! coi có trả về 2 hay kh?
        System.out.println("Test 2"+ "!: expected: 2" + 
                                     " | actual: " + MathUtility.getFactorial(2));
        
        
        //Test case #4: test getF() with n = 3;
        //Expected value : 6
        //Vietsub: kiểm tra tình huốnh xài hàm tính 3! coi có trả về 6 hay kh?
        System.out.println("Test 3"+ "!: expected: 6" + 
                                     " | actual: " + MathUtility.getFactorial(3));
        
        //Test case #5: test getF() with n = 5;
        //Expected value : 120
        //Vietsub: kiểm tra tình huốnh xài hàm tính 5! coi có trả về 120 hay kh?
        System.out.println("Test 5"+ "!: expected: 120" + 
                                     " | actual: " + MathUtility.getFactorial(5));
    }
    
    
    
}
