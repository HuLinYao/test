package liaoxuefeng_train;

public class Exception_throws {
    public static void main(String[] args){
        try{
            System.out.println(tax(100,0.1));
            System.out.println(tax(-100,0.1));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    static double tax(int sarary,double rate){
        if(sarary<0|rate<0){
            throw new IllegalArgumentException();
        }
        return sarary*rate;
    }
}
