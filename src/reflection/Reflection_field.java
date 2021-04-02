package reflection;

import java.lang.reflect.Field;

public class Reflection_field {
    public static void main(String[] args) throws Exception {
        Person p=new Person("Xiao Lin");
        System.out.println(p.getName());
        Class c=p.getClass();
        Field f=c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"Xiao Min");
        System.out.println(p.getName());


    }
}

class Person{
    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}