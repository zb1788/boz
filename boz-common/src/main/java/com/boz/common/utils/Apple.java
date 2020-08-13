package com.boz.common.utils;

/**
 * @author boz
 * @date 2019/7/9
 */

public class Apple {
    private String name;
    public Integer price;

    public Apple(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
