package com.xiaocang.cedis.core;

import lombok.Data;
import redis.clients.jedis.Jedis;

/**
 * 写redis
 * Created by cang on 15/11/18.
 */
@Data
public class WriteJedis extends BaseJedis {

    public WriteJedis(Jedis jedis) {
        this.jedis = jedis;
        this.client = jedis.getClient();
    }

    @Override
    public void close() {
        this.jedis.close();
    }

}
