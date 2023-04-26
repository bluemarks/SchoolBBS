package com.jd.wego.async;

import java.util.*;

public interface EventHandler {

    /**
     * 处理EventModel
     */
    void doHandler(EventModel eventModel);

    List<EventType> getSupportEventTypes();
}
