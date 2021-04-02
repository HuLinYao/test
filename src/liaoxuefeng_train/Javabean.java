package liaoxuefeng_train;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Javabean {
    public static void main(String[] args) throws Exception{
        BeanInfo info= Introspector.getBeanInfo(Person2.class);
        for (PropertyDescriptor pd:info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println(" "+pd.getReadMethod());
            System.out.println(" "+pd.getWriteMethod());

        }

    }
}

class Person2{
    private String name2;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}