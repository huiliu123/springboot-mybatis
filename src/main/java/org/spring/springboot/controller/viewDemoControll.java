package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@Controller
public class viewDemoControll {
    @RequestMapping("/page")
    public String indexPage(ModelMap model) {
        model.addAttribute("hello", "13212");
        return "helloboot";
    }

}
