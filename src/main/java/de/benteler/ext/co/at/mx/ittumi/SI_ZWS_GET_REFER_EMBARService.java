

/**
 * SI_ZWS_GET_REFER_EMBARService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package de.benteler.ext.co.at.mx.ittumi;

    /*
     *  SI_ZWS_GET_REFER_EMBARService java interface
     */

    public interface SI_ZWS_GET_REFER_EMBARService {
          

        /**
          * Auto generated method signature
          * 
                    * @param z_FI_GET_REFER_EMBAR0
                
         */

         
                     public functions.rfc.sap.document.sap_com.Z_FI_GET_REFER_EMBARResponse sI_ZWS_GET_REFER_EMBAR(

                        functions.rfc.sap.document.sap_com.Z_FI_GET_REFER_EMBAR z_FI_GET_REFER_EMBAR0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param z_FI_GET_REFER_EMBAR0
            
          */
        public void startsI_ZWS_GET_REFER_EMBAR(

            functions.rfc.sap.document.sap_com.Z_FI_GET_REFER_EMBAR z_FI_GET_REFER_EMBAR0,

            final de.benteler.ext.co.at.mx.ittumi.SI_ZWS_GET_REFER_EMBARServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    