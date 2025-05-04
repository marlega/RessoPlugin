package com.github.marlega.Plugin;

import dev.arbjerg.lavalink.api.ISocketContext;
import dev.arbjerg.lavalink.api.PluginEventHandler;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RessoPlugin extends PluginEventHandler {

    private static final Logger log = LoggerFactory.getLogger(RessoPlugin.class);

    public RessoPlugin() {
        log.info("Hello, world!");
    }

    @Override
    public void onWebSocketOpen(@NotNull ISocketContext context, boolean resumed) {
        log.info("Websocket opened!");
    }
}
