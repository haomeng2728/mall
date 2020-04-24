package zju.hm.mall.service;

import org.springframework.transaction.annotation.Transactional;
import zju.hm.mall.common.api.CommonResult;
import zju.hm.mall.dto.OrderParam;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     * @param orderParam
     * @return
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     * @param orderId
     */
    @Transactional
    void cancelOrder(Long orderId);
}
