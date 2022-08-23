package io.swagger.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.swagger.JWTUtil;

public class AuthInterceptor extends HandlerInterceptorAdapter {

  private JWTUtil jwtUtil = new JWTUtil();

  @Override
  public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
    String token = req.getHeader("token");

    if (token == null || token.length() == 0 || jwtUtil.isTokenExpired(token)) {
      throw new Exception("Invalid auth token");
    }

    return true;
  }
}
