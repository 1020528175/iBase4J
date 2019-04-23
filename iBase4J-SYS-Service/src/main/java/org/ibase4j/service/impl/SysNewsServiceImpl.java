package org.ibase4j.service.impl;

import org.ibase4j.mapper.SysNewsMapper;
import org.ibase4j.model.SysNews;
import org.ibase4j.service.SysNewsService;
import org.springframework.cache.annotation.CacheConfig;

import org.apache.dubbo.config.annotation.Service;

import top.ibase4j.core.base.BaseServiceImpl;

/**
 * @author ShenHuaJie
 *
 */
@CacheConfig(cacheNames = "sysNews")
@Service(interfaceClass = SysNewsService.class)
public class SysNewsServiceImpl extends BaseServiceImpl<SysNews, SysNewsMapper> implements SysNewsService {

}
