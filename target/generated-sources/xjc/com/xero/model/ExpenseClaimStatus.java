//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 03:31:36 PM PST 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expenseClaimStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="expenseClaimStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SUBMITTED"/>
 *     &lt;enumeration value="AUTHORISED"/>
 *     &lt;enumeration value="PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "expenseClaimStatus")
@XmlEnum
public enum ExpenseClaimStatus {


    /**
     * Submitted
     * 
     */
    SUBMITTED,
    AUTHORISED,
    PAID;

    public String value() {
        return name();
    }

    public static ExpenseClaimStatus fromValue(String v) {
        return valueOf(v);
    }

}
