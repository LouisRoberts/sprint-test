package org.lorob.db;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfig {
	@Bean
    @ConfigurationProperties(prefix = "spring.datasource")
	public String SorryGod(){
		// Do Nothing for Now
		return "Sorry God";
	}
	/*public DataSource dataSource() {
		System.out.println("dataSource");
		
        return DataSourceBuilder.create().build();
    }*/
	
}
