package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.decorators.ServerInfo;

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
    
    @Override
    public Integer getRequestCost() {
        return 3 + decoratedServerInfo.getRequestCost();
    }
    
}
