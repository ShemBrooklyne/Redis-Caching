package com.geekwys.rediscaching;

import com.geekwys.rediscaching.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author shem.mwangi
 */
@SpringBootApplication
public class RedisCachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCachingApplication.class, args);
    }

    //initiate new redis connection
    @Bean
    RedisConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory();
    }

    //initiating RedisTemplate for entity users
    @Bean
    RedisTemplate<String, User> redisTemplate() {
        RedisTemplate<String, User> userRedisTemplate = new RedisTemplate<>();
        userRedisTemplate.setConnectionFactory(redisConnectionFactory());
        return userRedisTemplate;
    }

}
