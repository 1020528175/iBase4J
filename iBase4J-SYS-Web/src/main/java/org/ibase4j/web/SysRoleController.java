package org.ibase4j.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.ibase4j.model.SysRole;
import org.ibase4j.service.SysRoleService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.ibase4j.core.base.BaseController;
import top.ibase4j.core.exception.BusinessException;
import top.ibase4j.core.util.WebUtil;

/**
 * 角色管理
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:15:43
 */
@RestController
@Api(value = "角色管理", description = "角色管理")
@RequestMapping(value = "role")
public class SysRoleController extends BaseController<SysRole, SysRoleService> {
    @ApiOperation(value = "查询角色")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/page")
    public Object query(HttpServletRequest request) {
        Map<String, Object> param = WebUtil.getParameter(request);
        return super.query(param);
    }

    @ApiOperation(value = "查询角色")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/list")
    public Object queryList(HttpServletRequest request) {
        Map<String, Object> param = WebUtil.getParameter(request);
        return super.queryList(param);
    }

    @ApiOperation(value = "角色详情")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/detail")
    public Object get(SysRole param) {
        return super.get(param);
    }

    @Override
    @PostMapping
    @ApiOperation(value = "修改角色")
    @RequiresPermissions("sys.base.role.update")
    public Object update(SysRole param) {
        if (param.getId() != null) {
            SysRole result = service.queryById(param.getId());
            if ("3".equals(result.getRoleType())) {
                throw new BusinessException("不允许修改系统内置角色");
            }
        }
        return super.update(param);
    }

    @Override
    @DeleteMapping
    @ApiOperation(value = "删除角色")
    @RequiresPermissions("sys.base.role.delete")
    public Object delete(SysRole param) {
        return super.delete(param);
    }
}
