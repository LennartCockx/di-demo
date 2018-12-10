package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectionController {

    // Field needs @autowired annotation
    @Autowired
    public InjectionServiceImpl injectionService;

    public String testService(){
        return injectionService.messageCall();
    }
}
