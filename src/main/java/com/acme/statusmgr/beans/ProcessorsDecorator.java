package com.acme.statusmgr.beans;

public class ProcessorsDecorator extends ServerDecorator {
    public ProcessorsDecorator(ServerInfo info) {
        super(info);
    }
    public ProcessorsDecorator(ServerInfo info, ServerFacade fac) {
        super(info, fac);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and there are "
        + facade.getAvailableProcessors() + " processors available";
    }
    
}
