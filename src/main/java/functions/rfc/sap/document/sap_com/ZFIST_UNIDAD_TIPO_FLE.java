
/**
 * ZFIST_UNIDAD_TIPO_FLE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package functions.rfc.sap.document.sap_com;
            

            /**
            *  ZFIST_UNIDAD_TIPO_FLE bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ZFIST_UNIDAD_TIPO_FLE
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ZFIST_UNIDAD_TIPO_FLE
                Namespace URI = urn:sap-com:document:sap:rfc:functions
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for TRANS
                        */

                        
                                    protected functions.rfc.sap.document.sap_com.TRANS_type1 localTRANS ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTRANSTracker = false ;

                           public boolean isTRANSSpecified(){
                               return localTRANSTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return functions.rfc.sap.document.sap_com.TRANS_type1
                           */
                           public  functions.rfc.sap.document.sap_com.TRANS_type1 getTRANS(){
                               return localTRANS;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TRANS
                               */
                               public void setTRANS(functions.rfc.sap.document.sap_com.TRANS_type1 param){
                            localTRANSTracker = param != null;
                                   
                                            this.localTRANS=param;
                                    

                               }
                            

                        /**
                        * field for CLAVE
                        */

                        
                                    protected functions.rfc.sap.document.sap_com.CLAVE_type1 localCLAVE ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCLAVETracker = false ;

                           public boolean isCLAVESpecified(){
                               return localCLAVETracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return functions.rfc.sap.document.sap_com.CLAVE_type1
                           */
                           public  functions.rfc.sap.document.sap_com.CLAVE_type1 getCLAVE(){
                               return localCLAVE;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CLAVE
                               */
                               public void setCLAVE(functions.rfc.sap.document.sap_com.CLAVE_type1 param){
                            localCLAVETracker = param != null;
                                   
                                            this.localCLAVE=param;
                                    

                               }
                            

                        /**
                        * field for SPRAS
                        */

                        
                                    protected functions.rfc.sap.document.sap_com.SPRAS_type1 localSPRAS ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPRASTracker = false ;

                           public boolean isSPRASSpecified(){
                               return localSPRASTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return functions.rfc.sap.document.sap_com.SPRAS_type1
                           */
                           public  functions.rfc.sap.document.sap_com.SPRAS_type1 getSPRAS(){
                               return localSPRAS;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPRAS
                               */
                               public void setSPRAS(functions.rfc.sap.document.sap_com.SPRAS_type1 param){
                            localSPRASTracker = param != null;
                                   
                                            this.localSPRAS=param;
                                    

                               }
                            

                        /**
                        * field for TEXTO
                        */

                        
                                    protected functions.rfc.sap.document.sap_com.TEXTO_type1 localTEXTO ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTEXTOTracker = false ;

                           public boolean isTEXTOSpecified(){
                               return localTEXTOTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return functions.rfc.sap.document.sap_com.TEXTO_type1
                           */
                           public  functions.rfc.sap.document.sap_com.TEXTO_type1 getTEXTO(){
                               return localTEXTO;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TEXTO
                               */
                               public void setTEXTO(functions.rfc.sap.document.sap_com.TEXTO_type1 param){
                            localTEXTOTracker = param != null;
                                   
                                            this.localTEXTO=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:sap-com:document:sap:rfc:functions");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ZFIST_UNIDAD_TIPO_FLE",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ZFIST_UNIDAD_TIPO_FLE",
                           xmlWriter);
                   }

               
                   }
                if (localTRANSTracker){
                                            if (localTRANS==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TRANS cannot be null!!");
                                            }
                                           localTRANS.serialize(new javax.xml.namespace.QName("","TRANS"),
                                               xmlWriter);
                                        } if (localCLAVETracker){
                                            if (localCLAVE==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CLAVE cannot be null!!");
                                            }
                                           localCLAVE.serialize(new javax.xml.namespace.QName("","CLAVE"),
                                               xmlWriter);
                                        } if (localSPRASTracker){
                                            if (localSPRAS==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SPRAS cannot be null!!");
                                            }
                                           localSPRAS.serialize(new javax.xml.namespace.QName("","SPRAS"),
                                               xmlWriter);
                                        } if (localTEXTOTracker){
                                            if (localTEXTO==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TEXTO cannot be null!!");
                                            }
                                           localTEXTO.serialize(new javax.xml.namespace.QName("","TEXTO"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:sap-com:document:sap:rfc:functions")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localTRANSTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "TRANS"));
                            
                            
                                    if (localTRANS==null){
                                         throw new org.apache.axis2.databinding.ADBException("TRANS cannot be null!!");
                                    }
                                    elementList.add(localTRANS);
                                } if (localCLAVETracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "CLAVE"));
                            
                            
                                    if (localCLAVE==null){
                                         throw new org.apache.axis2.databinding.ADBException("CLAVE cannot be null!!");
                                    }
                                    elementList.add(localCLAVE);
                                } if (localSPRASTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "SPRAS"));
                            
                            
                                    if (localSPRAS==null){
                                         throw new org.apache.axis2.databinding.ADBException("SPRAS cannot be null!!");
                                    }
                                    elementList.add(localSPRAS);
                                } if (localTEXTOTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "TEXTO"));
                            
                            
                                    if (localTEXTO==null){
                                         throw new org.apache.axis2.databinding.ADBException("TEXTO cannot be null!!");
                                    }
                                    elementList.add(localTEXTO);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ZFIST_UNIDAD_TIPO_FLE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ZFIST_UNIDAD_TIPO_FLE object =
                new ZFIST_UNIDAD_TIPO_FLE();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ZFIST_UNIDAD_TIPO_FLE".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ZFIST_UNIDAD_TIPO_FLE)functions.rfc.sap.document.sap_com.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TRANS").equals(reader.getName())){
                                
                                                object.setTRANS(functions.rfc.sap.document.sap_com.TRANS_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CLAVE").equals(reader.getName())){
                                
                                                object.setCLAVE(functions.rfc.sap.document.sap_com.CLAVE_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","SPRAS").equals(reader.getName())){
                                
                                                object.setSPRAS(functions.rfc.sap.document.sap_com.SPRAS_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TEXTO").equals(reader.getName())){
                                
                                                object.setTEXTO(functions.rfc.sap.document.sap_com.TEXTO_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    