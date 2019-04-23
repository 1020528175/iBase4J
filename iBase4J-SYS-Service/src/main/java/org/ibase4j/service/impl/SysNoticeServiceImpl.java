package org.ibase4j.service.impl;

import org.ibase4j.mapper.SysNoticeMapper;
import org.ibase4j.model.SysNotice;
import org.ibase4j.service.SysNoticeService;
import org.springframework.cache.annotation.CacheConfig;

import org.apache.dubbo.config.annotation.Service;

import top.ibase4j.core.base.BaseServiceImpl;

/**
 * @author ShenHuaJie
 *
 */
@CacheConfig(cacheNames = "sysNotice")
@Service(interfaceClass = SysNoticeService.class)
public class SysNoticeServiceImpl extends BaseServiceImpl<SysNotice, SysNoticeMapper> implements SysNoticeService {

}
