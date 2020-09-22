
package com.sforce.partner;

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
 * <p>Java class for DataCategoryGroupSobjectTypePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataCategoryGroupSobjectTypePair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataCategoryGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataCategoryGroupSobjectTypePair", propOrder = {
    "dataCategoryGroupName",
    "sobject"
})
public class DataCategoryGroupSobjectTypePair
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String dataCategoryGroupName;
    @XmlElement(required = true)
    protected String sobject;

    /**
     * Gets the value of the dataCategoryGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryGroupName() {
        return dataCategoryGroupName;
    }

    /**
     * Sets the value of the dataCategoryGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryGroupName(String value) {
        this.dataCategoryGroupName = value;
    }

    /**
     * Gets the value of the sobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobject() {
        return sobject;
    }

    /**
     * Sets the value of the sobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobject(String value) {
        this.sobject = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataCategoryGroupSobjectTypePair)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataCategoryGroupSobjectTypePair that = ((DataCategoryGroupSobjectTypePair) object);
        {
            String lhsDataCategoryGroupName;
            lhsDataCategoryGroupName = this.getDataCategoryGroupName();
            String rhsDataCategoryGroupName;
            rhsDataCategoryGroupName = that.getDataCategoryGroupName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryGroupName", lhsDataCategoryGroupName), LocatorUtils.property(thatLocator, "dataCategoryGroupName", rhsDataCategoryGroupName), lhsDataCategoryGroupName, rhsDataCategoryGroupName)) {
                return false;
            }
        }
        {
            String lhsSobject;
            lhsSobject = this.getSobject();
            String rhsSobject;
            rhsSobject = that.getSobject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobject", lhsSobject), LocatorUtils.property(thatLocator, "sobject", rhsSobject), lhsSobject, rhsSobject)) {
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
            String theDataCategoryGroupName;
            theDataCategoryGroupName = this.getDataCategoryGroupName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryGroupName", theDataCategoryGroupName), currentHashCode, theDataCategoryGroupName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobject", theSobject), currentHashCode, theSobject);
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
            String theDataCategoryGroupName;
            theDataCategoryGroupName = this.getDataCategoryGroupName();
            strategy.appendField(locator, this, "dataCategoryGroupName", buffer, theDataCategoryGroupName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            strategy.appendField(locator, this, "sobject", buffer, theSobject);
        }
        return buffer;
    }

}
