package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
    public class Changeforeigncurrency {
        @GetMapping("/home")
        public String home() {
            return "index";
        }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
        public String convert(Model model, @RequestParam double usd) {
            double convert = usd * 23000;
            model.addAttribute("result", convert);
            return "index";
        }
    }
