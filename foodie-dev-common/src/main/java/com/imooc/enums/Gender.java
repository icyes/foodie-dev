package com.imooc.enums;

public enum Gender {

    woman(0, "女"),
    man(1, "男"),
    secret(2, "保密");


    public final Integer type;
    public final String value;

    Gender(Integer type, String value) {
        this.type = type;
        this.value = value;
    }


}
