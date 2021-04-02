package liaoxuefeng_train;

public class Oop_constructmethod {
    public static void main(String[] args){
        Person ming=new Person("小明",12);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
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