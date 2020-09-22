
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Nominative"/&gt;
 *     &lt;enumeration value="Accusative"/&gt;
 *     &lt;enumeration value="Genitive"/&gt;
 *     &lt;enumeration value="Dative"/&gt;
 *     &lt;enumeration value="Inessive"/&gt;
 *     &lt;enumeration value="Elative"/&gt;
 *     &lt;enumeration value="Illative"/&gt;
 *     &lt;enumeration value="Adessive"/&gt;
 *     &lt;enumeration value="Ablative"/&gt;
 *     &lt;enumeration value="Allative"/&gt;
 *     &lt;enumeration value="Essive"/&gt;
 *     &lt;enumeration value="Translative"/&gt;
 *     &lt;enumeration value="Partitive"/&gt;
 *     &lt;enumeration value="Objective"/&gt;
 *     &lt;enumeration value="Subjective"/&gt;
 *     &lt;enumeration value="Instrumental"/&gt;
 *     &lt;enumeration value="Prepositional"/&gt;
 *     &lt;enumeration value="Locative"/&gt;
 *     &lt;enumeration value="Vocative"/&gt;
 *     &lt;enumeration value="Sublative"/&gt;
 *     &lt;enumeration value="Superessive"/&gt;
 *     &lt;enumeration value="Delative"/&gt;
 *     &lt;enumeration value="Causalfinal"/&gt;
 *     &lt;enumeration value="Essiveformal"/&gt;
 *     &lt;enumeration value="Termanative"/&gt;
 *     &lt;enumeration value="Distributive"/&gt;
 *     &lt;enumeration value="Ergative"/&gt;
 *     &lt;enumeration value="Adverbial"/&gt;
 *     &lt;enumeration value="Abessive"/&gt;
 *     &lt;enumeration value="Comitative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseType")
@XmlEnum
public enum CaseType {

    @XmlEnumValue("Nominative")
    NOMINATIVE("Nominative"),
    @XmlEnumValue("Accusative")
    ACCUSATIVE("Accusative"),
    @XmlEnumValue("Genitive")
    GENITIVE("Genitive"),
    @XmlEnumValue("Dative")
    DATIVE("Dative"),
    @XmlEnumValue("Inessive")
    INESSIVE("Inessive"),
    @XmlEnumValue("Elative")
    ELATIVE("Elative"),
    @XmlEnumValue("Illative")
    ILLATIVE("Illative"),
    @XmlEnumValue("Adessive")
    ADESSIVE("Adessive"),
    @XmlEnumValue("Ablative")
    ABLATIVE("Ablative"),
    @XmlEnumValue("Allative")
    ALLATIVE("Allative"),
    @XmlEnumValue("Essive")
    ESSIVE("Essive"),
    @XmlEnumValue("Translative")
    TRANSLATIVE("Translative"),
    @XmlEnumValue("Partitive")
    PARTITIVE("Partitive"),
    @XmlEnumValue("Objective")
    OBJECTIVE("Objective"),
    @XmlEnumValue("Subjective")
    SUBJECTIVE("Subjective"),
    @XmlEnumValue("Instrumental")
    INSTRUMENTAL("Instrumental"),
    @XmlEnumValue("Prepositional")
    PREPOSITIONAL("Prepositional"),
    @XmlEnumValue("Locative")
    LOCATIVE("Locative"),
    @XmlEnumValue("Vocative")
    VOCATIVE("Vocative"),
    @XmlEnumValue("Sublative")
    SUBLATIVE("Sublative"),
    @XmlEnumValue("Superessive")
    SUPERESSIVE("Superessive"),
    @XmlEnumValue("Delative")
    DELATIVE("Delative"),
    @XmlEnumValue("Causalfinal")
    CAUSALFINAL("Causalfinal"),
    @XmlEnumValue("Essiveformal")
    ESSIVEFORMAL("Essiveformal"),
    @XmlEnumValue("Termanative")
    TERMANATIVE("Termanative"),
    @XmlEnumValue("Distributive")
    DISTRIBUTIVE("Distributive"),
    @XmlEnumValue("Ergative")
    ERGATIVE("Ergative"),
    @XmlEnumValue("Adverbial")
    ADVERBIAL("Adverbial"),
    @XmlEnumValue("Abessive")
    ABESSIVE("Abessive"),
    @XmlEnumValue("Comitative")
    COMITATIVE("Comitative");
    private final String value;

    CaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseType fromValue(String v) {
        for (CaseType c: CaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
