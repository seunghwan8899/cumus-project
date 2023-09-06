package com.zerobase.cms.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableRedisRepositories
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String,Object> redisTemplete = new RedisTemplate<>();
        StringRedisSerializer serializer = new StringRedisSerializer();

        redisTemplete.setConnectionFactory(redisConnectionFactory);
      redisTemplete.setKeySerializer(serializer);
      redisTemplete.setValueSerializer(serializer);
        redisTemplete.setHashKeySerializer(serializer);
        redisTemplete.setHashValueSerializer(serializer);
        return redisTemplete;

    }
}
