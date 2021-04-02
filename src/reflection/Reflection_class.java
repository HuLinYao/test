package reflection;


public class Reflection_class {
    //获取实例基本信息
    public static void main(String[] args){
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);


    }
    static void printClassInfo(Class cls){
        System.out.println("Class name:"+cls.getName());
        System.out.println("Simple name:"+cls.getSimpleName());
        if(cls.getPackage()!=null){
            System.out.println("package name:"+cls.getPackage().getName());
        }
        System.out.println("is interface:"+cls.isInterface());
        System.out.println("is enum:"+cls.isEnum());
        System.out.println("is array:"+cls.isArray());
        System.out.println("is primitive"+cls.isPrimitive());


    }
}


