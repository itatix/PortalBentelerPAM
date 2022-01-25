
/**
 * SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package de.benteler.ext.co.at.mx.ittumi;

    /**
     *  SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SI_ZWS_DET_FACT_CONSIGServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sI_ZWS_DET_FACT_CONSIG method
            * override this method for handling normal response from sI_ZWS_DET_FACT_CONSIG operation
            */
           public void receiveResultsI_ZWS_DET_FACT_CONSIG(
                    functions.rfc.sap.document.sap_com.Z_FE_FM_DET_FACT_CONSIGResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sI_ZWS_DET_FACT_CONSIG operation
           */
            public void receiveErrorsI_ZWS_DET_FACT_CONSIG(java.lang.Exception e) {
            }
                


    }
    