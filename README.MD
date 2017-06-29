# 处理中心程序-Java实现
## 功能点列表

* [x] Jms 整合ibm mq队列读取和发送 
* Xml报文解析和组装并schema校验
* md5&rsa实现报文加核签
* mybatis数据库持久化

## 提供API
* mq操作
* 报文解析
* 加核签




## 记事

* maven 本地lib库安装命令

      mvn install:install-file -Dfile="E:\Git\center\lib\jms.jar" -DgroupId="javax.jms" -DartifactId="javax.jms-api" -Dversion=2.0 -Dpackaging=jar
      mvn install:install-file -Dfile="E:\Git\center\lib\com.ibm.mq.allclient.jar" -DgroupId="com.ibm"  -DartifactId="mq.allclient" -Dversion=9.0.3 -Dpackaging=jar

