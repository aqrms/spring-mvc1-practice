package hello.springmvc.basic;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class LogTestController {

	@RequestMapping("/log-test")
	public String logTest(){
		String name = "Spring";

		System.out.println("name = " + name);

		log.trace("trace log = {}", name);
		log.debug("debug log = {}", name);
		log.info(" info log{}", name);
		log.warn(" warn log{}", name);
		log.error("error log{}", name);

		return "ok";
	}
}
