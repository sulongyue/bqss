package com.bqss.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 *
 */
@Data
public class BaseDo {
    private Integer subCreate;
    private Integer subModify;
    private Date gmtCreate;
    private Date gmtModify;
    private Integer isDeleted = 0;
}
