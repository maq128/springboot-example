package example.springboot;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket apis() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("example.springboot"))
			.paths(Predicates.or(Arrays.asList(
				PathSelectors.regex("/api/.*")
			)))
			.build()
			.apiInfo(
				new ApiInfoBuilder()
					.title("API documentation")
					.version("1.0")
					.description("API documentation")
					.build()
			);
	}
}
