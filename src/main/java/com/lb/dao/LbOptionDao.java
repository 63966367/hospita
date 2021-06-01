package com.lb.dao;

import com.lb.entity.LbOption;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LbOptionDao extends BaseMapper<LbOption> {
    //根据检查项，计算费用
    BigDecimal getTotalPrice(@Param("ids") List<Integer> ids);
}