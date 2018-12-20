负载均衡组件 Ribbon

操作步骤：
    1. 按顺序启动eureka-server、eureka-client(启动至少两个实例)、eureka-ribbon-client
    2. 多次访问路径http://localhost:8890/ribbon/hello/flown，将看到调用不同的eureka-client实例
简介：
    Ribbon核心类：RibbonConfig
        @Configuration 配置类
        @Bean 在IOC容器中注入RestTemplate
        @LoadBalanced 开启负载均衡