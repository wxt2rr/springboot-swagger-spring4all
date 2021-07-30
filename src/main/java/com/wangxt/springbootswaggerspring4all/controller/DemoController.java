package com.wangxt.springbootswaggerspring4all.controller;

import com.wangxt.springbootswaggerspring4all.domain.po.DemoPo;
import com.wangxt.springbootswaggerspring4all.domain.response.ResponseInfo;
import com.wangxt.springbootswaggerspring4all.domain.vo.DemoVo;
import com.wangxt.springbootswaggerspring4all.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 示例 controller
 * @author wangxt
 * @date 2021/7/30 10:11
 */
@Api(tags = "示例 controller")

@RestController
@RequestMapping("/demo/")
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     *
     * 参数为普通参数示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    @ApiOperation(value = "参数为普通参数示例方法")
    @GetMapping("demo")
    public ResponseInfo<DemoVo> demo(@ApiParam(name = "用户ID", required = true, example = "1") Integer userId){
        return demoService.demo(userId);
    }

    /**
     *
     * 参数为对象示例方法
     * @author wangxt
     * @date 2021/7/30 10:53
     * @return ResponseInfo
     */
    @ApiOperation(value = "参数为对象示例方法")
    @GetMapping("demo4Po")
    public ResponseInfo<DemoVo> demo4Po(@ApiParam(name = "参数", required = true) @RequestBody DemoPo demoPo){
        return demoService.demo4Po(demoPo);
    }
}
