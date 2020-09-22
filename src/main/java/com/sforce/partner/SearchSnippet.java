
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SearchSnippet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSnippet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wholeFields" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSnippet", propOrder = {
    "text",
    "wholeFields"
})
public class SearchSnippet
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected String text;
    protected List<NameValuePair> wholeFields;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the wholeFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wholeFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWholeFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getWholeFields() {
        if (wholeFields == null) {
            wholeFields = new ArrayList<NameValuePair>();
        }
        return this.wholeFields;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchSnippet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchSnippet that = ((SearchSnippet) object);
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
                return false;
            }
        }
        {
            List<NameValuePair> lhsWholeFields;
            lhsWholeFields = (((this.wholeFields!= null)&&(!this.wholeFields.isEmpty()))?this.getWholeFields():null);
            List<NameValuePair> rhsWholeFields;
            rhsWholeFields = (((that.wholeFields!= null)&&(!that.wholeFields.isEmpty()))?that.getWholeFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wholeFields", lhsWholeFields), LocatorUtils.property(thatLocator, "wholeFields", rhsWholeFields), lhsWholeFields, rhsWholeFields)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            List<NameValuePair> theWholeFields;
            theWholeFields = (((this.wholeFields!= null)&&(!this.wholeFields.isEmpty()))?this.getWholeFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wholeFields", theWholeFields), currentHashCode, theWholeFields);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            List<NameValuePair> theWholeFields;
            theWholeFields = (((this.wholeFields!= null)&&(!this.wholeFields.isEmpty()))?this.getWholeFields():null);
            strategy.appendField(locator, this, "wholeFields", buffer, theWholeFields);
        }
        return buffer;
    }

}
