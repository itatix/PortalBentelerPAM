

/**
 * SI_ZWS_UPDATE_LECTURA_AVISOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package de.benteler.ext.co.at.mx.ittumi;

    /*
     *  SI_ZWS_UPDATE_LECTURA_AVISOService java interface
     */

    public interface SI_ZWS_UPDATE_LECTURA_AVISOService {
          

        /**
          * Auto generated method signature
          * 
                    * @param z_FE_FM_UPDATE_LECTURA_AVISO0
                
         */

         
                     public functions.rfc.sap.document.sap_com.Z_FE_FM_UPDATE_LECTURA_AVISOResponse sI_ZWS_UPDATE_LECTURA_AVISO(

                        functions.rfc.sap.document.sap_com.Z_FE_FM_UPDATE_LECTURA_AVISO z_FE_FM_UPDATE_LECTURA_AVISO0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param z_FE_FM_UPDATE_LECTURA_AVISO0
            
          */
        public void startsI_ZWS_UPDATE_LECTURA_AVISO(

            functions.rfc.sap.document.sap_com.Z_FE_FM_UPDATE_LECTURA_AVISO z_FE_FM_UPDATE_LECTURA_AVISO0,

            final de.benteler.ext.co.at.mx.ittumi.SI_ZWS_UPDATE_LECTURA_AVISOServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    