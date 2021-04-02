package liaoxuefeng_train;

import java.util.Scanner;

public class Grade_improve {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你上次成绩：");
        double lastgrade=scanner.nextDouble();
        System.out.println("请输入你本次成绩：");
        double newgrade=scanner.nextDouble();
        double imp=(newgrade-lastgrade)/lastgrade;
        System.out.println(imp);
    }
}
