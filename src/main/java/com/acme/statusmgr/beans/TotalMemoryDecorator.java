package com.acme.statusmgr.beans;

public class TotalMemoryDecorator extends ServerDecorator {
    public TotalMemoryDecorator(ServerInfo info) {
        super(info);
    }
    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and there is a total of "
        + facade.getTotalJVMMemory() + "bytes of JVM memory";
    }
    
}
