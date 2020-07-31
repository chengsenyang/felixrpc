package com.github.yangchengsen.rpcconsumer.controller;


import com.github.yangchengsen.rpclib.HelloService;
import com.github.yangchengsen.rpcnettycommon.annotation.RpcReference;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloController {

    @RpcReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "lin") String name){
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        String returnString= helloService.say(name);
        stopwatch.stop();
        log.info("耗时："+stopwatch.getTotalTimeSeconds()+"seconds");
        return returnString;
    }

}
