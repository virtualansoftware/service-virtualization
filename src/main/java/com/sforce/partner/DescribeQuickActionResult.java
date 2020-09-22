
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DescribeQuickActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeQuickActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessLevelRequired" type="{urn:partner.soap.sforce.com}ShareAccessLevel"/&gt;
 *         &lt;element name="actionEnumOrId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="canvasApplicationId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="canvasApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contextSobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultValues" type="{urn:partner.soap.sforce.com}DescribeQuickActionDefaultValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flowDevName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowRecordIdVar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iconName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layout" type="{urn:partner.soap.sforce.com}DescribeLayoutSection"/&gt;
 *         &lt;element name="lightningComponentBundleId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="lightningComponentBundleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lightningComponentQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="miniIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileExtensionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="showQuickActionLcHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showQuickActionVfHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="targetParentField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetRecordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="targetSobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="visualforcePageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="visualforcePageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeQuickActionResult", propOrder = {
    "accessLevelRequired",
    "actionEnumOrId",
    "canvasApplicationId",
    "canvasApplicationName",
    "colors",
    "contextSobjectType",
    "defaultValues",
    "flowDevName",
    "flowRecordIdVar",
    "height",
    "iconName",
    "iconUrl",
    "icons",
    "label",
    "layout",
    "lightningComponentBundleId",
    "lightningComponentBundleName",
    "lightningComponentQualifiedName",
    "miniIconUrl",
    "mobileExtensionId",
    "name",
    "showQuickActionLcHeader",
    "showQuickActionVfHeader",
    "targetParentField",
    "targetRecordTypeId",
    "targetSobjectType",
    "type",
    "visualforcePageName",
    "visualforcePageUrl",
    "width"
})
public class DescribeQuickActionResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ShareAccessLevel accessLevelRequired;
    @XmlElement(required = true)
    protected String actionEnumOrId;
    @XmlElement(required = true, nillable = true)
    protected String canvasApplicationId;
    @XmlElement(required = true, nillable = true)
    protected String canvasApplicationName;
    protected List<DescribeColor> colors;
    @XmlElement(required = true, nillable = true)
    protected String contextSobjectType;
    @XmlElement(nillable = true)
    protected List<DescribeQuickActionDefaultValue> defaultValues;
    @XmlElement(required = true, nillable = true)
    protected String flowDevName;
    @XmlElement(required = true, nillable = true)
    protected String flowRecordIdVar;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, nillable = true)
    protected String iconName;
    @XmlElement(required = true, nillable = true)
    protected String iconUrl;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true, nillable = true)
    protected DescribeLayoutSection layout;
    @XmlElement(required = true, nillable = true)
    protected String lightningComponentBundleId;
    @XmlElement(required = true, nillable = true)
    protected String lightningComponentBundleName;
    @XmlElement(required = true, nillable = true)
    protected String lightningComponentQualifiedName;
    @XmlElement(required = true, nillable = true)
    protected String miniIconUrl;
    @XmlElement(required = true, nillable = true)
    protected String mobileExtensionId;
    @XmlElement(required = true)
    protected String name;
    protected boolean showQuickActionLcHeader;
    protected boolean showQuickActionVfHeader;
    @XmlElement(required = true, nillable = true)
    protected String targetParentField;
    @XmlElement(required = true, nillable = true)
    protected String targetRecordTypeId;
    @XmlElement(required = true, nillable = true)
    protected String targetSobjectType;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String visualforcePageName;
    @XmlElement(required = true, nillable = true)
    protected String visualforcePageUrl;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer width;

    /**
     * Gets the value of the accessLevelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevel }
     *     
     */
    public ShareAccessLevel getAccessLevelRequired() {
        return accessLevelRequired;
    }

    /**
     * Sets the value of the accessLevelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevel }
     *     
     */
    public void setAccessLevelRequired(ShareAccessLevel value) {
        this.accessLevelRequired = value;
    }

    /**
     * Gets the value of the actionEnumOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionEnumOrId() {
        return actionEnumOrId;
    }

    /**
     * Sets the value of the actionEnumOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionEnumOrId(String value) {
        this.actionEnumOrId = value;
    }

    /**
     * Gets the value of the canvasApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasApplicationId() {
        return canvasApplicationId;
    }

    /**
     * Sets the value of the canvasApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasApplicationId(String value) {
        this.canvasApplicationId = value;
    }

    /**
     * Gets the value of the canvasApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasApplicationName() {
        return canvasApplicationName;
    }

    /**
     * Sets the value of the canvasApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasApplicationName(String value) {
        this.canvasApplicationName = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColor }
     * 
     * 
     */
    public List<DescribeColor> getColors() {
        if (colors == null) {
            colors = new ArrayList<DescribeColor>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the contextSobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextSobjectType() {
        return contextSobjectType;
    }

    /**
     * Sets the value of the contextSobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextSobjectType(String value) {
        this.contextSobjectType = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeQuickActionDefaultValue }
     * 
     * 
     */
    public List<DescribeQuickActionDefaultValue> getDefaultValues() {
        if (defaultValues == null) {
            defaultValues = new ArrayList<DescribeQuickActionDefaultValue>();
        }
        return this.defaultValues;
    }

    /**
     * Gets the value of the flowDevName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowDevName() {
        return flowDevName;
    }

    /**
     * Sets the value of the flowDevName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowDevName(String value) {
        this.flowDevName = value;
    }

    /**
     * Gets the value of the flowRecordIdVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowRecordIdVar() {
        return flowRecordIdVar;
    }

    /**
     * Sets the value of the flowRecordIdVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowRecordIdVar(String value) {
        this.flowRecordIdVar = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the iconName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * Sets the value of the iconName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconName(String value) {
        this.iconName = value;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeIcon }
     * 
     * 
     */
    public List<DescribeIcon> getIcons() {
        if (icons == null) {
            icons = new ArrayList<DescribeIcon>();
        }
        return this.icons;
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
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public DescribeLayoutSection getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public void setLayout(DescribeLayoutSection value) {
        this.layout = value;
    }

    /**
     * Gets the value of the lightningComponentBundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightningComponentBundleId() {
        return lightningComponentBundleId;
    }

    /**
     * Sets the value of the lightningComponentBundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightningComponentBundleId(String value) {
        this.lightningComponentBundleId = value;
    }

    /**
     * Gets the value of the lightningComponentBundleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightningComponentBundleName() {
        return lightningComponentBundleName;
    }

    /**
     * Sets the value of the lightningComponentBundleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightningComponentBundleName(String value) {
        this.lightningComponentBundleName = value;
    }

    /**
     * Gets the value of the lightningComponentQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightningComponentQualifiedName() {
        return lightningComponentQualifiedName;
    }

    /**
     * Sets the value of the lightningComponentQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightningComponentQualifiedName(String value) {
        this.lightningComponentQualifiedName = value;
    }

    /**
     * Gets the value of the miniIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniIconUrl() {
        return miniIconUrl;
    }

    /**
     * Sets the value of the miniIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniIconUrl(String value) {
        this.miniIconUrl = value;
    }

    /**
     * Gets the value of the mobileExtensionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileExtensionId() {
        return mobileExtensionId;
    }

    /**
     * Sets the value of the mobileExtensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileExtensionId(String value) {
        this.mobileExtensionId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the showQuickActionLcHeader property.
     * 
     */
    public boolean isShowQuickActionLcHeader() {
        return showQuickActionLcHeader;
    }

    /**
     * Sets the value of the showQuickActionLcHeader property.
     * 
     */
    public void setShowQuickActionLcHeader(boolean value) {
        this.showQuickActionLcHeader = value;
    }

    /**
     * Gets the value of the showQuickActionVfHeader property.
     * 
     */
    public boolean isShowQuickActionVfHeader() {
        return showQuickActionVfHeader;
    }

    /**
     * Sets the value of the showQuickActionVfHeader property.
     * 
     */
    public void setShowQuickActionVfHeader(boolean value) {
        this.showQuickActionVfHeader = value;
    }

    /**
     * Gets the value of the targetParentField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetParentField() {
        return targetParentField;
    }

    /**
     * Sets the value of the targetParentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetParentField(String value) {
        this.targetParentField = value;
    }

    /**
     * Gets the value of the targetRecordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRecordTypeId() {
        return targetRecordTypeId;
    }

    /**
     * Sets the value of the targetRecordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRecordTypeId(String value) {
        this.targetRecordTypeId = value;
    }

    /**
     * Gets the value of the targetSobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSobjectType() {
        return targetSobjectType;
    }

    /**
     * Sets the value of the targetSobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSobjectType(String value) {
        this.targetSobjectType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the visualforcePageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualforcePageName() {
        return visualforcePageName;
    }

    /**
     * Sets the value of the visualforcePageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualforcePageName(String value) {
        this.visualforcePageName = value;
    }

    /**
     * Gets the value of the visualforcePageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualforcePageUrl() {
        return visualforcePageUrl;
    }

    /**
     * Sets the value of the visualforcePageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualforcePageUrl(String value) {
        this.visualforcePageUrl = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeQuickActionResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeQuickActionResult that = ((DescribeQuickActionResult) object);
        {
            ShareAccessLevel lhsAccessLevelRequired;
            lhsAccessLevelRequired = this.getAccessLevelRequired();
            ShareAccessLevel rhsAccessLevelRequired;
            rhsAccessLevelRequired = that.getAccessLevelRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessLevelRequired", lhsAccessLevelRequired), LocatorUtils.property(thatLocator, "accessLevelRequired", rhsAccessLevelRequired), lhsAccessLevelRequired, rhsAccessLevelRequired)) {
                return false;
            }
        }
        {
            String lhsActionEnumOrId;
            lhsActionEnumOrId = this.getActionEnumOrId();
            String rhsActionEnumOrId;
            rhsActionEnumOrId = that.getActionEnumOrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionEnumOrId", lhsActionEnumOrId), LocatorUtils.property(thatLocator, "actionEnumOrId", rhsActionEnumOrId), lhsActionEnumOrId, rhsActionEnumOrId)) {
                return false;
            }
        }
        {
            String lhsCanvasApplicationId;
            lhsCanvasApplicationId = this.getCanvasApplicationId();
            String rhsCanvasApplicationId;
            rhsCanvasApplicationId = that.getCanvasApplicationId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canvasApplicationId", lhsCanvasApplicationId), LocatorUtils.property(thatLocator, "canvasApplicationId", rhsCanvasApplicationId), lhsCanvasApplicationId, rhsCanvasApplicationId)) {
                return false;
            }
        }
        {
            String lhsCanvasApplicationName;
            lhsCanvasApplicationName = this.getCanvasApplicationName();
            String rhsCanvasApplicationName;
            rhsCanvasApplicationName = that.getCanvasApplicationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canvasApplicationName", lhsCanvasApplicationName), LocatorUtils.property(thatLocator, "canvasApplicationName", rhsCanvasApplicationName), lhsCanvasApplicationName, rhsCanvasApplicationName)) {
                return false;
            }
        }
        {
            List<DescribeColor> lhsColors;
            lhsColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            List<DescribeColor> rhsColors;
            rhsColors = (((that.colors!= null)&&(!that.colors.isEmpty()))?that.getColors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colors", lhsColors), LocatorUtils.property(thatLocator, "colors", rhsColors), lhsColors, rhsColors)) {
                return false;
            }
        }
        {
            String lhsContextSobjectType;
            lhsContextSobjectType = this.getContextSobjectType();
            String rhsContextSobjectType;
            rhsContextSobjectType = that.getContextSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextSobjectType", lhsContextSobjectType), LocatorUtils.property(thatLocator, "contextSobjectType", rhsContextSobjectType), lhsContextSobjectType, rhsContextSobjectType)) {
                return false;
            }
        }
        {
            List<DescribeQuickActionDefaultValue> lhsDefaultValues;
            lhsDefaultValues = (((this.defaultValues!= null)&&(!this.defaultValues.isEmpty()))?this.getDefaultValues():null);
            List<DescribeQuickActionDefaultValue> rhsDefaultValues;
            rhsDefaultValues = (((that.defaultValues!= null)&&(!that.defaultValues.isEmpty()))?that.getDefaultValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValues", lhsDefaultValues), LocatorUtils.property(thatLocator, "defaultValues", rhsDefaultValues), lhsDefaultValues, rhsDefaultValues)) {
                return false;
            }
        }
        {
            String lhsFlowDevName;
            lhsFlowDevName = this.getFlowDevName();
            String rhsFlowDevName;
            rhsFlowDevName = that.getFlowDevName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowDevName", lhsFlowDevName), LocatorUtils.property(thatLocator, "flowDevName", rhsFlowDevName), lhsFlowDevName, rhsFlowDevName)) {
                return false;
            }
        }
        {
            String lhsFlowRecordIdVar;
            lhsFlowRecordIdVar = this.getFlowRecordIdVar();
            String rhsFlowRecordIdVar;
            rhsFlowRecordIdVar = that.getFlowRecordIdVar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowRecordIdVar", lhsFlowRecordIdVar), LocatorUtils.property(thatLocator, "flowRecordIdVar", rhsFlowRecordIdVar), lhsFlowRecordIdVar, rhsFlowRecordIdVar)) {
                return false;
            }
        }
        {
            Integer lhsHeight;
            lhsHeight = this.getHeight();
            Integer rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight)) {
                return false;
            }
        }
        {
            String lhsIconName;
            lhsIconName = this.getIconName();
            String rhsIconName;
            rhsIconName = that.getIconName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iconName", lhsIconName), LocatorUtils.property(thatLocator, "iconName", rhsIconName), lhsIconName, rhsIconName)) {
                return false;
            }
        }
        {
            String lhsIconUrl;
            lhsIconUrl = this.getIconUrl();
            String rhsIconUrl;
            rhsIconUrl = that.getIconUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iconUrl", lhsIconUrl), LocatorUtils.property(thatLocator, "iconUrl", rhsIconUrl), lhsIconUrl, rhsIconUrl)) {
                return false;
            }
        }
        {
            List<DescribeIcon> lhsIcons;
            lhsIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            List<DescribeIcon> rhsIcons;
            rhsIcons = (((that.icons!= null)&&(!that.icons.isEmpty()))?that.getIcons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icons", lhsIcons), LocatorUtils.property(thatLocator, "icons", rhsIcons), lhsIcons, rhsIcons)) {
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
            DescribeLayoutSection lhsLayout;
            lhsLayout = this.getLayout();
            DescribeLayoutSection rhsLayout;
            rhsLayout = that.getLayout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLayout), LocatorUtils.property(thatLocator, "layout", rhsLayout), lhsLayout, rhsLayout)) {
                return false;
            }
        }
        {
            String lhsLightningComponentBundleId;
            lhsLightningComponentBundleId = this.getLightningComponentBundleId();
            String rhsLightningComponentBundleId;
            rhsLightningComponentBundleId = that.getLightningComponentBundleId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lightningComponentBundleId", lhsLightningComponentBundleId), LocatorUtils.property(thatLocator, "lightningComponentBundleId", rhsLightningComponentBundleId), lhsLightningComponentBundleId, rhsLightningComponentBundleId)) {
                return false;
            }
        }
        {
            String lhsLightningComponentBundleName;
            lhsLightningComponentBundleName = this.getLightningComponentBundleName();
            String rhsLightningComponentBundleName;
            rhsLightningComponentBundleName = that.getLightningComponentBundleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lightningComponentBundleName", lhsLightningComponentBundleName), LocatorUtils.property(thatLocator, "lightningComponentBundleName", rhsLightningComponentBundleName), lhsLightningComponentBundleName, rhsLightningComponentBundleName)) {
                return false;
            }
        }
        {
            String lhsLightningComponentQualifiedName;
            lhsLightningComponentQualifiedName = this.getLightningComponentQualifiedName();
            String rhsLightningComponentQualifiedName;
            rhsLightningComponentQualifiedName = that.getLightningComponentQualifiedName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lightningComponentQualifiedName", lhsLightningComponentQualifiedName), LocatorUtils.property(thatLocator, "lightningComponentQualifiedName", rhsLightningComponentQualifiedName), lhsLightningComponentQualifiedName, rhsLightningComponentQualifiedName)) {
                return false;
            }
        }
        {
            String lhsMiniIconUrl;
            lhsMiniIconUrl = this.getMiniIconUrl();
            String rhsMiniIconUrl;
            rhsMiniIconUrl = that.getMiniIconUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miniIconUrl", lhsMiniIconUrl), LocatorUtils.property(thatLocator, "miniIconUrl", rhsMiniIconUrl), lhsMiniIconUrl, rhsMiniIconUrl)) {
                return false;
            }
        }
        {
            String lhsMobileExtensionId;
            lhsMobileExtensionId = this.getMobileExtensionId();
            String rhsMobileExtensionId;
            rhsMobileExtensionId = that.getMobileExtensionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileExtensionId", lhsMobileExtensionId), LocatorUtils.property(thatLocator, "mobileExtensionId", rhsMobileExtensionId), lhsMobileExtensionId, rhsMobileExtensionId)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            boolean lhsShowQuickActionLcHeader;
            lhsShowQuickActionLcHeader = (true?this.isShowQuickActionLcHeader():false);
            boolean rhsShowQuickActionLcHeader;
            rhsShowQuickActionLcHeader = (true?that.isShowQuickActionLcHeader():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showQuickActionLcHeader", lhsShowQuickActionLcHeader), LocatorUtils.property(thatLocator, "showQuickActionLcHeader", rhsShowQuickActionLcHeader), lhsShowQuickActionLcHeader, rhsShowQuickActionLcHeader)) {
                return false;
            }
        }
        {
            boolean lhsShowQuickActionVfHeader;
            lhsShowQuickActionVfHeader = (true?this.isShowQuickActionVfHeader():false);
            boolean rhsShowQuickActionVfHeader;
            rhsShowQuickActionVfHeader = (true?that.isShowQuickActionVfHeader():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showQuickActionVfHeader", lhsShowQuickActionVfHeader), LocatorUtils.property(thatLocator, "showQuickActionVfHeader", rhsShowQuickActionVfHeader), lhsShowQuickActionVfHeader, rhsShowQuickActionVfHeader)) {
                return false;
            }
        }
        {
            String lhsTargetParentField;
            lhsTargetParentField = this.getTargetParentField();
            String rhsTargetParentField;
            rhsTargetParentField = that.getTargetParentField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetParentField", lhsTargetParentField), LocatorUtils.property(thatLocator, "targetParentField", rhsTargetParentField), lhsTargetParentField, rhsTargetParentField)) {
                return false;
            }
        }
        {
            String lhsTargetRecordTypeId;
            lhsTargetRecordTypeId = this.getTargetRecordTypeId();
            String rhsTargetRecordTypeId;
            rhsTargetRecordTypeId = that.getTargetRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetRecordTypeId", lhsTargetRecordTypeId), LocatorUtils.property(thatLocator, "targetRecordTypeId", rhsTargetRecordTypeId), lhsTargetRecordTypeId, rhsTargetRecordTypeId)) {
                return false;
            }
        }
        {
            String lhsTargetSobjectType;
            lhsTargetSobjectType = this.getTargetSobjectType();
            String rhsTargetSobjectType;
            rhsTargetSobjectType = that.getTargetSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetSobjectType", lhsTargetSobjectType), LocatorUtils.property(thatLocator, "targetSobjectType", rhsTargetSobjectType), lhsTargetSobjectType, rhsTargetSobjectType)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsVisualforcePageName;
            lhsVisualforcePageName = this.getVisualforcePageName();
            String rhsVisualforcePageName;
            rhsVisualforcePageName = that.getVisualforcePageName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "visualforcePageName", lhsVisualforcePageName), LocatorUtils.property(thatLocator, "visualforcePageName", rhsVisualforcePageName), lhsVisualforcePageName, rhsVisualforcePageName)) {
                return false;
            }
        }
        {
            String lhsVisualforcePageUrl;
            lhsVisualforcePageUrl = this.getVisualforcePageUrl();
            String rhsVisualforcePageUrl;
            rhsVisualforcePageUrl = that.getVisualforcePageUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "visualforcePageUrl", lhsVisualforcePageUrl), LocatorUtils.property(thatLocator, "visualforcePageUrl", rhsVisualforcePageUrl), lhsVisualforcePageUrl, rhsVisualforcePageUrl)) {
                return false;
            }
        }
        {
            Integer lhsWidth;
            lhsWidth = this.getWidth();
            Integer rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
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
            ShareAccessLevel theAccessLevelRequired;
            theAccessLevelRequired = this.getAccessLevelRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessLevelRequired", theAccessLevelRequired), currentHashCode, theAccessLevelRequired);
        }
        {
            String theActionEnumOrId;
            theActionEnumOrId = this.getActionEnumOrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionEnumOrId", theActionEnumOrId), currentHashCode, theActionEnumOrId);
        }
        {
            String theCanvasApplicationId;
            theCanvasApplicationId = this.getCanvasApplicationId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canvasApplicationId", theCanvasApplicationId), currentHashCode, theCanvasApplicationId);
        }
        {
            String theCanvasApplicationName;
            theCanvasApplicationName = this.getCanvasApplicationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canvasApplicationName", theCanvasApplicationName), currentHashCode, theCanvasApplicationName);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colors", theColors), currentHashCode, theColors);
        }
        {
            String theContextSobjectType;
            theContextSobjectType = this.getContextSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextSobjectType", theContextSobjectType), currentHashCode, theContextSobjectType);
        }
        {
            List<DescribeQuickActionDefaultValue> theDefaultValues;
            theDefaultValues = (((this.defaultValues!= null)&&(!this.defaultValues.isEmpty()))?this.getDefaultValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValues", theDefaultValues), currentHashCode, theDefaultValues);
        }
        {
            String theFlowDevName;
            theFlowDevName = this.getFlowDevName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowDevName", theFlowDevName), currentHashCode, theFlowDevName);
        }
        {
            String theFlowRecordIdVar;
            theFlowRecordIdVar = this.getFlowRecordIdVar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowRecordIdVar", theFlowRecordIdVar), currentHashCode, theFlowRecordIdVar);
        }
        {
            Integer theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight);
        }
        {
            String theIconName;
            theIconName = this.getIconName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iconName", theIconName), currentHashCode, theIconName);
        }
        {
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iconUrl", theIconUrl), currentHashCode, theIconUrl);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icons", theIcons), currentHashCode, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            DescribeLayoutSection theLayout;
            theLayout = this.getLayout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layout", theLayout), currentHashCode, theLayout);
        }
        {
            String theLightningComponentBundleId;
            theLightningComponentBundleId = this.getLightningComponentBundleId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lightningComponentBundleId", theLightningComponentBundleId), currentHashCode, theLightningComponentBundleId);
        }
        {
            String theLightningComponentBundleName;
            theLightningComponentBundleName = this.getLightningComponentBundleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lightningComponentBundleName", theLightningComponentBundleName), currentHashCode, theLightningComponentBundleName);
        }
        {
            String theLightningComponentQualifiedName;
            theLightningComponentQualifiedName = this.getLightningComponentQualifiedName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lightningComponentQualifiedName", theLightningComponentQualifiedName), currentHashCode, theLightningComponentQualifiedName);
        }
        {
            String theMiniIconUrl;
            theMiniIconUrl = this.getMiniIconUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "miniIconUrl", theMiniIconUrl), currentHashCode, theMiniIconUrl);
        }
        {
            String theMobileExtensionId;
            theMobileExtensionId = this.getMobileExtensionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileExtensionId", theMobileExtensionId), currentHashCode, theMobileExtensionId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theShowQuickActionLcHeader;
            theShowQuickActionLcHeader = (true?this.isShowQuickActionLcHeader():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showQuickActionLcHeader", theShowQuickActionLcHeader), currentHashCode, theShowQuickActionLcHeader);
        }
        {
            boolean theShowQuickActionVfHeader;
            theShowQuickActionVfHeader = (true?this.isShowQuickActionVfHeader():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showQuickActionVfHeader", theShowQuickActionVfHeader), currentHashCode, theShowQuickActionVfHeader);
        }
        {
            String theTargetParentField;
            theTargetParentField = this.getTargetParentField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetParentField", theTargetParentField), currentHashCode, theTargetParentField);
        }
        {
            String theTargetRecordTypeId;
            theTargetRecordTypeId = this.getTargetRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetRecordTypeId", theTargetRecordTypeId), currentHashCode, theTargetRecordTypeId);
        }
        {
            String theTargetSobjectType;
            theTargetSobjectType = this.getTargetSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetSobjectType", theTargetSobjectType), currentHashCode, theTargetSobjectType);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theVisualforcePageName;
            theVisualforcePageName = this.getVisualforcePageName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "visualforcePageName", theVisualforcePageName), currentHashCode, theVisualforcePageName);
        }
        {
            String theVisualforcePageUrl;
            theVisualforcePageUrl = this.getVisualforcePageUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "visualforcePageUrl", theVisualforcePageUrl), currentHashCode, theVisualforcePageUrl);
        }
        {
            Integer theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
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
            ShareAccessLevel theAccessLevelRequired;
            theAccessLevelRequired = this.getAccessLevelRequired();
            strategy.appendField(locator, this, "accessLevelRequired", buffer, theAccessLevelRequired);
        }
        {
            String theActionEnumOrId;
            theActionEnumOrId = this.getActionEnumOrId();
            strategy.appendField(locator, this, "actionEnumOrId", buffer, theActionEnumOrId);
        }
        {
            String theCanvasApplicationId;
            theCanvasApplicationId = this.getCanvasApplicationId();
            strategy.appendField(locator, this, "canvasApplicationId", buffer, theCanvasApplicationId);
        }
        {
            String theCanvasApplicationName;
            theCanvasApplicationName = this.getCanvasApplicationName();
            strategy.appendField(locator, this, "canvasApplicationName", buffer, theCanvasApplicationName);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            strategy.appendField(locator, this, "colors", buffer, theColors);
        }
        {
            String theContextSobjectType;
            theContextSobjectType = this.getContextSobjectType();
            strategy.appendField(locator, this, "contextSobjectType", buffer, theContextSobjectType);
        }
        {
            List<DescribeQuickActionDefaultValue> theDefaultValues;
            theDefaultValues = (((this.defaultValues!= null)&&(!this.defaultValues.isEmpty()))?this.getDefaultValues():null);
            strategy.appendField(locator, this, "defaultValues", buffer, theDefaultValues);
        }
        {
            String theFlowDevName;
            theFlowDevName = this.getFlowDevName();
            strategy.appendField(locator, this, "flowDevName", buffer, theFlowDevName);
        }
        {
            String theFlowRecordIdVar;
            theFlowRecordIdVar = this.getFlowRecordIdVar();
            strategy.appendField(locator, this, "flowRecordIdVar", buffer, theFlowRecordIdVar);
        }
        {
            Integer theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight);
        }
        {
            String theIconName;
            theIconName = this.getIconName();
            strategy.appendField(locator, this, "iconName", buffer, theIconName);
        }
        {
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            strategy.appendField(locator, this, "iconUrl", buffer, theIconUrl);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            strategy.appendField(locator, this, "icons", buffer, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            DescribeLayoutSection theLayout;
            theLayout = this.getLayout();
            strategy.appendField(locator, this, "layout", buffer, theLayout);
        }
        {
            String theLightningComponentBundleId;
            theLightningComponentBundleId = this.getLightningComponentBundleId();
            strategy.appendField(locator, this, "lightningComponentBundleId", buffer, theLightningComponentBundleId);
        }
        {
            String theLightningComponentBundleName;
            theLightningComponentBundleName = this.getLightningComponentBundleName();
            strategy.appendField(locator, this, "lightningComponentBundleName", buffer, theLightningComponentBundleName);
        }
        {
            String theLightningComponentQualifiedName;
            theLightningComponentQualifiedName = this.getLightningComponentQualifiedName();
            strategy.appendField(locator, this, "lightningComponentQualifiedName", buffer, theLightningComponentQualifiedName);
        }
        {
            String theMiniIconUrl;
            theMiniIconUrl = this.getMiniIconUrl();
            strategy.appendField(locator, this, "miniIconUrl", buffer, theMiniIconUrl);
        }
        {
            String theMobileExtensionId;
            theMobileExtensionId = this.getMobileExtensionId();
            strategy.appendField(locator, this, "mobileExtensionId", buffer, theMobileExtensionId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theShowQuickActionLcHeader;
            theShowQuickActionLcHeader = (true?this.isShowQuickActionLcHeader():false);
            strategy.appendField(locator, this, "showQuickActionLcHeader", buffer, theShowQuickActionLcHeader);
        }
        {
            boolean theShowQuickActionVfHeader;
            theShowQuickActionVfHeader = (true?this.isShowQuickActionVfHeader():false);
            strategy.appendField(locator, this, "showQuickActionVfHeader", buffer, theShowQuickActionVfHeader);
        }
        {
            String theTargetParentField;
            theTargetParentField = this.getTargetParentField();
            strategy.appendField(locator, this, "targetParentField", buffer, theTargetParentField);
        }
        {
            String theTargetRecordTypeId;
            theTargetRecordTypeId = this.getTargetRecordTypeId();
            strategy.appendField(locator, this, "targetRecordTypeId", buffer, theTargetRecordTypeId);
        }
        {
            String theTargetSobjectType;
            theTargetSobjectType = this.getTargetSobjectType();
            strategy.appendField(locator, this, "targetSobjectType", buffer, theTargetSobjectType);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theVisualforcePageName;
            theVisualforcePageName = this.getVisualforcePageName();
            strategy.appendField(locator, this, "visualforcePageName", buffer, theVisualforcePageName);
        }
        {
            String theVisualforcePageUrl;
            theVisualforcePageUrl = this.getVisualforcePageUrl();
            strategy.appendField(locator, this, "visualforcePageUrl", buffer, theVisualforcePageUrl);
        }
        {
            Integer theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth);
        }
        return buffer;
    }

}
