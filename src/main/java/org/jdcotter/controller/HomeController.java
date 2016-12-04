package org.jdcotter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Papa on 12/2/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("name","Papa");
        return "index";
    }
}
