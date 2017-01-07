//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 03:31:36 PM PST 
//


package com.xero.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Journal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ValidationErrors" type="{}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="JournalID" type="{}uniqueIdentifier"/>
 *         &lt;element name="JournalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="JournalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreatedDateUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{}uniqueIdentifier"/>
 *         &lt;element name="SourceType" type="{}journalSourceType" minOccurs="0"/>
 *         &lt;element name="JournalLines" type="{}ArrayOfJournalLine"/>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{}entityValidationStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journal", propOrder = {

})
public class Journal {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "JournalID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalID;
    @XmlElement(name = "JournalDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar journalDate;
    @XmlElement(name = "JournalNumber", required = true)
    protected String journalNumber;
    @XmlElement(name = "CreatedDateUTC", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdDateUTC;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "SourceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sourceID;
    @XmlElement(name = "SourceType")
    protected JournalSourceType sourceType;
    @XmlElement(name = "JournalLines", required = true)
    protected ArrayOfJournalLine journalLines;
    @XmlAttribute(name = "status")
    protected EntityValidationStatus status;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the journalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalID() {
        return journalID;
    }

    /**
     * Sets the value of the journalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalID(String value) {
        this.journalID = value;
    }

    /**
     * Gets the value of the journalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getJournalDate() {
        return journalDate;
    }

    /**
     * Sets the value of the journalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalDate(Calendar value) {
        this.journalDate = value;
    }

    /**
     * Gets the value of the journalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalNumber() {
        return journalNumber;
    }

    /**
     * Sets the value of the journalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalNumber(String value) {
        this.journalNumber = value;
    }

    /**
     * Gets the value of the createdDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedDateUTC() {
        return createdDateUTC;
    }

    /**
     * Sets the value of the createdDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDateUTC(Calendar value) {
        this.createdDateUTC = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JournalSourceType }
     *     
     */
    public JournalSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalSourceType }
     *     
     */
    public void setSourceType(JournalSourceType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the journalLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJournalLine }
     *     
     */
    public ArrayOfJournalLine getJournalLines() {
        return journalLines;
    }

    /**
     * Sets the value of the journalLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJournalLine }
     *     
     */
    public void setJournalLines(ArrayOfJournalLine value) {
        this.journalLines = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityValidationStatus }
     *     
     */
    public EntityValidationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityValidationStatus }
     *     
     */
    public void setStatus(EntityValidationStatus value) {
        this.status = value;
    }

}
