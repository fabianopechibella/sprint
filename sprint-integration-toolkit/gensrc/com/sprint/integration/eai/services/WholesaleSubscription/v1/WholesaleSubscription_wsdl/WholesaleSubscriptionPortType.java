/**
 * WholesaleSubscriptionPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sprint.integration.eai.services.WholesaleSubscription.v1.WholesaleSubscription_wsdl;

public interface WholesaleSubscriptionPortType extends java.rmi.Remote {
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionReply activatePendingSubscription(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivatePendingSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidReply activateSubscriptionMsid(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionMsidRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaReply activateSubscriptionNpa(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdReply activateSubscriptionNpaWithRsvId(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionNpaWithRsvIdRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionReply activateSubscription(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdReply activateSubscriptionWithRsvId(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ActivateSubscriptionWithRsvIdRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionReply reserveSubscription(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeReply reserveSubscriptionGeoCode(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaReply reserveSubscriptionGeoCodeNpa(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionGeoCodeNpaRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaReply reserveSubscriptionNpa(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionNpaRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
    public com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdReply reserveSubscriptionWithRsvId(com.sprint.integration.interfaces.WholesaleSubscription.v1.SubscriptionEnvelope_xsd.ReserveSubscriptionWithRsvIdRequest body) throws java.rmi.RemoteException, com.sprint.integration.common.ErrorDetails_xsd.ErrorDetailsType;
}