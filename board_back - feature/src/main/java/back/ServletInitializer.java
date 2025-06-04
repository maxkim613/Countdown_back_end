package back;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	//SpringBootServletInitializer를 상속하면, WAR 배포 시 Spring Boot 앱이 정상적으로 초기화
	// configure 외부 톰캣에 배포될 때 실행될 애플리케이션 초기 설정
	//application.sources(BoardBackApplication.class)는 main() 메서드가 있는 시작 클래스를 지정
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BoardBackApplication.class);
	}

}
