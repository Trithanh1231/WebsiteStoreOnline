package poly.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin("*")
@Controller
public class SecurityController {
	@RequestMapping("/security/login/form")
	public String loginForm(Model model) {
		model.addAttribute("message","Vui long dang nhap!");
		return "security/login";
	}
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model model) {
		model.addAttribute("message","Dang nhap thanh cong");
		return "security/login";
	}
	@RequestMapping("/security/login/error")
	public String loginError(Model model) {
		model.addAttribute("message","sai thong tin dang nhap");
		return "security/login";
	}
	@RequestMapping("/security/anauthoried")
	public String anauthoried(Model model) {
		model.addAttribute("message","khong cos quyen truy xuat");
		return "security/login";
	}
	@RequestMapping("/security/logoff/success")
	public String logoffSuccess(Model model) {
		model.addAttribute("message","ba da dang xuat");
		return "security/login";
	}
	
	
}
