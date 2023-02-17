/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unclebonn.mathutil.core;

/**
 *
 * @author Fstore
 */
public class MathUtility {

    public static final double PI = 3.14;

    /*
    hàm tính Factorial lfa hàm tính n!
    quy ước: n! = 1 x 2 x 3 x 4......n
    0! = 1! = 1
    //không có giai thừa của số âm
    //Thiết kế của hàm tính giai thừa của chúng ta là:
    hàm không tính giai thừa âm, nếu đưa âm giai thừa =>>>>> CHỬI - EXCEPTION 
    hàm không tính giai thừa quá to, không tính giai thừa 21 trở lên vì kiểu long
    chỉ có tối đa 18 số 0
    mà 21! lớn hơn 18 số 0, tràn kiểu long, tính sai , không support giai thừa âm, 
    giai thừa quá lớn !!!!!!!!!!!!!!!!!!
    
    --Người QC phải kiếm tra xem hàm có hành xử đúng như thiết kế hay ko ?????
    phải tét, thử nghiệm các tình huống xài hàm 
     */
    public static long getFactorial(int n) {
        if(n < 0 || n >= 21){
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
   
        }
        if(n ==0 || n == 1){
            return 1;
        }
        
        //sống sót tới lệnh dưới đây thì sure n = 2..20
        long product = 1; //tích nhân dồn !!
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
