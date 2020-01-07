package com.xr.boot.util.redislock;

/**
 * redis分布式锁等待重入锁机制
 */
public class RedisLockException extends RuntimeException {

    public RedisLockException() {
    }

    public RedisLockException(String message) {
        super(message);
    }

    public RedisLockException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedisLockException(Throwable cause) {
        super(cause);
    }

    public RedisLockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}