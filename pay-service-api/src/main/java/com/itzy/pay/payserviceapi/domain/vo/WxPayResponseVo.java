package com.itzy.pay.payserviceapi.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Setter
@Getter
@ToString
public class WxPayResponseVo extends PayResponseVo{

    // 交易类型
    private String tradeType;

    // 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
    private String prepayId;

    // trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
    // 注意：code_url的值并非固定，使用时按照URL格式转成二维码即可
    private String qrCode;

    // 随机字符串 不超过32位
    private String nonceStr;

    // //时间戳，自1970年以来的秒数
    private String timeStamp;

    private String appId;

    private String signType;

    private String packageValue;

    private String paySign;

    @Builder
    public WxPayResponseVo(String platform, String tradeType, String prepayId, String qrCode, String nonceStr, String timeStamp, String appId, String signType, String packageValue, String paySign) {
        super(platform);
        this.tradeType = tradeType;
        this.prepayId = prepayId;
        this.qrCode = qrCode;
        this.nonceStr = nonceStr;
        this.timeStamp = timeStamp;
        this.appId = appId;
        this.signType = signType;
        this.packageValue = packageValue;
        this.paySign = paySign;
    }
}
