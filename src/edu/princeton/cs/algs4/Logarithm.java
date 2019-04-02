
package edu.princeton.cs.algs4;

import java.util.Scanner;
// كونستراكتر الذي يقوم بتعريف نوع لوغاريتم تعريف العدد داخل الوغاريتم
public class Logarithm {
    Scanner scanner = new Scanner(System.in);
    private double x;
    public Logarithm (double x){
        this.x=x;
    }
    //دالة تخولنا بإختيار الوغاريتم الي نريد من أجل إعطاء الجواب عن طريق ما يختاره المستخدم
    public void findLog(Logarithm x){
        this.x=x.x;
        x.x=scanner.nextDouble();
        double y = 0;
        switch (HelpLog.chooseLog()){
            case"1":
                System.out.println(y=ln(x.x));
                break;
            case"2":
                System.out.println(y=log(x.x));
                break;
            case"3":
                ln_AND_log(x.x);
                break;
            case"4":
                break;
        }
    }
    //دالة تقوم ب حساب الوغاريتم الطبيعي
    public double log(double x){
        System.out.print("log("+x+")=");
        return Math.log10(x);
    }
    //دالة تقوم بحساب الوغاريتم العادي الممثل بأس العدد عشرة
    public double ln(double x){
        System.out.print("ln("+x+")=");
        return Math.log(x);
    } 
    //دالة تقوم بحساب الوغرتمين الطبيعي و العادي الممثل بأس العدد عشرة
    
    public void ln_AND_log(double x){
        System.out.print("ln("+x+")="+Math.log(x)+"\n"+"log("+x+")="+Math.log10(x));  
    }
    //دالة تقوم بكتابة العدد الوغاريتمي على شكل سلسلة محارف
    @Override
    public String toString(){
        String s="log("+x+")";
        return s;
    }
    
}
