package com.jd.wego.entity;

import lombok.Data;


@Data
public class Message {

    int messageId;

    String fromId;

    String toId;

    String messageContent;

    int hasRead;

    String conversationId;


}
