package liaoxuefeng_train;

public class Exception_catch {
    public static void main(String[] args){
        byte [] a={12,13};
        String b="x9";

         int d=stringtoint(b);

         System.out.println(d);
         System.out.println(a);
         System.out.println(b);



    }

    static int stringtoint(String s){
        try {
            return Integer.parseInt(s);

        }catch (NumberFormatException e){
            e.printStackTrace();
        }


        return 0;
    }

}

