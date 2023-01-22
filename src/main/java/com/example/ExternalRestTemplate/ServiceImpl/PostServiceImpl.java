package com.example.ExternalRestTemplate.ServiceImpl;

import com.example.ExternalRestTemplate.Output.PostOfficeDetailsBean;
import com.example.ExternalRestTemplate.Output.PostOfficeResponseBean;
import com.example.ExternalRestTemplate.Service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("postServiceImpl")
public class PostServiceImpl implements IPostService {


    @Autowired
    RestTemplate restTemplate;

    @Override
    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue) {

        String url="https://api.postalpincode.in/postoffice/{city}";
        url= url.replace("{city}", cityValue);
        System.out.println("Url is:"+url);

        ResponseEntity<PostOfficeResponseBean[]>   postalResponseEntity=
                restTemplate.getForEntity(url, PostOfficeResponseBean[].class);

        System.out.println("Response Status Code is :"+postalResponseEntity.getStatusCodeValue());

        PostOfficeResponseBean[] responsesBeanArray= postalResponseEntity.getBody();

        for (PostOfficeResponseBean responseBean: responsesBeanArray){
           List<PostOfficeDetailsBean> postOfficeListBean = responseBean.getPostOffice();
            for (PostOfficeDetailsBean postOfficeFetch: postOfficeListBean){
                System.out.println(postOfficeFetch.getName()+"***"+postOfficeFetch.getCountry()+"***"+postOfficeFetch.getPincode());
            }
        }
        return responsesBeanArray[0];
    }
}
