package com.anakin.common.tool.result;

import com.anakin.common.tool.enums.CodeMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @description: 返回响应体
 * @author: anakin
 * @date 2019/4/24 10:43
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class ApiDataResult<T> extends ApiResult {

    private T data;

    public ApiDataResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiDataResult(CodeMsg codeMsg, T data) {
        this.code = codeMsg.getCode();
        this.message = codeMsg.getMsg();
        this.data = data;

    }
}
