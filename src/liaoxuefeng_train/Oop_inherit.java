package liaoxuefeng_train;

public class Oop_inherit {
    public static void main(String[] args){

    }
}

class Person1{
    protected String name;
    protected int age;

    public Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class student extends Person1{
    protected int score;

    public student(String name,int age,int score){
        super(name,age);
        this.score=score;

    }
}