
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ReportChartComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportChartComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cacheData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contextFilterableField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hideOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showTitle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="size" type="{urn:partner.soap.sforce.com}ReportChartSize"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportChartComponent", propOrder = {
    "cacheData",
    "contextFilterableField",
    "error",
    "hideOnError",
    "includeContext",
    "showTitle",
    "size"
})
public class ReportChartComponent
    extends DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    protected boolean cacheData;
    @XmlElement(required = true)
    protected String contextFilterableField;
    @XmlElement(required = true)
    protected String error;
    protected boolean hideOnError;
    protected boolean includeContext;
    protected boolean showTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReportChartSize size;

    /**
     * Gets the value of the cacheData property.
     * 
     */
    public boolean isCacheData() {
        return cacheData;
    }

    /**
     * Sets the value of the cacheData property.
     * 
     */
    public void setCacheData(boolean value) {
        this.cacheData = value;
    }

    /**
     * Gets the value of the contextFilterableField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextFilterableField() {
        return contextFilterableField;
    }

    /**
     * Sets the value of the contextFilterableField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextFilterableField(String value) {
        this.contextFilterableField = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the hideOnError property.
     * 
     */
    public boolean isHideOnError() {
        return hideOnError;
    }

    /**
     * Sets the value of the hideOnError property.
     * 
     */
    public void setHideOnError(boolean value) {
        this.hideOnError = value;
    }

    /**
     * Gets the value of the includeContext property.
     * 
     */
    public boolean isIncludeContext() {
        return includeContext;
    }

    /**
     * Sets the value of the includeContext property.
     * 
     */
    public void setIncludeContext(boolean value) {
        this.includeContext = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     */
    public boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     */
    public void setShowTitle(boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChartSize }
     *     
     */
    public ReportChartSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChartSize }
     *     
     */
    public void setSize(ReportChartSize value) {
        this.size = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReportChartComponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ReportChartComponent that = ((ReportChartComponent) object);
        {
            boolean lhsCacheData;
            lhsCacheData = (true?this.isCacheData():false);
            boolean rhsCacheData;
            rhsCacheData = (true?that.isCacheData():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cacheData", lhsCacheData), LocatorUtils.property(thatLocator, "cacheData", rhsCacheData), lhsCacheData, rhsCacheData)) {
                return false;
            }
        }
        {
            String lhsContextFilterableField;
            lhsContextFilterableField = this.getContextFilterableField();
            String rhsContextFilterableField;
            rhsContextFilterableField = that.getContextFilterableField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextFilterableField", lhsContextFilterableField), LocatorUtils.property(thatLocator, "contextFilterableField", rhsContextFilterableField), lhsContextFilterableField, rhsContextFilterableField)) {
                return false;
            }
        }
        {
            String lhsError;
            lhsError = this.getError();
            String rhsError;
            rhsError = that.getError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
                return false;
            }
        }
        {
            boolean lhsHideOnError;
            lhsHideOnError = (true?this.isHideOnError():false);
            boolean rhsHideOnError;
            rhsHideOnError = (true?that.isHideOnError():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hideOnError", lhsHideOnError), LocatorUtils.property(thatLocator, "hideOnError", rhsHideOnError), lhsHideOnError, rhsHideOnError)) {
                return false;
            }
        }
        {
            boolean lhsIncludeContext;
            lhsIncludeContext = (true?this.isIncludeContext():false);
            boolean rhsIncludeContext;
            rhsIncludeContext = (true?that.isIncludeContext():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeContext", lhsIncludeContext), LocatorUtils.property(thatLocator, "includeContext", rhsIncludeContext), lhsIncludeContext, rhsIncludeContext)) {
                return false;
            }
        }
        {
            boolean lhsShowTitle;
            lhsShowTitle = (true?this.isShowTitle():false);
            boolean rhsShowTitle;
            rhsShowTitle = (true?that.isShowTitle():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showTitle", lhsShowTitle), LocatorUtils.property(thatLocator, "showTitle", rhsShowTitle), lhsShowTitle, rhsShowTitle)) {
                return false;
            }
        }
        {
            ReportChartSize lhsSize;
            lhsSize = this.getSize();
            ReportChartSize rhsSize;
            rhsSize = that.getSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theCacheData;
            theCacheData = (true?this.isCacheData():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cacheData", theCacheData), currentHashCode, theCacheData);
        }
        {
            String theContextFilterableField;
            theContextFilterableField = this.getContextFilterableField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextFilterableField", theContextFilterableField), currentHashCode, theContextFilterableField);
        }
        {
            String theError;
            theError = this.getError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            boolean theHideOnError;
            theHideOnError = (true?this.isHideOnError():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hideOnError", theHideOnError), currentHashCode, theHideOnError);
        }
        {
            boolean theIncludeContext;
            theIncludeContext = (true?this.isIncludeContext():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeContext", theIncludeContext), currentHashCode, theIncludeContext);
        }
        {
            boolean theShowTitle;
            theShowTitle = (true?this.isShowTitle():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showTitle", theShowTitle), currentHashCode, theShowTitle);
        }
        {
            ReportChartSize theSize;
            theSize = this.getSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize);
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
        super.appendFields(locator, buffer, strategy);
        {
            boolean theCacheData;
            theCacheData = (true?this.isCacheData():false);
            strategy.appendField(locator, this, "cacheData", buffer, theCacheData);
        }
        {
            String theContextFilterableField;
            theContextFilterableField = this.getContextFilterableField();
            strategy.appendField(locator, this, "contextFilterableField", buffer, theContextFilterableField);
        }
        {
            String theError;
            theError = this.getError();
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            boolean theHideOnError;
            theHideOnError = (true?this.isHideOnError():false);
            strategy.appendField(locator, this, "hideOnError", buffer, theHideOnError);
        }
        {
            boolean theIncludeContext;
            theIncludeContext = (true?this.isIncludeContext():false);
            strategy.appendField(locator, this, "includeContext", buffer, theIncludeContext);
        }
        {
            boolean theShowTitle;
            theShowTitle = (true?this.isShowTitle():false);
            strategy.appendField(locator, this, "showTitle", buffer, theShowTitle);
        }
        {
            ReportChartSize theSize;
            theSize = this.getSize();
            strategy.appendField(locator, this, "size", buffer, theSize);
        }
        return buffer;
    }

}
