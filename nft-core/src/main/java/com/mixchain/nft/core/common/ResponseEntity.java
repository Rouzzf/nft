package com.mixchain.nft.core.common;

import lombok.Data;

/**
 * 返回实体
 */
@Data
public class ResponseEntity {
    public int code;
    public String msg;
    public String time;
    public Object data;

    public static ResponseEntity ok(String msg, Object data) {
        return new ResponseEntity(1, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity ok(int code, String msg, Object data) {
        return new ResponseEntity(code, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public static ResponseEntity error(int code, String msg, Object data) {
        return new ResponseEntity(code, msg, String.valueOf(System.currentTimeMillis() / 1000), data);
    }

    public ResponseEntity(int code, String msg, String time, Object data) {
        this.code = code;
        this.msg = msg;
        this.time = time;
        this.data = data;
    }
}
