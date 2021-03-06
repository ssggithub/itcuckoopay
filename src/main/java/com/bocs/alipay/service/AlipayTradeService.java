package com.bocs.alipay.service;

import com.bocs.alipay.model.builder.*;
import com.bocs.alipay.model.result.*;

/**
 * 支付宝当面付交易
 * @author songqi
 * @Date 2018/02/09
 */
public interface AlipayTradeService {

    /**
     * 当面付2.0流程支付
     * @param builder
     * @return
     */
    AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder);

    /**
     * 当面付2.0消费查询
     * @param builder
     * @return
     */
    AlipayF2FQueryResult queryTradeResult(AlipayTradeQueryRequestBuilder builder);


    /**
     * 当面付2.0消费退款
     * @param builder
     * @return
     */
    AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder builder);

    /**
     * 当面付2.0预下单(生成二维码)
     * @param builder
     * @return
     */
    AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder builder);


    /**
     * 当面付2.0统一下单接口
     * @param builder
     */
    AlipayF2FCreateResult tradeCreate(AlipayTradeCreateRequestBuilder builder);
}
