package pattern.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 2:11 PM
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 代理目标
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 为目标生成代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象代理
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开启");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return invoke;
    }
}
