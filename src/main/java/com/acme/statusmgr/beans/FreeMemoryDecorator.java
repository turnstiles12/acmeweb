package com.acme.statusmgr.beans;

public class FreeMemoryDecorator extends ServerDecorator{
    public FreeMemoryDecorator(ServerInfo info) {
        super(info);
    }
    public FreeMemoryDecorator(ServerInfo info, ServerFacade fac) {
        super(info, fac);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and there are " + facade.getFreeJVMMemory() +
        " bytes of free memory";
    }
    @Override
    public Integer getRequestCost() {
        return 7 + decoratedServerInfo.getRequestCost();
    }
}
