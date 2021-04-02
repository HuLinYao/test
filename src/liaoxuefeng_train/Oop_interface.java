package liaoxuefeng_train;

public class Oop_interface {
    public static void main(String[] args){

    }
}

interface Inco{
    double gettax();
}

class Royal implements Inco{
    protected double inco;
    public void Royal(double inco){
        this.inco=inco;
    }

    @Override
    public double gettax() {
        return inco*0.2;
    }
}

class Saraly implements Inco{
    protected double inco;
    public void Sarary(double inco){
        this.inco=inco;
    }

    @Override
    public double gettax() {
        return inco*0.2;
    }
}