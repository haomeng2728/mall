package zju.hm.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * */
@Configuration
@MapperScan({"zju.hm.mall.mbg.mapper", "zju.hm.mall.dao"})
public class MyBatisConfig {

}
