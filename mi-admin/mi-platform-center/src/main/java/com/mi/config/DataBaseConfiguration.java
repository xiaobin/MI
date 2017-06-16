package com.mi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库配置
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/16.
 */
@Slf4j
@Configuration
public class DataBaseConfiguration {

    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name="masterDataSource", destroyMethod = "close", initMethod="init")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource",locations = "classpath:application.properties")
    public DataSource writeDataSource() {
        log.info("-------------------- masterDataSource init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }
    /**
     * 有多少个从库就要配置多少个
     * @return
     */
    @Bean(name = "slaveSource")
    @ConfigurationProperties(prefix = "spring.slave",locations = "classpath:application.properties")
    public DataSource readDataSourceOne(){
        log.info("-------------------- slaveDataSourceOne init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "slaveSource1")
    @ConfigurationProperties(prefix = "spring.slave1",locations = "classpath:application.properties")
    public DataSource readDataSourceTwo() {
        log.info("-------------------- slaveDataSourceTwo init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }
    @Bean("readDataSources")
    public List<DataSource> readDataSources(){
        List<DataSource> dataSources=new ArrayList<>();
        dataSources.add(readDataSourceOne());
        dataSources.add(readDataSourceTwo());
        return dataSources;
    }

}
