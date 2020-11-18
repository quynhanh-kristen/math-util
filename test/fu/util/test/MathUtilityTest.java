/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */ 
public class MathUtilityTest {
    
    public MathUtilityTest() {
        //mình sẽ test các tình huống xài hàm getFatorial() ở đây
        //test cases: dương âm , trong khoảng
        //Fail and succeed situation
        //thành công: 0...20
        //thất bại: âm , >20
        //hàm phải bắt các tình huống, và giờ test hàm xử lý    
    }
    @Test //biến public static void main ()
        //quy tắc đặt tên hàm bao gồm ngữ nghĩa kết quả trả về, tình trạng test
        //ko giống quy tắc đặt tên hàm
    public void getFactorial_RunsWell_IfvalidArgument() {
        assertEquals(120, MathUtility.getFatorial(5));
        assertEquals(720, MathUtility.getFatorial(6));
        assertEquals(24, MathUtility.getFatorial(4));
        assertEquals(6, MathUtility.getFatorial(3));
        assertEquals(1, MathUtility.getFatorial(0));
        assertEquals(1, MathUtility.getFatorial(1));
        //tui muốn check coi có đúng là gọi hàm 5! thì gọi về 120 hay ko
        //có xanh hk, đỏ hk
    }
    //code test độc lập với code chính và đôc5 lập với quá trình clean and buil
    //miễn là ko lỗi cú pháp
    //bn luôn đóng góp build ra đc FILE .JAR .WAR (chấp xanh đỏ)
    
    //họp logic thì màu xanh, chuẩn thì mới đóng gói
    //vậy ta cần có một gài xanh đỏ vào quy trình BULD .JAR, .WAR
    //cách khác: nếu code test đang màu đỏ thì disable nut clean and build 
}
