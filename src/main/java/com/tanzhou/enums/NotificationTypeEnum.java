package com.tanzhou.enums;

import com.sun.org.apache.regexp.internal.RE;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1, "回复了问题"),
    REPLY_COMMENT(2, "回复了评论");
    private int type;
    private String name;
    NotificationTypeEnum(int type,String name){
        this.type = type;
        this.name = name;
    }
    public int getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    /**
     * 判断该type是否在该枚举类中
     * */
    public static  String nameOfType(int type){
        for (NotificationTypeEnum notificationTypeEnum: NotificationTypeEnum.values()){
            if (notificationTypeEnum.getType() == type){
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }
}
