package com.wangw.cloud.service;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/14 9:41
 */

public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
