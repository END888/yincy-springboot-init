package com.yincy.boot.model.system.dal.dataobject.permission;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yincy.boot.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户和角色关联
 *
 * @author yincy
 */
@TableName("system_user_role")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserRoleDO extends BaseDO {

    /**
     * 自增主键
     */
    @TableId
    private Long id;
    /**
     * 用户 ID
     */
    private Long userId;
    /**
     * 角色 ID
     */
    private Long roleId;

}
