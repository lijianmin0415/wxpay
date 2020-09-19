package com.ljm.pay.wxpay.service;

import com.ljm.pay.wxpay.domain.Video;

public interface VideoService {
    Object findAll(int page,int size);

    Object findById(int videoId);

    Object delete(int videoId);

    Object update(Video video);

    Object save(Video video);
}
