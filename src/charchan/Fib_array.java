package charchan;

public class Fib_array {
    public static void main(String args[]){
        int fib []=new int[20];
        fib[0]=0;
        fib[1]=1;
        System.out.println(fib[1]);
        for(int i=2;i< fib.length;i++){
            fib[i]=fib[i-2]+fib[i-1];
            System.out.println(fib[i]);
        }
    }


}
