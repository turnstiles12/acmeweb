package com.acme.statusmgr.beans;

public class ServerInfoFacade {
    private final Runtime runtime = Runtime.getRuntime();
    private static ServerInfoFacade instance = null;

    private ServerInfoFacade() {}

    public static ServerInfoFacade getInstance() {
        if (instance == null)
            instance = new ServerInfoFacade();
        return instance;
    }
    public String getTempLocation() { 
        return System.getProperty("java.io.tmpdir"); 
    }
    public String getJreVersion()   { 
        return Runtime.version().toString();
     }
    public long getTotalJVMMemory() { 
        return runtime.totalMemory(); 
    }
    public long getFreeJVMMemory()  { 
        return runtime.freeMemory(); 
    }
    public int getAvailableProcessors() { 
        return runtime.availableProcessors(); 
    }
}
