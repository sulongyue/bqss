package com.bqss.entity.ums;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Description TODO
 * @Date 2023/2/20 20:26
 * @Created by 18355
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @ApiModelProperty("手机号码")
    @NotNull
    private String mobile;

    @ApiModelProperty("密码")
    @NotNull
    private String password;

    @NotNull
    private String realName;

    @NotNull
    private String idCard;


    private String email;
}
