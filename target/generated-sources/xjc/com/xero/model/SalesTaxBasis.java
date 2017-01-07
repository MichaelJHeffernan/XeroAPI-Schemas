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
 * <p>Java class for salesTaxBasis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="salesTaxBasis">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PAYMENTS"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="ACCRUAL"/>
 *     &lt;enumeration value="FLATRATECASH"/>
 *     &lt;enumeration value="FLATRATEACCRUAL"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="ACCRUALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "salesTaxBasis")
@XmlEnum
public enum SalesTaxBasis {


    /**
     * Payments Basis
     * 
     */
    PAYMENTS,

    /**
     * Invoice Basis
     * 
     */
    INVOICE,

    /**
     * None
     * 
     */
    NONE,

    /**
     * Cash Scheme
     * 
     */
    CASH,

    /**
     * Accrual Scheme
     * 
     */
    ACCRUAL,

    /**
     * Flat Rate Cash Scheme
     * 
     */
    FLATRATECASH,

    /**
     * Flat Rate Accrual Scheme
     * 
     */
    FLATRATEACCRUAL,

    /**
     * Accruals Basis
     * 
     */
    ACCRUALS;

    public String value() {
        return name();
    }

    public static SalesTaxBasis fromValue(String v) {
        return valueOf(v);
    }

}
