package com.drafire.springmultisource.core;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

// 数据源动态切换拦截器
public class DynamicDataSourceInterceptor {

    public void intercept(JoinPoint joinpoint) {
        Class<?> clazz = joinpoint.getTarget().getClass();
        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
        resolveDataSource(clazz,signature.getMethod());
    }

    private void resolveDataSource(Class<?> clazz, Method method) {

        DrafireDataSource dataSource = null;
        //类注解
        if (clazz.isAnnotationPresent(DrafireDataSource.class)) {
            dataSource = clazz.getAnnotation(DrafireDataSource.class);
        }

        //实现方法的覆盖
        Class<?>[] types = method.getParameterTypes();
        try {
            Method m = clazz.getMethod(method.getName(), types);   //这样写有意义？
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (method.isAnnotationPresent(DrafireDataSource.class)) {
            dataSource = clazz.getAnnotation(DrafireDataSource.class);
        }

        if (dataSource != null) {
            DynamicDataSourceHolder.setDataSource(dataSource.value());
        }
    }
}
