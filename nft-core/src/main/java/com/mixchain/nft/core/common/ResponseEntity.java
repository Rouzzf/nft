package com.mixchain.nft.core.common;

import com.mixchain.nft.core.constant.NftConstant;
import lombok.Data;

/**
 * 返回实体
 */
@Data
public class ResponseEntity {
    public Integer code;
    public String msg;
    public String time;
    public Object data;

    public static ResponseEntity ok(String msg, Object data) {
        return new ResponseEntity(NftConstant.successCode, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity ok(Object data) {
        return new ResponseEntity(NftConstant.successCode, NftConstant.successMsg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity ok(Integer code, String msg, Object data) {
        return new ResponseEntity(code, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity error(Integer code, String msg, Object data) {
        return new ResponseEntity(code, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity error(String msg, Object data) {
        return new ResponseEntity(NftConstant.errorCode, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity error(String msg) {
        return new ResponseEntity(NftConstant.errorCode, msg, String.valueOf(System.currentTimeMillis() / 1000), null);
    }

    public static ResponseEntity error() {
        return new ResponseEntity(NftConstant.errorCode, NftConstant.errorMsg, String.valueOf(System.currentTimeMillis() / 1000), null);
    }

    public ResponseEntity(Integer code, String msg, String time, Object data) {
        this.code = code;
        this.msg = msg;
        this.time = time;
        this.data = data;
    }
}
