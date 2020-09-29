package cn.myself.notecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {

	@RequestMapping("/")
	public String initLoadPage(Model model) {
		System.out.println("===> init load page!!!");
		return "log_in";
	}
	
	@RequestMapping("/login")
	public String loginPage(Model model) {
		return "log_in";
	}
	
	@RequestMapping("/index_edit")
	public String editPage(Model model) {
		return "edit";
	}
	
	@RequestMapping("/activity")
	public String activity(Model model) {
		return "activity";
	}
	
	@RequestMapping("/change_password")
	public String change_password(Model model) {
		return "change_password";
	}
	
	@RequestMapping("/alert/alert_error")
	public String alert_error(Model model) {
		return "alert/alert_error";
	}
	
	@RequestMapping("/alert/alert_notebook")
	public String alert_notebook(Model model) {
		return "alert/alert_notebook";
	}
	
	@RequestMapping("/alert/alert_note")
	public String alert_note(Model model) {
		return "alert/alert_note";
	}
	
	@RequestMapping("/alert/alert_delete_note")
	public String alert_delete_note(Model model) {
		return "alert/alert_delete_note";
	}
	
	
}
