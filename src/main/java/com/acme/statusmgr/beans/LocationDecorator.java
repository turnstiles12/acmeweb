package com.acme.statusmgr.beans;

public class LocationDecorator extends ServerDecorator{
    public LocationDecorator(ServerInfo info) {
        super(info);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + facade.getTempLocation();
    }
}
