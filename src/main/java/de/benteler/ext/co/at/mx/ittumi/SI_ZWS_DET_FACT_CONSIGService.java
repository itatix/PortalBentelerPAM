

/**
 * SI_ZWS_DET_FACT_CONSIGService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package de.benteler.ext.co.at.mx.ittumi;

    /*
     *  SI_ZWS_DET_FACT_CONSIGService java interface
     */

    public interface SI_ZWS_DET_FACT_CONSIGService {
          

        /**
          * Auto generated method signature
          * 
                    * @param z_FE_FM_DET_FACT_CONSIG0
                
         */

         
                     public functions.rfc.sap.document.sap_com.Z_FE_FM_DET_FACT_CONSIGResponse sI_ZWS_DET_FACT_CONSIG(

                        functions.rfc.sap.document.sap_com.Z_FE_FM_DET_FACT_CONSIG z_FE_FM_DET_FACT_CONSIG0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param z_FE_FM_DET_FACT_CONSIG0
            
          */
        public void startsI_ZWS_DET_FACT_CONSIG(

            functions.rfc.sap.document.sap_com.Z_FE_FM_DET_FACT_CONSIG z_FE_FM_DET_FACT_CONSIG0,

            final de.benteler.ext.co.at.mx.ittumi.SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    