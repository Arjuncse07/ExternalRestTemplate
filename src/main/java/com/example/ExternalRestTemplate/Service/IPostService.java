package com.example.ExternalRestTemplate.Service;

import com.example.ExternalRestTemplate.Output.PostOfficeResponseBean;

public interface IPostService {

    public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);
}
