package com.bqss.entity.ums;

import com.bqss.entity.BaseDo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDo implements Serializable {

    private Integer id;

    private String mobile;

    private String password;

    private String realName;

    private String idCard;

    private String email;
}
