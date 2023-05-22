package com.xiaocang.cedis.core;

import lombok.Data;

/**
 * redis数据源实现
 * Created by cang on 2015/10/10.
 */
@Data
public class RedisDataSourceImpl implements RedisDataSource {

    private JedisSentinelPoolExt jedisSentinelPool;

    @Override
    public WriteJedis getRedisWriteClient() {
        return jedisSentinelPool.getWriteResource();
    }

    @Override
    public ReadJedis getRedisReadClient() {
        return jedisSentinelPool.getReadResource();
    }

    @Override
    public void resetReadPool() {
        jedisSentinelPool.resetReadPool();
    }
}
