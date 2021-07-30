package com.wangxt.springbootswaggerspring4all.service;

import com.wangxt.springbootswaggerspring4all.domain.po.DemoPo;
import com.wangxt.springbootswaggerspring4all.domain.response.ResponseInfo;
import com.wangxt.springbootswaggerspring4all.domain.vo.DemoVo;

/**
 *
 * 示例Service
 * @author wangxt
 * @date 2021/7/30 10:46
 */
public interface DemoService {

    /**
     *
     * 参数为普通参数示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    ResponseInfo<DemoVo> demo(Integer userId);

    /**
     *
     * 参数为对象参数示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    ResponseInfo<DemoVo> demo4Po(DemoPo demoPo);
}
