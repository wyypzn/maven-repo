package com.glzt;

import javafx.beans.binding.IntegerBinding;

/**
 * @author len
 * @date 2023/2/10
 * @Email 1059779749@qq.com
 * @Description
 */
public class Test {

    public static Integer add(Integer a, Integer b){
        return a+b;
    }

    public static void main(String[] args) {
        Integer add = add(1, 5);
        System.out.println(add);
    }
}
