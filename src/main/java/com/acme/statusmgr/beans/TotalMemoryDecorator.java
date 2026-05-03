package com.acme.statusmgr.beans;

public class TotalMemoryDecorator extends ServerDecorator {
    public TotalMemoryDecorator(ServerInfo info) {
        super(info);
    }
    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + facade.getTotalJVMMemory();
    }
    
}
