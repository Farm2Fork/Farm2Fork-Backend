package helloworld.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name", "Elliott");
        return "hello"; // Template name.
    }

    @GetMapping("mvc")
    public String MVC(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "mvc";
    }

    @GetMapping("api")
    @ResponseBody
    public User API(@RequestParam("name") String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    static class User {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
