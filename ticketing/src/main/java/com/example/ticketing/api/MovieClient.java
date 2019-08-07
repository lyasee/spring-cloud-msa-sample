package com.example.ticketing.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "movie-service", // eureka service 이름
        decode404 = true // 404 발생시 feign 자체 에러 발생 안함
)
@Component
public interface MovieClient {

    @GetMapping("/movie")
    String getMovieName();
}
