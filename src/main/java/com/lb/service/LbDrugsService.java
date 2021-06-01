package com.lb.service;

import com.lb.entity.LbDrugs;
import com.lb.vo.ResponseResult;
import org.beetl.sql.core.engine.PageQuery;

import java.util.List;


public interface LbDrugsService {
    //分页查询
    PageQuery<LbDrugs> findList(Integer pageNo, Integer pageSize, String name, String type);

    /**
     * 查询所有
     */
    List<LbDrugs> findAll();

    /**
     * 保存
     */
    ResponseResult insertDrugs(LbDrugs lbDrugs);

    /**
     * 更新记录
     */
    ResponseResult updateDrugs(LbDrugs lbDrugs);

    /**
     * 根据主键id查询
     */
    LbDrugs findOne(Integer id);

    /**
     * 删除记录
     */
    ResponseResult deleteDrugs(Integer id);
}
