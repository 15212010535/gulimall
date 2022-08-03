package com.ahcz;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 代码生成器，用生成需要的代码
 */
public class Generator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gulimall_oms";
        String username = "root";
        String password = "root";
        String file_path = "F://dev_data//java//project//gulimall//ware//src//main//";
        String parent_name = "com.ahcz";
        String table_name = "oms_order";
        String table_prefix = "oms_";
        AbstractTemplateEngine engine = new FreemarkerTemplateEngine();
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("qiu") // 设置作者
                            .enableSwagger() // 开启swagger模式
                            .outputDir(file_path + "java");// 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(parent_name) // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, file_path + "resources")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table_name) // 设置需要生成的表名
                            .addTablePrefix(table_prefix);// 设置需要过滤的表名前缀
                })
                .templateEngine(engine) // 使用Freemarker引擎模板
                .execute();
    }
}
