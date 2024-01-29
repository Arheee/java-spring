package fr.arheee.demospringcontroller.hellowolrd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

   /**
    * @RequestMapping(
            value = "/post"
            method = RequestMethod.GET
    ) // GET http://localhost:8080/hello
    public String hello(){
        return "GET sur hello world";
    }
    **/

//    @PostMapping
//    public String helloPost(){
//        return "POST sur hello world";
//    }
//
//    @PostMapping
//    public String helloDelete(){
//        return "DELETE sur hello world";
//    }
//    @PostMapping
//    public String helloPut(){
//        return "PUT sur hello world";
//    }

//    @PostMapping("/{name}")
//    public String helloPostWithName(@PathVariable String name){
//        return "hello" + name;
//    }

//    @PostMapping
//    public String helloPostWithRequestParam(@RequestParam(defaultValue = "Ju") String name){
//        return "hello" + name;
//    }

    @PostMapping
    public String helloPostWithBody(@RequestBody String name){
        return "hello " + name;
    }
}
