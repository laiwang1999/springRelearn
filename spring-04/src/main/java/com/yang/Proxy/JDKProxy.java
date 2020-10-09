package com.yang.Proxy;

import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        UserDao userDao = new UserDaoImpl();
        Class[] interfaces = {UserDao.class};
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int res = dao.add(1, 2);
        System.out.println("result = "+res);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {
    //把创建的代理对象的本体传递过来
    //有惨构造进行传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法前执行 : " + method.getName() + "传递的参数：" + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法后执行 : " + obj);
        return res;
    }
}
