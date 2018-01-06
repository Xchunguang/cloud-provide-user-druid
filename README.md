# cloud-provide-user-druid
spring cloud使用spring Data jpa继承druid数据源和监控

### 使用方法
- 修改application.yml中数据库连接信息
- 执行sql创建表
- 运行UserApplication.java
- 访问localhost:8000/1 实现REST Api访问
- 访问localhost:8000/druid/index.html 输入账号admin，密码123456，查看druid监控信息

### 注意
本项目只作为服务提供者，并没有服务发现者，所有运行会报错误可以忽略不影响测试，也可以自行创建Eureka Server。
