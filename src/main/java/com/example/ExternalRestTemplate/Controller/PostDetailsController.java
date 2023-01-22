package com.example.ExternalRestTemplate.Controller;

import com.example.ExternalRestTemplate.Output.PostOfficeResponseBean;
import com.example.ExternalRestTemplate.Service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {

    @Autowired
    IPostService iPostService;

    @RequestMapping(value = "/byCity" , method= RequestMethod.GET,
                     consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponseBean getPostalByCity (@RequestParam String city){

        PostOfficeResponseBean postOfficeResponseBean;
        postOfficeResponseBean=iPostService.fetchPostOfficeDetailsByCity(city);
      return postOfficeResponseBean;
    }
}
