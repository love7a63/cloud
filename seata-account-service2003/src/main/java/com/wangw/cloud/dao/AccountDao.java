package com.wangw.cloud.dao;

import com.wangw.cloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 19:02
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
