package com.acme.statusmgr.beans;

/**
 * Stores data about server including id, content header and details
 * 
 * Has decorators to add info about JRE version, Temp server location,
 * total JVM memory, free JVM memory, available processors
 * Gives info about all varied types of system status 
 */
public interface ServerInfo {

    /**
     * get the id of this request
     *
     * @return a numeric id that increases during life of server for each request .
     */
    public long getId();

    /**
     * Get the content header that was specified by the request
     *
     * @return some string
     */
    public String getContentHeader();

    /**
     * Get an english-like description of the server's current status,
     * obtained from the appropriate Manager class.
     *
     * @return A string describing status
     */
    public String getStatusDesc();

    /**
     * Get the cost of this request
     * @return Integer representing the cost of request as number of pennies
     */
    public Integer getRequestCost();

}