

package edu.princeton.cs.algs4;

import java.util.Scanner;


public class Polynomial {
    Scanner scanner = new Scanner(System.in);
    private int[] coef;   // أمثل المجهول
    private int degree;   // درجة التابع البولوني (-1 هي درجة التابع  0)

    /**
     * الثابتa يمثل الأمثال
     * الثابت b يمثل الأس
     * @throws IllegalArgumentException اذا b سالب
     */
    public Polynomial(int a, int b) {
        //اذا كان الأس سالب أعطي خطأ و فسره بأن الأس لا يمكن أن يكون سالبا
        if (b < 0) {
            throw new IllegalArgumentException("exponent cannot be negative: " + b);
        }

        coef = new int[b+1];
        coef[b] = a;
        reduce();
        //دالة ريديوس هنا حتى ننزل درجة لكل متغيرو نضع له 
    }

    // قبل معرفة درجة التابع ننظر في حال كانت درجته تساوي الصفر
    // درجة التابع تعبر عن طول المصفوفة او المتجهة
    private void reduce() {
        degree = -1;
        for (int i = coef.length - 1; i >= 0; i--) {
            if (coef[i] != 0) {
                degree = i;
               return;
            }
        }
    }

    /**تقوم بإرجاع درجة التابع
     */
    public int degree() {
        return degree;
    }

    /**تقوم بجمع التابعين المدخل فيها و الي إستدعى التابع
     */
    public Polynomial plus(Polynomial that) {
        Polynomial poly = new Polynomial(0, Math.max(this.degree, that.degree));
        for (int i = 0; i <= this.degree; i++) poly.coef[i] += this.coef[i];
        for (int i = 0; i <= that.degree; i++) poly.coef[i] += that.coef[i];
        poly.reduce();
        return poly;
    }

    /**ننقص التابع المستدعى من البراميتر بالتابع الي إستدعى الدالة
     */
    public Polynomial minus(Polynomial that) {
        Polynomial poly = new Polynomial(0, Math.max(this.degree, that.degree));
        for (int i = 0; i <= this.degree; i++) poly.coef[i] += this.coef[i];
        for (int i = 0; i <= that.degree; i++) poly.coef[i] -= that.coef[i];
        poly.reduce();
        return poly;
    }

    /**
     * ضرب تابعين
     */
    public Polynomial times(Polynomial that) {
        Polynomial poly = new Polynomial(0, this.degree + that.degree);
        for (int i = 0; i <= this.degree; i++)
            for (int j = 0; j <= that.degree; j++)
                poly.coef[i+j] += (this.coef[i] * that.coef[j]);
        poly.reduce();
        return poly;
    }


    /**تعطي مشتق التابع
     */
    public Polynomial differentiate() {
        if (degree == 0) return new Polynomial(0, 0);
        Polynomial poly = new Polynomial(0, degree - 1);
        poly.degree = degree - 1;
        for (int i = 0; i < degree; i++)
            poly.coef[i] = (i + 1) * coef[i + 1];
        return poly;
    }

    /**
     نعوض العدد في التابع
     */
    public int evaluate(int x) {
        int p = 0;
        for (int i = degree; i >= 0; i--)
            p = coef[i] + (x * p);
        return p;
    }

    /**
     * تقارن تابعين فيما بينهما من الأكبر من الأخر
     */
    public int compareTo(Polynomial that) {
        if (this.degree < that.degree) return -1;
        if (this.degree > that.degree) return +1;
        for (int i = this.degree; i >= 0; i--) {
            if (this.coef[i] < that.coef[i]) return -1;
            if (this.coef[i] > that.coef[i]) return +1;
        }
        return 0;
    }

    @Override
    public String toString() {
        if      (degree == -1) return "0";
        else if (degree ==  0) return "" + coef[0];
        else if (degree ==  1) return coef[1] + "x + " + coef[0];
        String s = coef[degree] + "x^" + degree;
        for (int i = degree - 1; i >= 0; i--) {
            if      (coef[i] == 0) continue;
            else if (coef[i]  > 0) s = s + " + " + (coef[i]);
            else if (coef[i]  < 0) s = s + " - " + (-coef[i]);
            if      (i == 1) s = s + "x";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
    }
    
}
