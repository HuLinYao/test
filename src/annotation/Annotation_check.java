package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Annotation_check {
    public static void main(String[] args)throws Exception{
        Person p1 = new Person("Bob", "Beijing", 20);
        Person p2 = new Person("", "Shanghai", 20);
        Person p3 = new Person("Alice", "Shanghai", 199);

        for (Person p:new Person[]{p1,p2,p3} ){
            try{
                check(p);
                System.out.println("Person"+p+"checked ok!");
            }catch (IllegalArgumentException e){
                System.out.println("Person"+p+"check faild"+e);
            }
        }
    }

    static void check(Person person)throws IllegalArgumentException,ReflectiveOperationException{
        //遍历所有Field
        for (Field field:person.getClass().getFields()){
            //获取Field定义的定义的@Range
            Range range=field.getAnnotation(Range.class);
            //如果@Range存在
            if(range!=null){
                //获取Field的值
                Object value=field.get(person);
                //如果值是字符串
                if(value instanceof String){
                    String s=(String) value;
                    // 判断值是否满足@Range的min/max:
                    if(s.length()<range.min()||s.length()>range.max()){
                        throw new IllegalArgumentException("Invalid field:"+field.getName());
                    }
                }
                //如果值是数字
                if(value instanceof Integer){
                    Integer n= (Integer) value;
                    // 判断值是否满足@Range的min/max:
                    if(n<range.min()||n>range.max()){
                        throw new IllegalArgumentException("Invalid field:"+field.getName());
                    }
                }
            }
        }
    }
}

