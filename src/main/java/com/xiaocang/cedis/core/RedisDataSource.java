package com.xiaocang.cedis.core;

/**
 * redis数据源接口
 * Created by cang on 2015/10/10.
 */
public interface RedisDataSource {

//    Jedis getRedisClient();

//    void returnResource(Jedis shardedJedis, boolean broken);

    WriteJedis getRedisWriteClient();

    ReadJedis getRedisReadClient();

    void resetReadPool();
}
