package lk.sliit.employeeManagement.controller.kitchenController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KitchenController {
    @GetMapping("/kitchen")
    public String loginPage(){
        return "kitchen";
    }
}
