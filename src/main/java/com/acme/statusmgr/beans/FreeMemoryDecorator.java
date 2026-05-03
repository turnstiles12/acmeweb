package com.acme.statusmgr.beans;

public class FreeMemoryDecorator extends ServerDecorator{
    public FreeMemoryDecorator(ServerInfo info) {
        super(info);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and there are " + facade.getFreeJVMMemory() +
        " bytes of free memory";
    }
}
