package io.aurorasolutions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hazim on 3/29/17.
 */

@RestController
public class Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello(){
        return "Hello World!";
    }
}
