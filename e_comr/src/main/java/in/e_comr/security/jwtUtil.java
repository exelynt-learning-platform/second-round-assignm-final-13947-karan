package in.e_comr.security;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Component
public class jwtUtil {
	

	    private String SECRET = "secretkey";

	    @SuppressWarnings("deprecation")
		public String generateToken(String username) {
	        return Jwts.builder()
	                .setSubject(username)
	                .signWith(SignatureAlgorithm.HS256, SECRET)
	                .compact();
	    }

	    @SuppressWarnings("deprecation")
		public String extractUsername(String token) {
	        return Jwts.parser()
	                .setSigningKey(SECRET)
	                .parseClaimsJws(token)
	                .getBody()
	                .getSubject();
	    }
	}

