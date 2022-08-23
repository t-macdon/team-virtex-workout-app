package io.swagger.model;

public class AuthRes {
  private final String jwt;

  public AuthRes(String jwt) {
    this.jwt = jwt;
  }

  public String getJwt() {
    return this.jwt;
  }
}
