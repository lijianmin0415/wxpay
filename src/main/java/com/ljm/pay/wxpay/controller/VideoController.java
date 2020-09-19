package com.ljm.pay.wxpay.controller;

import com.ljm.pay.wxpay.domain.Video;
import com.ljm.pay.wxpay.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "size",defaultValue = "10") int size) {
        return videoService.findAll(page,size);
    }

    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id",required = true) int videoId) {
        return videoService.findById(videoId);
    }

}
