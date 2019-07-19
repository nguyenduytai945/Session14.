package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Simpledictionary {
    @RequestMapping("/dictionary")
    public String dictionary() {
        return "index";
    }
    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String result(@RequestParam("key") String key, Model model) {
        Map<String, String> maps = new HashMap<>();
        maps.put("love", "yêu");
        maps.put("like", "thích");
        maps.put("you", "bạn");
        maps.put("boy", "con trai");
        maps.put("girl", "con gái");
        String vietnam = maps.get(key);
        if(vietnam != null){
           model.addAttribute("result", vietnam);
        }else {
         model.addAttribute("result", "khong co tư nay");
         }
        return "index";
    }
}
