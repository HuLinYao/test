package reflection;

import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args)throws Exception{

        Person1 p=new Person1();
        Method m1=p.getClass().getMethod("setName", String.class);
        m1.invoke(p,"Xiao Ming");
        Method m2=p.getClass().getMethod("setAge", int.class);
        m2.invoke(p,20);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}

class Person1{

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}