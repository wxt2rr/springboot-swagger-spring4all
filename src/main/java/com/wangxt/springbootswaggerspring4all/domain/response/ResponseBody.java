package com.wangxt.springbootswaggerspring4all.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 接口响应实体
 * @author wangxt
 * @date 2021/7/30 10:25
 */
@Data
public class ResponseBody<T> implements Serializable {

    /**
     * 响应码（全局 200 表示成功）
     */
    private int code = 200;

    /**
     * 响应消息
     */
    private String msg = "success";

    /**
     * 响应数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
}

