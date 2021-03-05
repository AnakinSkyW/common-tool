package com.anakin.common.tool.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 接口返回Json类型数据实体
 * @author: anakin
 * @date 2019/4/24 10:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResult {

    protected int code;
    protected String message;

    @Override
    public String toString() {
        return "{" + "\"code\":" +
                code +
                ",\"message\":\"" +
                message + '\"' +
                '}';
    }
}
