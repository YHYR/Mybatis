package com.yhyr.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by YHYR on 2017-12-25
 */

@Configuration
@MapperScan(basePackages = "com.yhyr.mybatis.mapper.StudentMapper", sqlSessionTemplateRef  = "anotherSqlSessionTemplate")
public class MybatisConfig2 {

    @Bean(name = "anotherDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.another")
    public DataSource customDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "anotherSqlSessionFactory")
    public SqlSessionFactory customSqlSessionFactory(@Qualifier("anotherDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "anotherTransactionManager")
    public DataSourceTransactionManager customTransactionManager(@Qualifier("anotherDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "anotherSqlSessionTemplate")
    public SqlSessionTemplate customSqlSessionTemplate(@Qualifier("anotherSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
