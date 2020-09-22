
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
 * <p>Java class for SearchResultsMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultsMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityLabelMetadata" type="{urn:partner.soap.sforce.com}LabelsSearchMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityMetadata" type="{urn:partner.soap.sforce.com}EntitySearchMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultsMetadata", propOrder = {
    "entityLabelMetadatas",
    "entityMetadatas"
})
public class SearchResultsMetadata
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "entityLabelMetadata")
    protected List<LabelsSearchMetadata> entityLabelMetadatas;
    @XmlElement(name = "entityMetadata")
    protected List<EntitySearchMetadata> entityMetadatas;

    /**
     * Gets the value of the entityLabelMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityLabelMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityLabelMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelsSearchMetadata }
     * 
     * 
     */
    public List<LabelsSearchMetadata> getEntityLabelMetadatas() {
        if (entityLabelMetadatas == null) {
            entityLabelMetadatas = new ArrayList<LabelsSearchMetadata>();
        }
        return this.entityLabelMetadatas;
    }

    /**
     * Gets the value of the entityMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitySearchMetadata }
     * 
     * 
     */
    public List<EntitySearchMetadata> getEntityMetadatas() {
        if (entityMetadatas == null) {
            entityMetadatas = new ArrayList<EntitySearchMetadata>();
        }
        return this.entityMetadatas;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchResultsMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchResultsMetadata that = ((SearchResultsMetadata) object);
        {
            List<LabelsSearchMetadata> lhsEntityLabelMetadatas;
            lhsEntityLabelMetadatas = (((this.entityLabelMetadatas!= null)&&(!this.entityLabelMetadatas.isEmpty()))?this.getEntityLabelMetadatas():null);
            List<LabelsSearchMetadata> rhsEntityLabelMetadatas;
            rhsEntityLabelMetadatas = (((that.entityLabelMetadatas!= null)&&(!that.entityLabelMetadatas.isEmpty()))?that.getEntityLabelMetadatas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityLabelMetadatas", lhsEntityLabelMetadatas), LocatorUtils.property(thatLocator, "entityLabelMetadatas", rhsEntityLabelMetadatas), lhsEntityLabelMetadatas, rhsEntityLabelMetadatas)) {
                return false;
            }
        }
        {
            List<EntitySearchMetadata> lhsEntityMetadatas;
            lhsEntityMetadatas = (((this.entityMetadatas!= null)&&(!this.entityMetadatas.isEmpty()))?this.getEntityMetadatas():null);
            List<EntitySearchMetadata> rhsEntityMetadatas;
            rhsEntityMetadatas = (((that.entityMetadatas!= null)&&(!that.entityMetadatas.isEmpty()))?that.getEntityMetadatas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityMetadatas", lhsEntityMetadatas), LocatorUtils.property(thatLocator, "entityMetadatas", rhsEntityMetadatas), lhsEntityMetadatas, rhsEntityMetadatas)) {
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
            List<LabelsSearchMetadata> theEntityLabelMetadatas;
            theEntityLabelMetadatas = (((this.entityLabelMetadatas!= null)&&(!this.entityLabelMetadatas.isEmpty()))?this.getEntityLabelMetadatas():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityLabelMetadatas", theEntityLabelMetadatas), currentHashCode, theEntityLabelMetadatas);
        }
        {
            List<EntitySearchMetadata> theEntityMetadatas;
            theEntityMetadatas = (((this.entityMetadatas!= null)&&(!this.entityMetadatas.isEmpty()))?this.getEntityMetadatas():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityMetadatas", theEntityMetadatas), currentHashCode, theEntityMetadatas);
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
            List<LabelsSearchMetadata> theEntityLabelMetadatas;
            theEntityLabelMetadatas = (((this.entityLabelMetadatas!= null)&&(!this.entityLabelMetadatas.isEmpty()))?this.getEntityLabelMetadatas():null);
            strategy.appendField(locator, this, "entityLabelMetadatas", buffer, theEntityLabelMetadatas);
        }
        {
            List<EntitySearchMetadata> theEntityMetadatas;
            theEntityMetadatas = (((this.entityMetadatas!= null)&&(!this.entityMetadatas.isEmpty()))?this.getEntityMetadatas():null);
            strategy.appendField(locator, this, "entityMetadatas", buffer, theEntityMetadatas);
        }
        return buffer;
    }

}
