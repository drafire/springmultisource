package com.drafire.springmultisource.core;

// 当前线程中使用的数据源持有类
public class DynamicDataSourceHolder {
    //使用ThreadLocal，将数据库标识保存在线程变量中，防止多线程之间的干扰
    private static final ThreadLocal<String> contextHoler = new ThreadLocal<String>();

    /**
     * 设置数据源
     * @param dataSource 数据源字符串
     */
    public static void setDataSource(String dataSource){
        contextHoler.set(dataSource);
    }

    /**
     * 获取数据源
     */
    public static String getDataSource(){
       return contextHoler.get();
    }

    /**
     * 清除
     */
    public static void clearDataSource(){
        contextHoler.remove();
    }
}
