package com.eureka.feign;

import com.eureka.entity.Student;
import com.eureka.feign.impl.FeignErrorImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author NNShadow
 * @date 2019/9/7 19:22
 */
//表示本接口访问的服务，注册中心中需要有 provider
//fallback 降级处理，若出现问题，找 FeignErrorImpl 实现
@FeignClient(value = "provider", fallback = FeignErrorImpl.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
