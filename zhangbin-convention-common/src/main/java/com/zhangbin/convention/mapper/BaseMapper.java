package com.zhangbin.convention.mapper;

import com.zhangbin.convention.page.Page;
import com.zhangbin.convention.page.PageQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author zhangbin
 * @Type BaseMapper
 * @Desc
 * @date 2019-02-21
 * @Version V1.0
 */
public interface BaseMapper {

    <T> void insert(T domain);

    <T> Optional<T> insertReturn(T domain);

    <T> int update(T domain);

    <T> Optional<T> getById(Long id);

    <T> Optional<T> getOneByCondition(T domain);

    <T> List<T> listByCondition(T domain);

    <T> List<T> listByIds(Long[] ids);

    int count(PageQuery pageQuery);

    <T> List<T> listByPageCondition(PageQuery pageQuery);

    <T> Page<T> pageQuery(PageQuery pageQuery);

}
