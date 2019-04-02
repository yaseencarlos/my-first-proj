
package edu.princeton.cs.algs4;
/*
*الصف التالي مهمته الأساسية هي تنسيق المعلومات الخارجة و ترتيب المعلومات الداخلة بحيث يتناسب مع ما يريد المستخدم
*/
import javax.swing.JOptionPane;

public class HelpLog {
    //دالة تقوم بإخراج واجهة صغيرة للإدخال و الإختيار من خلالها
    public static String chooseLog(){
        String s=JOptionPane.showInputDialog("choose on of the Logarithms \n"+"1)ln(x) \n"+"2)log(x) \n"+"3) ln && log \n"+"4)end");
        return s;
    }
}
