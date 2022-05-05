package web.configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("web")
@PropertySource("classpath:db.properties")
public class HibernateConfig {

}
