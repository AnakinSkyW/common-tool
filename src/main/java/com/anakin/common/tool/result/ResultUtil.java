package com.anakin.common.tool.result;

import com.anakin.common.tool.enums.CodeMsg;

import java.util.List;

/**
 * @description: 返回结果工具集
 * @author: anakin
 * @date 2019/4/24 10:54
 */
public class ResultUtil {

    /**
     * 返回结果
     *
     * @param code    状态码
     * @param message 消息
     * @return
     */
    public static ApiResult response(int code, String message) {
        return new ApiResult(code, message);
    }

    /**
     * 返回结果
     *
     * @param codeMsg 状态码及消息
     * @return
     */
    public static ApiResult response(CodeMsg codeMsg) {
        return new ApiResult(codeMsg.getCode(), codeMsg.getMsg());
    }

    /**
     * 返回带data结果
     *
     * @param code    状态码
     * @param message 消息
     * @param data    返回数据
     * @param <T>     返回数据类型
     * @return
     */
    public static <T> ApiDataResult<T> response(int code, String message, T data) {
        return new ApiDataResult<>(code, message, data);
    }

    /**
     * 返回带data结果
     *
     * @param codeMsg 状态码及消息
     * @param data    返回数据
     * @param <T>     返回数据类型
     * @return
     */
    public static <T> ApiDataResult<T> response(CodeMsg codeMsg, T data) {
        return new ApiDataResult<>(codeMsg, data);
    }

    /**
     * 返回带分页信息data结果
     *
     * @param codeMsg   状态码及消息
     * @param pageNum   当前页
     * @param pageSize  当前页数量
     * @param totalPage 总页
     * @param totalNum  总数量
     * @param dataList  数据列表
     * @param <T>       数据类型
     * @return
     */
    public static <T> ApiDataResult<VOPage<T>> response(CodeMsg codeMsg, Integer pageNum, Integer pageSize,
                                                        Integer totalPage, Integer totalNum, List<T> dataList) {
        VOPage<T> voPage = new VOPage<T>(pageNum, pageSize, totalPage, totalNum, dataList);
        return new ApiDataResult<>(codeMsg, voPage);
    }

    /**
     * 返回事件消息体
     *
     * @param codeMsg
     * @param event
     * @param data
     * @param <T>
     * @return
     */
//    public static <T> ApiEventResult<T> transfer(CodeMsg codeMsg, String event, T data) {
//        return new ApiEventResult<>(codeMsg, event, data);
//    }

//    /**
//     * print输出错误
//     *
//     * @param response
//     * @param resultCode
//     */
//    public static void printWriter(HttpServletResponse response, CodeMsg resultCode) {
//        PrintWriter pw = null;
//        try {
//            pw = response.getWriter();
//            pw.print(ResultUtil.response(resultCode));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            pw.flush();
//            pw.close();
//        }
//    }
//
//    public static void printWriter(HttpServletResponse response, CodeMsg code, String msg) {
//        PrintWriter pw = null;
//        try {
//            response.setHeader("Content-Type", "application/json;charset=utf-8");
//            pw = response.getWriter();
//            pw.print(JSON.toJSONString(ResultUtil.response(code.getCode(), msg)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            pw.flush();
//            pw.close();
//        }
//    }

}
