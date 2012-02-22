/**
 * ResendPortMessageResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.interfaces.resendPortMessage.v1.resendPortMessage_xsd;

public class ResendPortMessageResponseType  implements java.io.Serializable {
    /* Total number of possible records EAI returns for the given
     * selection criteria. */
    private java.math.BigInteger totalPossibleRecords;

    public ResendPortMessageResponseType() {
    }

    public ResendPortMessageResponseType(
           java.math.BigInteger totalPossibleRecords) {
           this.totalPossibleRecords = totalPossibleRecords;
    }


    /**
     * Gets the totalPossibleRecords value for this ResendPortMessageResponseType.
     * 
     * @return totalPossibleRecords   * Total number of possible records EAI returns for the given
     * selection criteria.
     */
    public java.math.BigInteger getTotalPossibleRecords() {
        return totalPossibleRecords;
    }


    /**
     * Sets the totalPossibleRecords value for this ResendPortMessageResponseType.
     * 
     * @param totalPossibleRecords   * Total number of possible records EAI returns for the given
     * selection criteria.
     */
    public void setTotalPossibleRecords(java.math.BigInteger totalPossibleRecords) {
        this.totalPossibleRecords = totalPossibleRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResendPortMessageResponseType)) return false;
        ResendPortMessageResponseType other = (ResendPortMessageResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalPossibleRecords==null && other.getTotalPossibleRecords()==null) || 
             (this.totalPossibleRecords!=null &&
              this.totalPossibleRecords.equals(other.getTotalPossibleRecords())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTotalPossibleRecords() != null) {
            _hashCode += getTotalPossibleRecords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResendPortMessageResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "ResendPortMessageResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPossibleRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://integration.sprint.com/interfaces/resendPortMessage/v1/resendPortMessage.xsd", "totalPossibleRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}