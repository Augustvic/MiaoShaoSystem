package com.miaosha.redis;

public class PermitBucketKey extends BasePrefix{

    public PermitBucketKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static PermitBucketKey permitBucket = new PermitBucketKey(0, "pb");
}
