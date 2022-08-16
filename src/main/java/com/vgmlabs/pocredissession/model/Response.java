package com.vgmlabs.pocredissession.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Response {

  private String hostname;
  private String ipaddress;
  private LocalDateTime timestamp;
}