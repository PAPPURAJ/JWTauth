package io.github.pappuraj.jwtauth.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping()
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello world!");
    }

}
