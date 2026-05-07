package com.acme.statusmgr.beans.decorators;

/**
 * Mock class used for tesitng to give fixed details values
 */
public class ServerInfoMock implements ServerFacade {
    public String getTempLocation() { 
        return "M:\\AppData\\Local\\Temp";
    }
    public String getJreVersion()   { 
        return "15.0.2+7-27";
     }
    public long getTotalJVMMemory() { 
        return 159383552; 
    }
    public long getFreeJVMMemory()  { 
        return 127268272; 
    }
    public int getAvailableProcessors() { 
        return 4; 
    }
}
