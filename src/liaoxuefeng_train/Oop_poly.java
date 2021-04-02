package liaoxuefeng_train;

public class Oop_poly {
    public static void main(String[] args){
        Income[] incomes=new Income[]{
                new Income(3000),
                new Sarary(7000),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totaltax(incomes));
    }
    public static double totaltax(Income...incomes){
        double total=0;
        for(Income income:incomes){
            total= total+income.getTax();
        }
        return total;
    }
}

class Income{
    protected double income;
    public Income(double income){
        this.income= income;
    }

    public double getTax() {
        return income*0.1;
    }
}

class Sarary extends Income{
    public Sarary(double income){
        super(income);
    }

    @Override
    public double getTax() {
        if(income<5000){
            return 0;
        }
        return (income-5000)*0.2;
    }


}

class StateCouncilSpecialAllowance extends Income{
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}