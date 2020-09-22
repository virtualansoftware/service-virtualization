
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for KnowledgeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="knowledgeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="languages" type="{urn:partner.soap.sforce.com}KnowledgeLanguageItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeSettings", propOrder = {
    "defaultLanguage",
    "knowledgeEnabled",
    "languages"
})
public class KnowledgeSettings
    implements Equals, HashCode, ToString
{

    protected String defaultLanguage;
    protected boolean knowledgeEnabled;
    protected List<KnowledgeLanguageItem> languages;

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the knowledgeEnabled property.
     * 
     */
    public boolean isKnowledgeEnabled() {
        return knowledgeEnabled;
    }

    /**
     * Sets the value of the knowledgeEnabled property.
     * 
     */
    public void setKnowledgeEnabled(boolean value) {
        this.knowledgeEnabled = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnowledgeLanguageItem }
     * 
     * 
     */
    public List<KnowledgeLanguageItem> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<KnowledgeLanguageItem>();
        }
        return this.languages;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KnowledgeSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KnowledgeSettings that = ((KnowledgeSettings) object);
        {
            String lhsDefaultLanguage;
            lhsDefaultLanguage = this.getDefaultLanguage();
            String rhsDefaultLanguage;
            rhsDefaultLanguage = that.getDefaultLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultLanguage", lhsDefaultLanguage), LocatorUtils.property(thatLocator, "defaultLanguage", rhsDefaultLanguage), lhsDefaultLanguage, rhsDefaultLanguage)) {
                return false;
            }
        }
        {
            boolean lhsKnowledgeEnabled;
            lhsKnowledgeEnabled = (true?this.isKnowledgeEnabled():false);
            boolean rhsKnowledgeEnabled;
            rhsKnowledgeEnabled = (true?that.isKnowledgeEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knowledgeEnabled", lhsKnowledgeEnabled), LocatorUtils.property(thatLocator, "knowledgeEnabled", rhsKnowledgeEnabled), lhsKnowledgeEnabled, rhsKnowledgeEnabled)) {
                return false;
            }
        }
        {
            List<KnowledgeLanguageItem> lhsLanguages;
            lhsLanguages = (((this.languages!= null)&&(!this.languages.isEmpty()))?this.getLanguages():null);
            List<KnowledgeLanguageItem> rhsLanguages;
            rhsLanguages = (((that.languages!= null)&&(!that.languages.isEmpty()))?that.getLanguages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "languages", lhsLanguages), LocatorUtils.property(thatLocator, "languages", rhsLanguages), lhsLanguages, rhsLanguages)) {
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
            String theDefaultLanguage;
            theDefaultLanguage = this.getDefaultLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultLanguage", theDefaultLanguage), currentHashCode, theDefaultLanguage);
        }
        {
            boolean theKnowledgeEnabled;
            theKnowledgeEnabled = (true?this.isKnowledgeEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knowledgeEnabled", theKnowledgeEnabled), currentHashCode, theKnowledgeEnabled);
        }
        {
            List<KnowledgeLanguageItem> theLanguages;
            theLanguages = (((this.languages!= null)&&(!this.languages.isEmpty()))?this.getLanguages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "languages", theLanguages), currentHashCode, theLanguages);
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
            String theDefaultLanguage;
            theDefaultLanguage = this.getDefaultLanguage();
            strategy.appendField(locator, this, "defaultLanguage", buffer, theDefaultLanguage);
        }
        {
            boolean theKnowledgeEnabled;
            theKnowledgeEnabled = (true?this.isKnowledgeEnabled():false);
            strategy.appendField(locator, this, "knowledgeEnabled", buffer, theKnowledgeEnabled);
        }
        {
            List<KnowledgeLanguageItem> theLanguages;
            theLanguages = (((this.languages!= null)&&(!this.languages.isEmpty()))?this.getLanguages():null);
            strategy.appendField(locator, this, "languages", buffer, theLanguages);
        }
        return buffer;
    }

}
