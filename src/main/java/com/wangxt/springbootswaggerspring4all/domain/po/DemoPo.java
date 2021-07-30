package com.wangxt.springbootswaggerspring4all.domain.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * 示例入参 Po
 * @author wangxt
 * @date 2021/7/30 10:43
 */
@ApiModel("示例 Po")
@Data
public class DemoPo {
    @ApiModelProperty(value = "用户ID", required = true, example = "1")
    private Integer userId;
}
