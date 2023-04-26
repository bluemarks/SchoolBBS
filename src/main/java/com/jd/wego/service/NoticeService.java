package com.jd.wego.service;

import com.jd.wego.entity.Notice;

import java.util.*;


public interface NoticeService {

    void insertNotice(Notice notice);

    Notice selectNotice();

    void updateAllNoticeHasRead(String userId);

    int countNoticeHasRead(String userId);

    List<Notice> noticeList(String userId);
}
