package com.madaochi.kafkaproducer.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ProducerDTO {

    @JsonProperty("content")
    private String content;

    public String getContent() {
        return content;
    }

}
