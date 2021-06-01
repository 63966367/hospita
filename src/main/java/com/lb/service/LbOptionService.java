package com.lb.service;

import com.lb.entity.LbOption;
import com.lb.vo.ResponseResult;
import org.beetl.sql.core.engine.PageQuery;

import java.util.List;


public interface LbOptionService {
    //分页查询
    PageQuery<LbOption> findList(Integer pageNo, Integer pageSize, String name, String type);

    /**
     * 查询所有
     */
    List<LbOption> findAll();

    /**
     * 保存
     */
    ResponseResult insertOption(LbOption lbOption);

    /**
     * 更新记录
     */
    ResponseResult updateOption(LbOption lbOption);

    /**
     * 根据主键id查询
     */
    LbOption findOne(Integer id);

    /**
     * 删除记录
     */
    ResponseResult deleteOption(Integer id);
}
