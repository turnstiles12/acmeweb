package com.acme.statusmgr.beans;

public class JREDecorator extends ServerDecorator {

    public JREDecorator(ServerInfo info) {
        super(info);
    }
    public JREDecorator(ServerInfo info, ServerFacade fac) {
        super(info, fac);
    }

    @Override
    public String getStatusDesc() {
        return decoratedServerInfo.getStatusDesc() + ", and the JRE version is "
        + facade.getJreVersion();
    }
    @Override
    public Integer getRequestCost() {
        return 19 + decoratedServerInfo.getRequestCost();
    }
    
}
