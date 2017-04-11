package com.msnake.alex.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Конфигурация соединения с БД
 *
 * @author aneichikes
 * @since 03.02.2017
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.msnake.alex")
@EnableJpaRepositories("com.msnake.alex.repository")
@ConfigurationProperties(prefix = "spring.datasource.hikari")
public class JpaConfig extends HikariConfig {

    /**
     * Инициация источника данных
     *
     * @return источник данных
     */
    @Bean
    public DataSource dataSource() throws SQLException {
        return new HikariDataSource(this);
    }


}
