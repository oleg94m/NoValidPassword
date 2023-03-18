import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class  Foo{
    @Test(a=10,b=12)
    public static int sum(int a, int b){
        return a+b;
    }

}

public class Main {
    public static void  main(String[] args ) throws InvocationTargetException, IllegalAccessError {
        Class<?> cls = Foo.class;
        Method[] methods=cls.getDeclaredMethods();
        for(Method m:methods){
            if (m.isAnnotationPresent(Test.class)){
                Test test=m.getAnnotation(Test.class);
                int res= (Integer)m.invoke(null,test.a(),test.b());
                System.out.println(res);
            }
        }
    }
}
