package back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//어노테이션(annotation)은 자바 코드에 메타데이터를 추가하는 문법이야. 
//쉽게 말해, "이 클래스나 메서드에 특별한 의미나 기능을 붙여줘!"라고 
//컴파일러나 프레임워크에게 지시하는 표식이라고 보면 돼.
@SpringBootApplication //스프링부트 애플리케이션임을 선언하는 핵심 어노테이션
@EnableScheduling
public class BoardBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardBackApplication.class, args);
		//스프링부트를 실행(start) 시키는 명령어야. 서버가 이 시점에서 실행되고, 내장 톰캣도 함께 뜸
	}
}
