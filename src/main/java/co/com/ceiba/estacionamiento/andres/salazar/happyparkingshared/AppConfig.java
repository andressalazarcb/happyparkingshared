package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfig {
	
	@Bean
	public DecimalFormat decimalFormat() {
		return new DecimalFormat("#0.00");
	}
	
	@Bean
	public SimpleDateFormat simpleDateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}
	
}
