# Nacos 2023与SpringBoot 3.2.x
Nacos client的2023版本与springboot的3.2.x是对应的
Nacos server需要2.1.0+版本
同时Nacos server需要默认开启与8848偏移的2个端口，一个是8848+1000 一个是8848+1001

## docker运行nacos server
发expose俩端口
docker run --name nacos-quick -e MODE=standalone -p 58849:8848 -p 59849:9849 -p 59848:9848 -d nacos/nacos-server:v2.3.0-slim

## springboot 3.2.x的 依赖
需要添加spring bootstrap，否则无法发现bootstrap.yml/properties
由于springboot 2.0+之后默认不启用bootstrap了是由于
```
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bootstrap</artifactId>
            <version>4.1.1</version>
        </dependency>
```
