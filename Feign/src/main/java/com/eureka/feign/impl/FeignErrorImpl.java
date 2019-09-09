package com.eureka.feign.impl;

import com.eureka.entity.Student;
import com.eureka.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author NNShadow
 * @date 2019/9/7 20:37
 */
@Component
public class FeignErrorImpl implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器傻了";
    }
}
