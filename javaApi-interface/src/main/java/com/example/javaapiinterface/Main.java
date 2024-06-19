package com.example.javaapiinterface;

import com.example.apiclientsdk.client.ApiClient;
import com.example.apiclientsdk.model.User;

public class Main {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient("caojinjin","abcdefg");
        String result1 = apiClient.getNameByGet("caojin");
        String result2 = apiClient.getNameByPost("caojin");
        User user = new User();
        user.setUserName("caocaojinjin");
        String result3 = apiClient.getUserNameByPost(user);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
