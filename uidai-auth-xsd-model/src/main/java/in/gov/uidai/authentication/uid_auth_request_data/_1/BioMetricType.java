//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.19 at 12:21:34 PM GMT 
//


package in.gov.uidai.authentication.uid_auth_request_data._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bioMetricType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bioMetricType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FMR"/&gt;
 *     &lt;enumeration value="FIR"/&gt;
 *     &lt;enumeration value="IIR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "bioMetricType")
@XmlEnum
public enum BioMetricType {


    /**
     * Finger Minutiae
     *                          
     * 
     */
    FMR,

    /**
     * Finger Image
     *                          
     * 
     */
    FIR,

    /**
     * Iris Image
     *                          
     * 
     */
    IIR;

    public String value() {
        return name();
    }

    public static BioMetricType fromValue(String v) {
        return valueOf(v);
    }

}
