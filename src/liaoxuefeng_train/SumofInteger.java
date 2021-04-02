package liaoxuefeng_train;

public class SumofInteger {
    public static void main(String[] args){
        int n=100;
        int sum1=0;
        for(int i=0;i<100;i++){
            sum1+=sum1+i;
        }
        int sum2=sum1*(sum1+1)/2;
        System.out.println(sum2);
    }
}
