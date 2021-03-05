package com.anakin.common.tool.exception;

import com.anakin.common.tool.enums.CodeMsg;
import lombok.Getter;

/**
 * Description: custom exception
 * User: AnakinSkyW
 * Date: 2019/7/17 22:46
 **/
@Getter
public class CommonException extends RuntimeException {

    private final int code;
    private final String message;

    public CommonException() {
        this.code = CodeMsg.FAILED.getCode();
        this.message = CodeMsg.FAILED.getMsg();
    }

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public CommonException(CodeMsg codeMsg) {
        super(codeMsg.getMsg());
        this.code = codeMsg.getCode();
        this.message = codeMsg.getMsg();
    }

    public CommonException(CodeMsg codeMsg, String message) {
        super(message);
        this.code = codeMsg.getCode();
        this.message = message;
    }
}
