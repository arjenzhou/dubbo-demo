package cn.jcorn.dubbo.provider;

import cn.jcorn.dubbo.api.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
