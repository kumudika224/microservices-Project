package com.sliit.mtit.microservice.paymentservice.service;

import com.sliit.mtit.microservice.paymentservice.dto.DeliverCreationResponse;
import com.sliit.mtit.microservice.paymentservice.dto.DeliveryCreationRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PaymentServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse createPayment(PaymentRequest paymentRequest){

        var deliveryCreationRequest = new DeliveryCreationRequest();
        deliveryCreationRequest.setFullName(paymentRequest.getFullName());
        deliveryCreationRequest.setAddress(paymentRequest.getAddress());
        deliveryCreationRequest.setItemName(paymentRequest.getItemName());
        deliveryCreationRequest.setQty(paymentRequest.getQty());
        ResponseEntity<DeliverCreationResponse> deliverCreationResponse = restTemplate.postForEntity("http://localhost:8080/delivery", deliveryCreationRequest, DeliverCreationResponse.class);

        var paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(UUID.randomUUID().toString());
        paymentResponse.setDeliverId(deliverCreationResponse.getBody().getDeliverId());
        paymentResponse.setMessage("Successfully created the Payment");

        return paymentResponse;

    }

}
