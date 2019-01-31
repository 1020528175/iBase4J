package org.ibase4j.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Component;

import top.ibase4j.core.listener.ApplicationReadyListener;

@Component
public class BizServerListener extends ApplicationReadyListener {
    protected final Logger logger = LogManager.getLogger(this.getClass());

    public void onApplicationEvent(ApplicationReadyEvent event) {
        super.onApplicationEvent(event);
    }
}
