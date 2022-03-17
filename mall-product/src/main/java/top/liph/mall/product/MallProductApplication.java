package top.liph.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Mr.Li
 * @create: 2022-03-17 21:53
 * 整合MyBatis Plus
 * 1、导入依赖
 * 2、配置
 * 2.1 配置数据源
 * 2.2 配置mybatis-plus
 *      1.使用@MapperScan
 *      2.告诉SQL映射文件的位置
 **/
@MapperScan("top.liph.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class);
    }
}
