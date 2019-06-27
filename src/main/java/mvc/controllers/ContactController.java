package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    @ModelAttribute("contact")
    public String contactGet(Model model) {

        model.addAttribute("contact", new ConcurrentModel());
        return "/contact";
    }
}
