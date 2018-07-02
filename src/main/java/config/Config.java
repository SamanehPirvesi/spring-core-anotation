package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.dao.DaoExample;
import com.model.SpringTest;
import com.service.ServiceExample;

import lifeCycle.test.LifeCycleTest;
import scope.test.TestScope;

@Configuration
@ComponentScan(basePackages= {"com"})
public class Config {
}
	

