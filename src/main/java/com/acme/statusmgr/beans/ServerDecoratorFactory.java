package com.acme.statusmgr.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerDecoratorFactory {
    public static ServerInfo decorate(String detail, ServerInfo info) {
        if (detail.equals("availableProcessors"))
            return new ProcessorsDecorator(info);
        if (detail.equals("freeJVMMemory"))
            return new FreeMemoryDecorator(info);
        if (detail.equals("totalJVMMemory"))
            return new TotalMemoryDecorator(info);
        if (detail.equals("tempLocation"))
            return new LocationDecorator(info);
        if (detail.equals("jreVersion"))
            return new JREDecorator(info);
        Logger logger = LoggerFactory.getLogger(ServerDecoratorFactory.class);
        logger.warn("Invalid details option: " + detail);
        return info;
    }
}
