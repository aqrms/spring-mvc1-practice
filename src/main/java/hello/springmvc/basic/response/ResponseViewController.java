package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ResponseViewController {

	@RequestMapping("/response-view-v1")
	public ModelAndView responseViewV1() {
		ModelAndView mav = new ModelAndView("response/hello")
			.addObject("data", "hello!");

		return mav;
	}

	@RequestMapping("/response-view-v2")
	public String responseViewV2(Model model) {
		log.info("model ={}", model);
		model.addAttribute("data", "hello!");
		log.info("model ={}", model);
		return "response/hello";
	}

}
