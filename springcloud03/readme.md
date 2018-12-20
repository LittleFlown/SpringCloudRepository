声明式调用 Feign

操作步骤：
    1. 按顺序启动eureka-server、eureka-client(启动至少两个实例)、eureka-feign-client
    2. 多次访问路径http://localhost:8891/hello/sayHello/flown，将会调用到eureka-client实例并且看到调用不同的eureka-client实例
简介：
    Feign的源码实现过程如下：
      1. 首先通过@EnableFeignClient注解开启FeignClient的功能。程序启动时开启对@FeignClient注解的包的扫描
      2. 根据Feign的规则实现接口，并在接口上面加上@FeignClient注解
      3. 程序启动后，会进行包扫描，扫描所有的@FeignClient的注解的类，并将这些信息注入IOC容器中
      4. 当接口的方法被调用时，通过JDK的代理来生成具体的RequestTemplate模板对象
      5. 根据RequestTemplate再生成Http请求的Request对象
      6. Request对象交给Client去处理，其中Client的网络请求框架可以是HttpURLConnecttion、HTTPClient和OkHttp
      7. 最后Client被封装到LoadBalanceClient类，这个类结合类Ribbon做到了负载均衡