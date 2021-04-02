package liaoxuefeng_train;

import java.util.Locale;

public class Exception_null {
    public static void main(String[] args){
        Person3 p=new Person3();
        System.out.println(p.address.city.toLowerCase());

    }
}

class Person3{
    Address address=new Address();

}

class Address{
    String city;
    String street;
    int zipcode;
}