package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Reflection_proxy {
    public static void main(String[] args){
        Student odinarystudent=new OdinaryStudent();
        odinarystudent.eat();
        odinarystudent.run();
        odinarystudent.write();

        // 现在有一位特殊的学生，他是区长的儿子，我们自然要对他额外照顾，要给他加一下功能。
        // 一种思路是定义一个类：区长的儿子类，他继承自学生类，但世上儿子千千万，有区长的儿子，也有市长的儿子，更有省长的儿子，不能把他们挨个定义出来，
        // 现在就可以使用动态代理机制，动态的给区长的儿子加上功能，以后碰到市长、省长的儿子也同样处理。

        // InvocationHandler作用就是，当代理对象的原本方法被调用的时候，会重定向到一个方法，
        // 这个方法就是InvocationHandler里面定义的内容，同时会替代原本方法的结果返回。
        // InvocationHandler接收三个参数：proxy，代理后的实例对象。 method，对象被调用方法。args，调用时的参数。

       InvocationHandler handler=(proxy, method, args1) -> {
           //重定义方法
           switch (method.getName()){
               case "eat"->System.out.println("我可以吃香喝辣！");
               case "run"->System.out.println("我1秒1000米！");
               case "write"->{System.out.println("我的作文题目是《我的区长父亲》");method.invoke(odinarystudent,args1);
               System.out.println("我的题目拿了作文比赛一等奖，哦耶！");}
               default -> throw new Exception();
           }

           return null;
       };

        // 对这个实例对象代理生成一个代理对象。
        // 被代理后生成的对象，是通过People接口的字节码增强方式创建的类而构造出来的。它是一个临时构造的实现类的对象。
        // loder和interfaces基本就是决定了这个类到底是个怎么样的类。而h是InvocationHandler，决定了这个代理类到底是多了什么功能.
        // 通过这些接口和类加载器，拿到这个代理类class。然后通过反射的技术复制拿到代理类的构造函数，
        // 最后通过这个构造函数new个一对象出来，同时用InvocationHandler绑定这个对象。
        // 最终实现可以在运行的时候才切入改变类的方法，而不需要预先定义它。

        Student sonOfDistrict=(Student) Proxy.newProxyInstance(odinarystudent.getClass().getClassLoader(),
                odinarystudent.getClass().getInterfaces(),handler);

        sonOfDistrict.eat();
        sonOfDistrict.write();

    }
}


/**
 * 学生接口，能跑，能吃，能写作文
 **/
interface Student{
    void run();
    void eat();
    void write();
}

class OdinaryStudent implements Student{
    @Override
    public void run() {
        System.out.println("I am running!");

    }

    @Override
    public void eat() {
        System.out.println("I am eating!");

    }

    @Override
    public void write() {
        System.out.println("I am writing");

    }
}