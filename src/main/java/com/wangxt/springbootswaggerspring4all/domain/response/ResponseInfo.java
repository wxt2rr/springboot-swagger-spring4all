package com.wangxt.springbootswaggerspring4all.domain.response;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * 接口响应结果
 * @author wangxt
 * @date 2021/7/30 10:30
 */
@Data
public class ResponseInfo<T> implements Serializable {

    private ResponseBody<T> body = new ResponseBody<>();

    public ResponseInfo(int code, String msg, T data) {
        this.body.setCode(code);
        this.body.setMsg(msg);
        this.body.setData(data);
    }

    public ResponseBody<T> getBody() {
        return body;
    }

    public static <T> ResponseInfo<T> create(int code, String msg, T data) {
        return new ResponseInfo<>(code, msg, data);
    }
}

