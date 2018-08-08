package hr.power.monitor.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    @RequestMapping("/demo")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("pages/widgets.html");
        return redirectView;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}