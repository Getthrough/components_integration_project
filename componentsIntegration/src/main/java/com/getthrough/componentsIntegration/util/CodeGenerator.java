package com.getthrough.componentsIntegration.util;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;

/**
 * @author getthrough
 * @date 2019/12/8
 */
public class CodeGenerator {

    public static void main(String[] args) {
        doGlobalConfig();
        doDataSourceConfig();
    }

    private static void doDataSourceConfig() {

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/componentsintegration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("getthrough");
        dataSourceConfig.setPassword("password");

    }

    private static void doGlobalConfig() {

        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("getthrough");
        globalConfig.setOpen(false);

    }

}
