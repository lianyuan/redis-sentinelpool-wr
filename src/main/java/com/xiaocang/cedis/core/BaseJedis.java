package com.xiaocang.cedis.core;

import lombok.Data;
import redis.clients.jedis.Jedis;

/**
 * 基础jedis
 * Created by cang on 15/12/16.
 */
@Data
public class BaseJedis extends Jedis {

    protected Jedis jedis;

}
