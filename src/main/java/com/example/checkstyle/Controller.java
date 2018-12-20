package com.example.checkstyle;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kwonsungyang on 20/12/2018
 */
@RestController
public class Controller {
    @GetMapping
    public String a(@Nullable String a) {
        return a.substring(2);
    }
}
