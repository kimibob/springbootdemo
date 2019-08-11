package com.example.demo.configurer;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

@Configuration //表示该文件是一个配置文件
public class MyBatisConfigurer {

   @Bean //表示该方法是一个传统xml配置文件中的<Bean id=""></Bean>
   public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
      SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
      factory.setDataSource(dataSource);
      factory.setTypeAliasesPackage("com.example.demo.model"); //表示项目中model的存储路径；
      // 添加XML目录
      ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
      factory.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/UserMapper.xml")); //表示mapper.xml存储路径；
      factory.setConfigLocation(resolver.getResource("classpath:mybatis/conf/sqlMapConfig.xml"));
      return factory.getObject();
   }

   @Bean
   public MapperScannerConfigurer mapperScannerConfigurer() {
      MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
      mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
      mapperScannerConfigurer.setBasePackage("com.example.demo.dao"); //表示dao层的存储路径
      return mapperScannerConfigurer;
   }
}