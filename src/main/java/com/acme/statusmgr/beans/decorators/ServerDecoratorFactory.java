package com.acme.statusmgr.beans.decorators;

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
    public static ServerInfo decorate(String detail, ServerInfo info, ServerFacade fac) {
        if (detail.equals("availableProcessors"))
            return new ProcessorsDecorator(info, fac);
        if (detail.equals("freeJVMMemory"))
            return new FreeMemoryDecorator(info, fac);
        if (detail.equals("totalJVMMemory"))
            return new TotalMemoryDecorator(info, fac);
        if (detail.equals("tempLocation"))
            return new LocationDecorator(info, fac);
        if (detail.equals("jreVersion"))
            return new JREDecorator(info, fac);
        Logger logger = LoggerFactory.getLogger(ServerDecoratorFactory.class);
        logger.warn("Invalid details option: " + detail);
        return info;
    }
}
