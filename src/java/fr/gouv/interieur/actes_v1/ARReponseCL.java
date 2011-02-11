//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.01 at 02:04:49 AM CET 
//


package fr.gouv.interieur.actes_v1;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * Donn�es d'un AR d'une r�ponse d'une collectivit� au courrier d'une pr�fecture (envoi ou refus d'envoyer des pi�ces compl�mentaires, r�ponse ou rejet pour une lettre d'observations)
 * 
 * <p>Java class for ARReponseCL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARReponseCL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfosCourrierPref" type="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}DonneesCourrierPref"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateReception" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARReponseCL", propOrder = {
    "infosCourrierPref"
})
public class ARReponseCL {

    @XmlElement(name = "InfosCourrierPref", required = true)
    protected DonneesCourrierPref infosCourrierPref;
    @XmlAttribute(name = "DateReception", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar dateReception;

    /**
     * Gets the value of the infosCourrierPref property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesCourrierPref }
     *     
     */
    public DonneesCourrierPref getInfosCourrierPref() {
        return infosCourrierPref;
    }

    /**
     * Sets the value of the infosCourrierPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesCourrierPref }
     *     
     */
    public void setInfosCourrierPref(DonneesCourrierPref value) {
        this.infosCourrierPref = value;
    }

    /**
     * Gets the value of the dateReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateReception() {
        return dateReception;
    }

    /**
     * Sets the value of the dateReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReception(Calendar value) {
        this.dateReception = value;
    }

}