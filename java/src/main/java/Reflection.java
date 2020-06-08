import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

        public static Object reflectionFunction(String classname, String methodName, Object... args) throws ClassNotFoundException {
        Class<?> refclass = Class.forName(classname);
        Class<?>[] paramTypes = {String.class, int.class};
        Object ret = null;
        try {
            Object bObj = refclass.newInstance();
            Method method = refclass.getMethod(methodName);
            ret = method.invoke(bObj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
