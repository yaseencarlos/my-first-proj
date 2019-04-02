package edu.princeton.cs.algs4;

import java.util.Scanner;
import javax.swing.*;
/*
*الصف التالي مهمته الأساسية هي تنسيق المعلومات الخارجة و ترتيب المعلومات الداخلة بحيث يتناسب مع ما يريد المستخدم
*/
public class HelpShowing  {
    //دالة تقوم بإضافة أكثر من تابعو جمعها و جمعها ليتشكل لدينا تابع صحيح 
    public static Polynomial addpoly(){
        Scanner scanner = new Scanner(System.in);
        int n,m;
                Polynomial x=new Polynomial(0,0);
                Polynomial [] poly=new Polynomial[6];
                System.out.println("أدخل معامل المجهول ثم الأس لها المجهول");
                for(int i=0;i<poly.length;i++){
                    do {
                        n=scanner.nextInt();
                        } while(n<0);
                    do {
                         m=scanner.nextInt();
                        } while(m<0);
                     poly[i]=new Polynomial(n,m);
                    System.out.print("you add "+poly[i].toString()+" to the polynomial function \n");
                    x=x.plus(poly[i]);
                    }
        return x;
    }
    //دالة تقومبلإستفادة من دالة التعويض من الكلاس بولومنيال و تقوم بإضافة سلسلة محارف لتوضيح 
    public static int fx(Polynomial x){
        Scanner scanner = new Scanner(System.in);
        int y;
        System.out.print("x=");
        y=scanner.nextInt();
        System.out.println("\n");
        System.out.print("f("+y+")=");
        return x.evaluate(y);
    }
    //دالة تقوم بإخراج واجهة صغيرة للإدخال و الإختيار من خلالها
    public static String chooseTipe(){
        String s=JOptionPane.showInputDialog("please choose by typing (a or b or c) \n"+"a) Polynomial \n"+"b) logarithm \n");
        return s;
    }
    //دالة تقوم بإخراج واجهة صغيرة للإدخال و الإختيار من خلالها

    public static String chooseS(){
        String s=JOptionPane.showInputDialog("pleas choose by typing (1 or 2 or 3) \n"+"1) solve this function when x=numper \n"+"2) add Polynomial function\n"+"3)get the degree \n"+"4)differentiate");
        return s;
    }
    //دالة تقوم بإخراج واجهة صغيرة للإدخال و الإختيار من خلالها

    public static String chooseFx(){
        String s=JOptionPane.showInputDialog("shoose by on of the (1 or 2)\n "+"1)find the degree \n"+"2)try agen \n");
        return s;
    }
    //دالة تقوم بإخراج واجهة صغيرة للإدخال و الإختيار من خلالها

    public static String chooseE(){
        String s=JOptionPane.showInputDialog("choose one of the choices by (1 or 2 or 3)\n"+"1)f(x)+g(x) \n"+"2)f(x)-g(x) \n"+"3)f(x)*g(x)\n");
        
        return s;
    }

}

