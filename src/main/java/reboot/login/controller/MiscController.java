package reboot.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MiscController {
	
	// index view
	@RequestMapping("/index")
	String index() {
		return "index2";
	}

	// saved view
	@RequestMapping("/saved")
	public String saved() {
		return "saved";
	}
}
