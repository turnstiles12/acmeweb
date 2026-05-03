package com.acme.statusmgr.beans;

public class LocationDecorator extends ServerDecorator{
    public LocationDecorator(ServerInfo info) {
        super(info);
    }
    public LocationDecorator(ServerInfo info, ServerFacade fac) {
        super(info, fac);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and the server's temp file location is "
        + facade.getTempLocation();
    }
    
    @Override
    public Integer getRequestCost() {
        return 29 + decoratedServerInfo.getRequestCost();
    }
}
