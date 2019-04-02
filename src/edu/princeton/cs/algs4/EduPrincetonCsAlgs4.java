
package edu.princeton.cs.algs4;
import java.util.Scanner;

public class EduPrincetonCsAlgs4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (HelpShowing.chooseTipe()){
            case "a":
                Polynomial x=HelpShowing.addpoly();
                System.out.println("f(x)="+x.toString());
                switch (HelpShowing.chooseS()){
                        case "1":
                            boolean t=true;
                            do{
                                System.out.println(HelpShowing.fx(x));
                                switch (HelpShowing.chooseFx()){
                                    case "1"://find the degree
                                        t=false;
                                    case "2"://try agen
                                }
                            } while(t);
                        case "3":
                            System.out.println("the degree is= "+x.degree());
                            switch (HelpShowing.chooseS()){
                                case "1":
                                    int a=HelpShowing.fx(x);
                                    boolean y=true;
                                    do{
                                        System.out.println(a);
                                        
                                        switch (HelpShowing.chooseFx()){
                                            case "1"://find the degree
                                                t=false;
                                            case "2"://try agen
                                        }
                                    } while(y);
                                case "3":
                                    System.out.println("the degree is= "+x.degree());
                            
                                case "2":
                                    System.out.println("now you are going to input the 2nd Polynomial function");       
                                    Polynomial z=HelpShowing.addpoly();
                                    System.out.println("g(x)="+z.toString());
                                    System.out.println("now you got two Polynomial functions\n"+"f(x)= "+x+"\n"+"g(x)= "+z);
                                    HelpShowing.chooseE();
                                    switch(HelpShowing.chooseE()){
                                        case"1":
                                            System.out.println("h(x)="+x.plus(z));
                                            break;
                                        case"2":
                                            System.out.println("h(x)="+x.minus(z));
                                            break;
                                        case"3": 
                                            System.out.println("h(x)="+x.times(z));
                                            break;
                                    }
                                    case "4":
                                        System.out.println("the degree of f(x) Poly is "+x.differentiate());
                            }System.out.println("you can add another Polynomial function");
                        case "2":
                            System.out.println("now you are going to input the 2nd Polynomial function");       
                            Polynomial y=HelpShowing.addpoly();
                            System.out.println("g(x)="+y.toString());
                            System.out.println("now you got two Polynomial functions\n"+"f(x)="+x+"\t"+"g(x)="+y);
                            switch(HelpShowing.chooseE()){
                                case"1":
                                    System.out.println("h(x)="+x.plus(y));
                                    break;
                                case"2":
                                    System.out.println("h(x)="+x.minus(y));
                                    break;
                                case"3":
                                    System.out.println("h(x)="+x.times(y));
                                    break;
                            }
                        case "4":
                            System.out.println(x.differentiate());
                            break;
                    }
            case "b":
                Logarithm z = null;
                double q;
                System.out.println("please enter the number inside the log(x)\t(x=input number)");
                do{
                q=scanner.nextDouble();
                }while(q<0);
                z=new Logarithm(q);
                System.out.print("the log you want to solve is: "+z+"\nrewrite the numper you put in\n");
                z.findLog(z);
            
            
        }

    }
    
}
