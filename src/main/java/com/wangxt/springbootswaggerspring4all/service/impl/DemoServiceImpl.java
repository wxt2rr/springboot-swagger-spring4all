package com.wangxt.springbootswaggerspring4all.service.impl;

import com.wangxt.springbootswaggerspring4all.domain.po.DemoPo;
import com.wangxt.springbootswaggerspring4all.domain.response.ResponseInfo;
import com.wangxt.springbootswaggerspring4all.domain.vo.DemoVo;
import com.wangxt.springbootswaggerspring4all.service.DemoService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * 示例 ServiceImpl
 * @author wangxt
 * @date 2021/7/30 10:56
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    /**
     *
     * 参数为普通参数示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    @Override
    public ResponseInfo<DemoVo> demo(Integer userId) {
        DemoVo demoVo = new DemoVo();
        demoVo.setUserId(userId);
        demoVo.setUsername("wangxt");
        demoVo.setWebsite("wangxt.online");
        demoVo.setAge(18);
        demoVo.setBirthday(LocalDateTime.now());
        demoVo.setFriends(Arrays.asList("小名","小红"));

        return ResponseInfo.create(200, "响应成功", demoVo);
    }

    /**
     *
     * 参数为对象参数示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    @Override
    public ResponseInfo<DemoVo> demo4Po(DemoPo demoPo) {
        DemoVo demoVo = new DemoVo();
        demoVo.setUserId(demoPo.getUserId());
        demoVo.setUsername("wangxt");
        demoVo.setWebsite("wangxt.online");
        demoVo.setAge(18);
        demoVo.setBirthday(LocalDateTime.now());
        demoVo.setFriends(Arrays.asList("小名","小红"));

        return ResponseInfo.create(200, "响应成功", demoVo);
    }
}
