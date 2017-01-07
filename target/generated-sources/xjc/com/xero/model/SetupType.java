//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 03:31:36 PM PST 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ConversionDetails" type="{}ConversionDetails"/>
 *         &lt;element name="Organisation" type="{}Organisation" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{}ArrayOfAccount" minOccurs="0"/>
 *         &lt;element name="TaxRates" type="{}ArrayOfTaxRate" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{}ArrayOfContact" minOccurs="0"/>
 *         &lt;element name="Items" type="{}ArrayOfItem" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetupType", propOrder = {

})
public class SetupType {

    @XmlElement(name = "ConversionDetails", required = true)
    protected ConversionDetails conversionDetails;
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElement(name = "Accounts")
    protected ArrayOfAccount accounts;
    @XmlElement(name = "TaxRates")
    protected ArrayOfTaxRate taxRates;
    @XmlElement(name = "Contacts")
    protected ArrayOfContact contacts;
    @XmlElement(name = "Items")
    protected ArrayOfItem items;

    /**
     * Gets the value of the conversionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionDetails }
     *     
     */
    public ConversionDetails getConversionDetails() {
        return conversionDetails;
    }

    /**
     * Sets the value of the conversionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionDetails }
     *     
     */
    public void setConversionDetails(ConversionDetails value) {
        this.conversionDetails = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount }
     *     
     */
    public ArrayOfAccount getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount }
     *     
     */
    public void setAccounts(ArrayOfAccount value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the taxRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxRate }
     *     
     */
    public ArrayOfTaxRate getTaxRates() {
        return taxRates;
    }

    /**
     * Sets the value of the taxRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxRate }
     *     
     */
    public void setTaxRates(ArrayOfTaxRate value) {
        this.taxRates = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContact }
     *     
     */
    public ArrayOfContact getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContact }
     *     
     */
    public void setContacts(ArrayOfContact value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setItems(ArrayOfItem value) {
        this.items = value;
    }

}
