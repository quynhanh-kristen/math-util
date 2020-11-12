/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //Class này chứa các hàm tiện ích, dùng chung cho mọi nơi
    //do đó phải nên là static
    
    public static final double PI=3.1415;
    //hàm tính giai thừa n >= 0 && n <= 30
    //Quá 20 tràn long
    //0 != 1; 1 != 1; n != 1..2..3..n
    public static long getFatorial(int n){
        if( n < 0 || n > 20){
            throw new IllegalArgumentException("n must be >= 0 and <= 20");
        }
        
        //đưa đầu vào kô hợp lệ, trả về một thông báo ko hợp lệ
        if(n == 0 || n== 1){
            return 1; //0! = 1! = 1
            //n > 1 && n <= 20
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
