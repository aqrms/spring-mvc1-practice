package hello.springmvc.basic.requestmapping;

import java.awt.*;

import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MappingController {

	@RequestMapping("/hello-basic")
	public String helloBasic() {
		log.info("hello basic");
		return "OK";
	}

	@GetMapping("/mapping/{userId}")
	public String mappingPath(@PathVariable("userId") String data) {
		log.info("mappingPath userId={}", data);
		return "ok";
	}

	@GetMapping("/mapping/users/{userId}/orders/{orderId}")
	public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
		log.info("mappingPath userId={}, orderId={}", userId, orderId);
		return "ok";

	}

	@GetMapping(value = "/mapping-header", headers = "mode=debug")
	public String mappingHeader() {
		log.info("mappingHeader");
		return "ok";
	}

	@PostMapping(value = "/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String mappingConsumes() {
		log.info("mappingConsumes");
		return "OK";
	}

	@PostMapping(value = "/mapping-produce", produces = MediaType.TEXT_HTML_VALUE)
	public String mappingProduce() {
		log.info("mappingProduces");
		return "ok";
	}
}
