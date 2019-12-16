package com.sunjin.vip.dubbo.dubboserviceproviderimpl.service;

import com.sunjin.vip.dubbo.service.HelloDubboService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: bhh
 * @Mail: sunjin@sudiyi.cn
 * @Date: 2019/11/26
 */
@Service("helloService")
public class HelloDubboServiceImpl implements HelloDubboService {


    public String sayHelloWord(String name) {
        return null;
    }
}
