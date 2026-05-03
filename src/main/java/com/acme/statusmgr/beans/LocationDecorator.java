package com.acme.statusmgr.beans;

public class LocationDecorator extends ServerDecorator{
    public LocationDecorator(ServerInfo info) {
        super(info);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and the server's temp file location is "
        + facade.getTempLocation();
    }
}
