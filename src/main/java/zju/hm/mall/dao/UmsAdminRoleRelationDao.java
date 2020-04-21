package zju.hm.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zju.hm.mall.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
