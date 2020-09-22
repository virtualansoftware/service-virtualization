
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
 * <p>Java class for DescribeLayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="editableForNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="editableForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutComponents" type="{urn:partner.soap.sforce.com}DescribeLayoutComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="placeholder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutItem", propOrder = {
    "editableForNew",
    "editableForUpdate",
    "label",
    "layoutComponents",
    "placeholder",
    "required"
})
public class DescribeLayoutItem
    implements Equals, HashCode, ToString
{

    protected boolean editableForNew;
    protected boolean editableForUpdate;
    @XmlElement(required = true, nillable = true)
    protected String label;
    protected List<DescribeLayoutComponent> layoutComponents;
    protected boolean placeholder;
    protected boolean required;

    /**
     * Gets the value of the editableForNew property.
     * 
     */
    public boolean isEditableForNew() {
        return editableForNew;
    }

    /**
     * Sets the value of the editableForNew property.
     * 
     */
    public void setEditableForNew(boolean value) {
        this.editableForNew = value;
    }

    /**
     * Gets the value of the editableForUpdate property.
     * 
     */
    public boolean isEditableForUpdate() {
        return editableForUpdate;
    }

    /**
     * Sets the value of the editableForUpdate property.
     * 
     */
    public void setEditableForUpdate(boolean value) {
        this.editableForUpdate = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the layoutComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutComponent }
     * 
     * 
     */
    public List<DescribeLayoutComponent> getLayoutComponents() {
        if (layoutComponents == null) {
            layoutComponents = new ArrayList<DescribeLayoutComponent>();
        }
        return this.layoutComponents;
    }

    /**
     * Gets the value of the placeholder property.
     * 
     */
    public boolean isPlaceholder() {
        return placeholder;
    }

    /**
     * Sets the value of the placeholder property.
     * 
     */
    public void setPlaceholder(boolean value) {
        this.placeholder = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutItem that = ((DescribeLayoutItem) object);
        {
            boolean lhsEditableForNew;
            lhsEditableForNew = (true?this.isEditableForNew():false);
            boolean rhsEditableForNew;
            rhsEditableForNew = (true?that.isEditableForNew():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editableForNew", lhsEditableForNew), LocatorUtils.property(thatLocator, "editableForNew", rhsEditableForNew), lhsEditableForNew, rhsEditableForNew)) {
                return false;
            }
        }
        {
            boolean lhsEditableForUpdate;
            lhsEditableForUpdate = (true?this.isEditableForUpdate():false);
            boolean rhsEditableForUpdate;
            rhsEditableForUpdate = (true?that.isEditableForUpdate():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editableForUpdate", lhsEditableForUpdate), LocatorUtils.property(thatLocator, "editableForUpdate", rhsEditableForUpdate), lhsEditableForUpdate, rhsEditableForUpdate)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            List<DescribeLayoutComponent> lhsLayoutComponents;
            lhsLayoutComponents = (((this.layoutComponents!= null)&&(!this.layoutComponents.isEmpty()))?this.getLayoutComponents():null);
            List<DescribeLayoutComponent> rhsLayoutComponents;
            rhsLayoutComponents = (((that.layoutComponents!= null)&&(!that.layoutComponents.isEmpty()))?that.getLayoutComponents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutComponents", lhsLayoutComponents), LocatorUtils.property(thatLocator, "layoutComponents", rhsLayoutComponents), lhsLayoutComponents, rhsLayoutComponents)) {
                return false;
            }
        }
        {
            boolean lhsPlaceholder;
            lhsPlaceholder = (true?this.isPlaceholder():false);
            boolean rhsPlaceholder;
            rhsPlaceholder = (true?that.isPlaceholder():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "placeholder", lhsPlaceholder), LocatorUtils.property(thatLocator, "placeholder", rhsPlaceholder), lhsPlaceholder, rhsPlaceholder)) {
                return false;
            }
        }
        {
            boolean lhsRequired;
            lhsRequired = (true?this.isRequired():false);
            boolean rhsRequired;
            rhsRequired = (true?that.isRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "required", lhsRequired), LocatorUtils.property(thatLocator, "required", rhsRequired), lhsRequired, rhsRequired)) {
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
            boolean theEditableForNew;
            theEditableForNew = (true?this.isEditableForNew():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editableForNew", theEditableForNew), currentHashCode, theEditableForNew);
        }
        {
            boolean theEditableForUpdate;
            theEditableForUpdate = (true?this.isEditableForUpdate():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editableForUpdate", theEditableForUpdate), currentHashCode, theEditableForUpdate);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            List<DescribeLayoutComponent> theLayoutComponents;
            theLayoutComponents = (((this.layoutComponents!= null)&&(!this.layoutComponents.isEmpty()))?this.getLayoutComponents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutComponents", theLayoutComponents), currentHashCode, theLayoutComponents);
        }
        {
            boolean thePlaceholder;
            thePlaceholder = (true?this.isPlaceholder():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "placeholder", thePlaceholder), currentHashCode, thePlaceholder);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "required", theRequired), currentHashCode, theRequired);
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
            boolean theEditableForNew;
            theEditableForNew = (true?this.isEditableForNew():false);
            strategy.appendField(locator, this, "editableForNew", buffer, theEditableForNew);
        }
        {
            boolean theEditableForUpdate;
            theEditableForUpdate = (true?this.isEditableForUpdate():false);
            strategy.appendField(locator, this, "editableForUpdate", buffer, theEditableForUpdate);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            List<DescribeLayoutComponent> theLayoutComponents;
            theLayoutComponents = (((this.layoutComponents!= null)&&(!this.layoutComponents.isEmpty()))?this.getLayoutComponents():null);
            strategy.appendField(locator, this, "layoutComponents", buffer, theLayoutComponents);
        }
        {
            boolean thePlaceholder;
            thePlaceholder = (true?this.isPlaceholder():false);
            strategy.appendField(locator, this, "placeholder", buffer, thePlaceholder);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            strategy.appendField(locator, this, "required", buffer, theRequired);
        }
        return buffer;
    }

}
