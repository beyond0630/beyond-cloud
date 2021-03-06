package com.beyond.cloud.svc.business.service.impl;

import com.beyond.cloud.common.ApiResult;
import com.beyond.cloud.exception.BusinessException;
import com.beyond.cloud.order.domain.entity.Order;
import com.beyond.cloud.svc.business.client.order.OrderClient;
import com.beyond.cloud.svc.business.client.storage.StorageClient;
import com.beyond.cloud.svc.business.service.BusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

/**
 * @author beyond
 * @date 2020/7/27 15:32
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    private final OrderClient orderClient;
    private final StorageClient storageClient;

    public BusinessServiceImpl(final OrderClient orderClient,
                               final StorageClient storageClient) {
        this.orderClient = orderClient;
        this.storageClient = storageClient;
    }

    /**
     * 采购
     */
    @Override
    @GlobalTransactional(name = "purchase", rollbackFor = Exception.class)
    public ApiResult purchase(final int userId, final String commodityCode, final int orderCount) {
        ApiResult<Boolean> deductResult = storageClient.deduct(commodityCode, orderCount);
        ApiResult<Order> orderResult = orderClient.createOrder(userId, commodityCode, orderCount);
        if (orderCount > 1) {
            throw new BusinessException("每人限购一份");
        }
        return ApiResult.ok();
    }
}
