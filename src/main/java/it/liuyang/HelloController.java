package it.liuyang;

import it.liuyang.service.TheadLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    private TheadLocalService theadLocalService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("message", "Hello World.");
        return "hello";
    }

    @RequestMapping(value = "/tair", method = RequestMethod.GET)
    public String invoke(ModelMap model, String node) {
        theadLocalService.setTairService(node);
        model.addAttribute("message", theadLocalService.getTairService().invoke());
        return "hello";
    }

}