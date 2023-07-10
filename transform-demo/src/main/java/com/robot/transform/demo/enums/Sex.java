package com.robot.transform.demo.enums;

import com.robot.dict.Dict;

/**
 * 性别枚举
 *
 * @author R
 */

public enum Sex implements Dict<Integer> {
    //
    MALE(1, "男"),
    FEMALE(2, "女");

    Sex(Integer code, String text) {
        init(code, text);
    }
}
