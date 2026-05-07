package com.acme.statusmgr.beans.decorators;

/**
 * Creates interface of facades that will return
 * status details
 */
public interface ServerFacade {
    public String getTempLocation();
    public String getJreVersion();
    public long getTotalJVMMemory(); 
    public long getFreeJVMMemory();
    public int getAvailableProcessors();
}
