//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.05.11 à 02:53:46 PM CEST 
//


package org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-EBIRTH-CHILDPOSITIONvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-EBIRTH-CHILDPOSITIONvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="head-down"/>
 *     &lt;enumeration value="other-head"/>
 *     &lt;enumeration value="breech"/>
 *     &lt;enumeration value="transverse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-EBIRTH-CHILDPOSITIONvalues")
@XmlEnum
public enum CDEBIRTHCHILDPOSITIONvalues {

    @XmlEnumValue("head-down")
    HEAD_DOWN("head-down"),
    @XmlEnumValue("other-head")
    OTHER_HEAD("other-head"),
    @XmlEnumValue("breech")
    BREECH("breech"),
    @XmlEnumValue("transverse")
    TRANSVERSE("transverse");
    private final String value;

    CDEBIRTHCHILDPOSITIONvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDEBIRTHCHILDPOSITIONvalues fromValue(String v) {
        for (CDEBIRTHCHILDPOSITIONvalues c: CDEBIRTHCHILDPOSITIONvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
