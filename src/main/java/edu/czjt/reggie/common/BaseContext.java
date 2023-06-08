package edu.czjt.reggie.common;

/**
 * Created by jinkun.tian on 2023/3/21
 */
public class BaseContext {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值结婚戒指的骄傲hjh对方是否的
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
