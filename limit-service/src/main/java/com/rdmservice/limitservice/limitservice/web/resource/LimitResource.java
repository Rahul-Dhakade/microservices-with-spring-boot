package com.rdmservice.limitservice.limitservice.web.resource;

import com.rdmservice.limitservice.limitservice.model.Limit;
import com.rdmservice.limitservice.limitservice.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LimitResource {
    @Autowired
    private LimitService limitService;

    @GetMapping("/limit")
    public ResponseEntity<Limit> getLimit(){
        return new ResponseEntity<Limit>(limitService.getLimits(), HttpStatus.OK);
    }
}
