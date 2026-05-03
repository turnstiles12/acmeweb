package com.acme.statusmgr.beans;

public class ProcessorsDecorator extends ServerDecorator {
    public ProcessorsDecorator(ServerInfo info) {
        super(info);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + facade.getAvailableProcessors();
    }
    
}
