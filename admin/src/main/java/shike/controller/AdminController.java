package shike.controller;

import entity.Result;
//import cn.shaines.user.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class AdminController {

    @RequestMapping(value = "/{id}")
    public Result hello(@PathVariable("id") String id){
        return Result.success("userId:" + id);
    }

}
