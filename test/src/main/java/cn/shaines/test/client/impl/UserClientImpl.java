package cn.shaines.test.client.impl;

import cn.shaines.test.client.UserClient;
import entity.Result;
import org.springframework.stereotype.Component;


@Component
public class UserClientImpl implements UserClient {

    @Override
    public Result hello(String id) {
        return Result.error("调用失败,启用熔断器机制");
    }
//    public String hello(String id) {
//        return "调用失败,启用熔断器机制";
//    }

}
