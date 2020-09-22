
package com.sforce.apex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageVersions" type="{http://soap.sforce.com/2006/08/apex}PackageVersion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageVersions"
})
@XmlRootElement(name = "PackageVersionHeader")
public class PackageVersionHeader
    implements Equals, HashCode, ToString
{

    protected List<PackageVersion> packageVersions;

    /**
     * Gets the value of the packageVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageVersion }
     * 
     * 
     */
    public List<PackageVersion> getPackageVersions() {
        if (packageVersions == null) {
            packageVersions = new ArrayList<PackageVersion>();
        }
        return this.packageVersions;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PackageVersionHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PackageVersionHeader that = ((PackageVersionHeader) object);
        {
            List<PackageVersion> lhsPackageVersions;
            lhsPackageVersions = (((this.packageVersions!= null)&&(!this.packageVersions.isEmpty()))?this.getPackageVersions():null);
            List<PackageVersion> rhsPackageVersions;
            rhsPackageVersions = (((that.packageVersions!= null)&&(!that.packageVersions.isEmpty()))?that.getPackageVersions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageVersions", lhsPackageVersions), LocatorUtils.property(thatLocator, "packageVersions", rhsPackageVersions), lhsPackageVersions, rhsPackageVersions)) {
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
            List<PackageVersion> thePackageVersions;
            thePackageVersions = (((this.packageVersions!= null)&&(!this.packageVersions.isEmpty()))?this.getPackageVersions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageVersions", thePackageVersions), currentHashCode, thePackageVersions);
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
            List<PackageVersion> thePackageVersions;
            thePackageVersions = (((this.packageVersions!= null)&&(!this.packageVersions.isEmpty()))?this.getPackageVersions():null);
            strategy.appendField(locator, this, "packageVersions", buffer, thePackageVersions);
        }
        return buffer;
    }

}
