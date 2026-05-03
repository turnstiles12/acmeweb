package com.acme.statusmgr.beans;

/**
 * Decorators to ServerInfo interface to add information about
 * JRE version, Temp server location,
 * total JVM memory, free JVM memory, available processors
 */
public abstract class ServerDecorator implements ServerInfo {
    protected ServerInfo decoratedServerInfo;
    protected ServerInfoFacade facade;
    
    public ServerDecorator(ServerInfo info) {
        decoratedServerInfo = info;
        facade = ServerInfoFacade.getInstance();
    }
    @Override
    public long getId() {
        return decoratedServerInfo.getId();
    }

    @Override
    public String getContentHeader() {
        return decoratedServerInfo.getContentHeader();
    }

    @Override
    public Integer getRequestCost() {
        return decoratedServerInfo.getRequestCost();
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc();
    }
}
