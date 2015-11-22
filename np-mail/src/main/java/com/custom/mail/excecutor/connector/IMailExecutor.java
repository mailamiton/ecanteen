package com.custom.mail.excecutor.connector;


/**
 * 
 * @author amit
 *
 */
public interface IMailExecutor {

    /**
     * Send mail synch.
     * @return success and failure.
     */
    boolean senMailSynch();

    /**
     * send mail Asynchronous.
     * 
    */
    void sendMailAsynch();
}
