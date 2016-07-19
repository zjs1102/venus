Venus 是什么？

它是由(Venus service framework)+服务路由产品（Venus-Bus）+服务注册中心(Venus-Registry) 组合而成，提供远程服务。它着 开发简单、高性能、高并发能力 的服务端框架。

客户端与服务端之间的通讯对开发人员完全透明

他跟目前我们经常用到的框架：axis、CXF、Hessian WebService、Jboss Remoting等框架类似。


系统功能目标：

提供高性能的服务通讯框架
具备性能监控（可以清晰的看到每个服务执行的时间、过长可以通过监控告警出去）
具备流量控制（每个服务每个时刻的调用次数、每天的峰值情况、）
访问控制（服务的授权控制）
提供可选择性服务数据缓存（cache支持，key采用表达式，由框架提供缓存支持，而不需要编写任何cache相关的代码）
提供框架进行再次研发能力，提供interceptor、validator等接口。
提供高性能的服务总线（Venus-Bus），能够轻易接入高性能的服务总线。（Venus-Bus项目支持，针对该venus的协议，以后接入服务总线轻而易举）
开发方面：

服务接口定义清晰(接口、参数、校验、以及服务鉴权)
自动生成接口文档，以方便阅读接口声明
客户端框架快速开发、提供多种语言版本的客户端
提供3种服务调用方式（同步、异步、回调）
服务端框架提供多种协议提供服务，而不需要做额外的开发