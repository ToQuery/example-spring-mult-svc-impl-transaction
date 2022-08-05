
多个SVC实现时，数据库事务回滚问题，也就是@Bean 和 @Service 注册的bean对事物的影响

验证地址：

- http://localhost:8080/user/list
- http://localhost:8080/user/save
- http://localhost:8080/user/save-error


1. 情况一：使用@Service对事物无影响
2. 情况二：使用@Bean对事物无影响
