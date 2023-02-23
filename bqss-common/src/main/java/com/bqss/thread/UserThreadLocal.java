package com.bqss.thread;

import com.bqss.entity.ums.User;

/**
 * @Description TODO
 * @Date 2023/2/21 15:47
 * @Created by 18355
 */
public class UserThreadLocal{

    private UserThreadLocal(){}

    private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();

    public static void setUserId(String userId){
        LOCAL.set(userId);
    }

    public static String getUserId(){
        return LOCAL.get();
    }

    public static void remove(){
        LOCAL.remove();
    }
}
