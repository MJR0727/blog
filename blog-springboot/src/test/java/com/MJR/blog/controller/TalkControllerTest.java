package com.MJR.blog.controller;

import com.MJR.blog.service.TalkService;
import com.MJR.blog.vo.TalkVO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TalkControllerTest {

    @Autowired
    private TalkService talkService;


    @BeforeEach
    void setUp() {
        System.out.println("方法开始了");
    }

    @AfterEach
    void tearDown() {
        System.out.println("方法结束了");
    }

    @Test
    void saveOrUpdateTalk() {
        TalkVO talkVO = new TalkVO();
        talkVO.setContent("helloBolg");
        talkVO.setIsTop(0);
        talkVO.setStatus(2);
        talkService.saveOrUpdateTalk(talkVO);
    }
}