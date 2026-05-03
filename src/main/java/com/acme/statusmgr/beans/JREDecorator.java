package com.acme.statusmgr.beans;

public class JREDecorator extends ServerDecorator {

    public JREDecorator(ServerInfo info) {
        super(info);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + facade.getJreVersion();
    }
    
}
