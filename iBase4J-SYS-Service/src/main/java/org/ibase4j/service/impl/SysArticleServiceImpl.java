package org.ibase4j.service.impl;

import org.ibase4j.mapper.SysArticleMapper;
import org.ibase4j.model.SysArticle;
import org.ibase4j.service.SysArticleService;
import org.springframework.cache.annotation.CacheConfig;

import org.apache.dubbo.config.annotation.Service;

import top.ibase4j.core.base.BaseServiceImpl;

/**
 * <p>
 * 文章  服务实现类
 * </p>
 *
 * @author ShenHuaJie
 * @since 2017-03-12
 */
@CacheConfig(cacheNames = "sysArticle")
@Service(interfaceClass = SysArticleService.class)
public class SysArticleServiceImpl extends BaseServiceImpl<SysArticle, SysArticleMapper> implements SysArticleService {

}
