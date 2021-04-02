package liaoxuefeng_train;

public class Enum {
    public static void main(String[] args){
        Weekday day=Weekday.SAT;
        if(day.dayvalue==6 || day.dayvalue==0){
            System.out.println("Today is"+day+",好耶！");

        }
        else {
            System.out.println("Today is"+day+",上班");
        }


    }
}

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayvalue;
    public final String chinese;



    private Weekday(int dayvalue,String chinese){
        this.dayvalue=dayvalue;
        this.chinese=chinese;
    }


    @Override
    public String toString() {
        return chinese;
    }
}