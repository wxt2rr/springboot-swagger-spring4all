package com.wangxt.springbootswaggerspring4all.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * 示例 Vo
 * @author wangxt
 * @date 2021/7/30 10:33
 */
@ApiModel("示例 Vo")
@Data
public class DemoVo {

    @ApiModelProperty(value = "用户ID", required = true, example = "1")
    private Integer userId;
    @ApiModelProperty(value = "用户名", required = true, example = "wangxt")
    private String username;
    @ApiModelProperty(value = "网站", required = false, example = "wangxt.online")
    private String website;
    @ApiModelProperty(value = "年龄", required = false, example = "18", name = "userAge")
    private Integer age;
    @ApiModelProperty(value = "生日", required = false, example = "8888-88-88", dataType = "string")
    private LocalDateTime birthday;
    @ApiModelProperty(value = "朋友", required = false, example = "[\"A\",\"B\",\"C\"]")
    private List<String> friends;
}
