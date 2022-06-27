package com.mixchain.nft.core.util;

public class PageUtil {
    
    public static Integer getPer(Integer page, Integer pageSize) {
        page = page <= 0 ? page : 1;
        pageSize = pageSize <= 0 ? pageSize : 10;
        return (page - 1) * pageSize;
    }
}
