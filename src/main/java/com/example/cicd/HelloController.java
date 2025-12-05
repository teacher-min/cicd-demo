package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

  @GetMapping("/")
  public String hello() {
    String message = "Version 1.0"; // 나중에 이걸 2.0으로 바꿔서 배포 테스트함
    String podName = "Unknown";
    
    try {
      podName = InetAddress.getLocalHost().getHostName();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

    return "<h1>CI/CD Test App</h1>" +
           "<h3>Message: " + message + "</h3>" +
           "<p>Pod Name: " + podName + "</p>";
  }
}