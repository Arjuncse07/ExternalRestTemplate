package com.example.ExternalRestTemplate.Output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Data
public class PostOfficeResponseBean {

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PostOffice")
   private List<PostOfficeDetailsBean> postOffice;

}
