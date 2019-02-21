package pattern.structural.proxy.dynamic;


import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 11:03 AM
 */
public class ProxyFactory {
    /**
     * 维护一个目标对象,必须实现一个接口
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
            newProxyInstance 的三个参数
            1: ClassLoader loader 指定当前目标的类加载器
            2: Class<?>[] interfaces 目标对象实现的接口
            3: InvocationHandler h 事件处理器
                InvocationHandler 中invoke方法在代理实例上处理方法调用并返回结果
                invoke 的参数 proxy : 调用该方法的代理实例
                             method : 代理实例接口的执行的方法
                             args:代理实例的执行的方法的参数
         */
        //返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("动态代理开启");
            Object invoke = method.invoke(target, args);
            System.out.println("动态代理结束");
            return invoke;
        });
    }
}
