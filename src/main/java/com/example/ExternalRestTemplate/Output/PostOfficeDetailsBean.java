package com.example.ExternalRestTemplate.Output;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class PostOfficeDetailsBean {

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;
  @JsonProperty("BranchType")
  private String branchType;
  @JsonProperty("DeliveryStatus")
  private String deliveryStatus;
  @JsonProperty("Circle")
  private String Circle;
  @JsonProperty("District")
  private String District;
  @JsonProperty("Division")
  private String Division;
  @JsonProperty("Region")
  private String Region;
  @JsonProperty("State")
  private String State;
  @JsonProperty("Country")
  private String Country;
  @JsonProperty("Pincode")
  private String pincode;




}
