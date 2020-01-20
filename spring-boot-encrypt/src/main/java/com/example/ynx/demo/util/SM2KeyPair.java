package com.example.ynx.demo.util;

import java.math.BigInteger;

import org.bouncycastle.math.ec.ECPoint;

/**
 * 公私钥对
 * @author ynx
 * @version V1.0
 * @date 2020-01-20
 */
public class SM2KeyPair {

    private final ECPoint publicKey;
    private final BigInteger privateKey;

    SM2KeyPair(ECPoint publicKey, BigInteger privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public ECPoint getPublicKey() {
        return publicKey;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

}
