package io.swagger;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.model.UserProfile;

@Service
public class JWTUtil {
  private final Integer EXPIRE_OFFSET = 1000 * 60 * 60 * 5; // 5 hours
  private final String SECRET_KEY = "super-secret-key";

  public String extractUserId(String token) {
    return extractClaim(token, Claims::getSubject);
  }

  public Date extractExpDate(String token) {
    return extractClaim(token, Claims::getExpiration);
  }

  public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
    final Claims claims = extractAllClaims(token);

    return claimsResolver.apply(claims);
  }

  public String generateToken(UserProfile user) {
    Map<String, Object> claims = new HashMap<>();

    return createToken(claims, user.getId());
  }

  public Boolean isTokenExpired(String token) {
    return extractExpDate(token).before(new Date());
  }

  public Boolean validateToken(String token, UserProfile user) {
    final String userId = extractUserId(token);

    return !isTokenExpired(token) && userId.equals(user.getId());
  }

  private String createToken(Map<String, Object> claims, String subject) {
    long now = System.currentTimeMillis();

    return Jwts
        .builder()
        .setClaims(claims)
        .setSubject(subject)
        .setIssuedAt(new Date(now))
        .setExpiration(new Date(now + EXPIRE_OFFSET))
        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
        .compact();
  }

  private Claims extractAllClaims(String token) {
    return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
  }
}
