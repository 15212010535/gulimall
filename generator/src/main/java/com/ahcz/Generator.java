package com.ahcz;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gulimall_pms";
        String username = "root";
        String password = "root";
        String module_name = "product";
        String file_path = "F://dev_data//java//project//gulimall//" + module_name + "//src//main//";
        String parent_name = "com.ahcz";
        String table_prefix = "pms_";
        String table_name = table_prefix + "spu_info_desc";
        AbstractTemplateEngine engine = new FreemarkerTemplateEngine();
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("qiu") // 设置作者
                            .enableSwagger() // 开启swagger模式
                            .outputDir(file_path + "java");// 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(parent_name) // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, file_path + "resources//mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table_name) // 设置需要生成的表名
                            .addTablePrefix(table_prefix);// 设置需要过滤的表名前缀
                })
                .templateEngine(engine) // 使用Freemarker引擎模板
                .execute();
    }
}
