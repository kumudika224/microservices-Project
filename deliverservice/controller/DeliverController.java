package com.sliit.mtit.microservice.deliverservice.controller;

import com.sliit.mtit.microservice.deliverservice.dto.DeliverRequest;
import com.sliit.mtit.microservice.deliverservice.dto.DeliverResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delivery")
public class DeliverController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliverResponse createDeliver(@RequestBody DeliverRequest request){

        System.out.println("Deliver Details : " + request);

        var deliverResponse = new DeliverResponse();
        deliverResponse.setDeliverId(UUID.randomUUID().toString());
        deliverResponse.setMessage("Successfully created the delivery");
        return deliverResponse;
    }
}
