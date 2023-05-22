package com.xiaocang.cedis.core;

import lombok.Data;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 读redis
 * Created by cang on 15/11/18.
 */
@Data
public class ReadJedis extends BaseJedis {

    private JedisPool jedisPool;

    public ReadJedis(Jedis jedis, JedisPool jedisPool) {
        this.jedis = jedis;
        this.jedisPool = jedisPool;
        this.client = jedis.getClient();
    }

    @Override
    public void close() {
        this.jedis.close();
    }
}
