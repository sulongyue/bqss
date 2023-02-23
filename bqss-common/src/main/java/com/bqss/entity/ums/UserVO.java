package com.bqss.entity.ums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description TODO
 * @Date 2023/2/20 21:45
 * @Created by 18355
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    private Integer id;

    private String mobile;

    private String password;

    private String realName;

    private String idCard;

    private String email;

    private Integer subCreate;

    private String subCreateName;

    private Integer subModify;

    private String subModifyName;

    private Date gmtCreate;
    private Date gmtModify;
    private Integer isDeleted = 0;
}
