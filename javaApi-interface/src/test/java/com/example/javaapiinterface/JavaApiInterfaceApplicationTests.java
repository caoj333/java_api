package com.example.javaapiinterface;

import com.example.apiclientsdk.client.ApiClient;
import com.example.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavaApiInterfaceApplicationTests {

    @Resource
    private ApiClient apiClient;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUserName("caojin");
        String userNameByPost = apiClient.getUserNameByPost(user);
        System.out.println(userNameByPost);
    }

}
