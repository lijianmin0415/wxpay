package com.ljm.pay.wxpay.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljm.pay.wxpay.domain.Video;
import com.ljm.pay.wxpay.mapper.VideoMapper;
import com.ljm.pay.wxpay.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public Object findAll(int page,int size) {
        PageHelper.startPage(page,size);
        List<Video> videos = videoMapper.selectAll();
        PageInfo<Video> videoInfo=new PageInfo<>(videos);
        return videoInfo;
    }

    @Override
    public Object findById(int videoId) {
        return videoMapper.selectByPrimaryKey(videoId);
    }

    @Override
    public Object delete(int videoId) {
        return videoMapper.deleteByPrimaryKey(videoId);
    }

    @Override
    public Object update(Video video) {
        return videoMapper.updateByPrimaryKeySelective(video);
    }

    @Override
    public Integer save(Video video) {
        videoMapper.insert(video);
        return video.getId();
    }
}
