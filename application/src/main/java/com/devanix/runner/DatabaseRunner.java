package com.devanix.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class DatabaseRunner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            String url = connection.getMetaData().getURL();
            String userName = connection.getMetaData().getUserName();
            System.out.println(connection.getClass());
            System.out.println("url = " + url);
            System.out.println("userName = " + userName);

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE ACCOUNT(ID INTEGER NOT NULL, NAME VARCHAR(256), PRIMARY KEY(ID))";
            statement.executeUpdate(sql);
        }

        jdbcTemplate.execute("INSERT INTO ACCOUNT VALUES (1, 'devanix')");
    }
}
