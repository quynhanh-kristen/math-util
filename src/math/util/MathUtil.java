/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test bằng mắt
        System.out.println("5! : " + fu.util.MathUtility.getFatorial(5));
        //expected: 120,    actual: 120
        //i expect u return 120 when i call getFractorial()
        
        //test bộ data khác, test case
        System.out.println("1! : " + fu.util.MathUtility.getFatorial(1));
        //e:1, a:1 -> ok
        
        //e: ném về IllegalArgumentException nếu giai thừa -5
//        System.out.println("-5! : " + fu.util.MathUtility.getFatorial(-5));
        
    }
    
    //code viết ra thì dev phải kt code trước
        //có vài hình thức test code khác nhau
        //1.TDD, Test Driven Development
        //Viết dàn khung của hàm getFractorial(int n);
        //sau đó, dựng hàm test()
        //chạy thử: đỏ->lỗi, xanh->ok
        //và quá trình lặp lại liên tục viết->chạy->test->sửa
        //người ta gọi là lập trình thỏa mãn việc test, TDD
        
        //2. sout để hiển thi kết quả trả về, có đúng như kì vọng hay ko
        //3.JoptionPane của JavaDesktop để popup kết quả lên màn hinh
        //4. Viết 1 trang web gọi hàm xử lý,...
        
        //thường dùng cách 1 và 2
    
}
