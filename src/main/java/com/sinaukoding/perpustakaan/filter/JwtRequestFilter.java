package com.sinaukoding.perpustakaan.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private JwtTokenService jwtTokenService;


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

//        final String requestHeaderToken = httpServletRequest.getHeader("Authorization");
//
//        String username = null;
//        String jwtToken = null;
//
//        if (requestHeaderToken != null) {
//            jwtToken = requestHeaderToken;
//
//            try {
//                username = jwtTokenService.getUsernameaFromToken(jwtToken);
//            }catch (IllegalArgumentException e) {
//                System.out.println("Unable to get Jwt Token");
//            }catch (ExpiredJwtException e) {
//                System.out.println("Token has expired");
//            }
//        }
//
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            User user = new User();
//            user.setUsername(username);
//
//            user = userService.findOne(user);
//
//            if (jwtTokenService.validationToken(jwtToken, user)) {
//                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
//                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//
//                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//            }
//        }

        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
