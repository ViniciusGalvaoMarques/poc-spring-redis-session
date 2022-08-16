package com.vgmlabs.pocredissession.endpoint;

import com.vgmlabs.pocredissession.model.Response;
import java.net.InetAddress;

import java.net.UnknownHostException;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeEndpoint {

  @Value("${spring.redis.host}")
  private String redisHostname;

  @GetMapping("/")
  public @ResponseBody Response index() {
    InetAddress host = getNetInfo();
    return Response.builder()
        .hostname(host.getHostName())
        .ipaddress(host.getHostAddress())
        .timestamp(LocalDateTime.now())
        .build();
  }

  private InetAddress getNetInfo() {
    InetAddress localHost = null;
    try {
      localHost = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    return localHost;
  }


}
