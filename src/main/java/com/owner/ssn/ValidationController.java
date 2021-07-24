package com.owner.ssn;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/ssn")
public class ValidationController {

    @GetMapping("/{number}")
    public String validate(@PathVariable String number) {
        Random rd = new Random();
        if (rd.nextBoolean()) return "valid";
        return "invalid";
    }
}
