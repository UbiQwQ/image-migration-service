package cn.wuyi.migration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description  图片迁移中间服务启动类
 * @author atong
 * @date 14:18 2020/12/19
 * @version 1.0.0.1
 **/
@MapperScan("cn.wuyi.migration.mapper")
@SpringBootApplication
public class ImageMigrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageMigrationServiceApplication.class, args);
    }

}
