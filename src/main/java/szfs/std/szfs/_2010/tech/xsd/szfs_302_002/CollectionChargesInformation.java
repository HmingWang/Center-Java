//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.29 时间 11:06:28 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CollectionChargesInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CollectionChargesInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorprtnId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="DbtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="CdtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="Dbtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Debtor1"/>
 *         &lt;element name="Cdtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Creditor1"/>
 *         &lt;element name="PmtItmCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max5Text"/>
 *         &lt;element name="ChanlId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact4Text" minOccurs="0"/>
 *         &lt;element name="Rmk" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max127Text" minOccurs="0"/>
 *         &lt;element name="AltCdtrFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AltCdtrFlgcode1" minOccurs="0"/>
 *         &lt;element name="AltCdtrNm" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="ProCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact5Text" minOccurs="0"/>
 *         &lt;element name="AddtlLen" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max8NumericText"/>
 *         &lt;element name="AddtlInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AdditionalInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionChargesInformation", propOrder = {
    "corprtnId",
    "dbtrId",
    "cdtrId",
    "dbtr",
    "cdtr",
    "pmtItmCd",
    "chanlId",
    "rmk",
    "altCdtrFlg",
    "altCdtrNm",
    "proCd",
    "addtlLen",
    "addtlInf"
})
public class CollectionChargesInformation {

    @XmlElement(name = "CorprtnId", required = true)
    protected String corprtnId;
    @XmlElement(name = "DbtrId", required = true)
    protected String dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected String cdtrId;
    @XmlElement(name = "Dbtr", required = true)
    protected Debtor1 dbtr;
    @XmlElement(name = "Cdtr", required = true)
    protected Creditor1 cdtr;
    @XmlElement(name = "PmtItmCd", required = true)
    protected String pmtItmCd;
    @XmlElement(name = "ChanlId")
    protected String chanlId;
    @XmlElement(name = "Rmk")
    protected String rmk;
    @XmlElement(name = "AltCdtrFlg")
    protected String altCdtrFlg;
    @XmlElement(name = "AltCdtrNm")
    protected String altCdtrNm;
    @XmlElement(name = "ProCd")
    protected String proCd;
    @XmlElement(name = "AddtlLen", required = true)
    protected String addtlLen;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation1 addtlInf;

    /**
     * 获取corprtnId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorprtnId() {
        return corprtnId;
    }

    /**
     * 设置corprtnId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorprtnId(String value) {
        this.corprtnId = value;
    }

    /**
     * 获取dbtrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrId() {
        return dbtrId;
    }

    /**
     * 设置dbtrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrId(String value) {
        this.dbtrId = value;
    }

    /**
     * 获取cdtrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrId() {
        return cdtrId;
    }

    /**
     * 设置cdtrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrId(String value) {
        this.cdtrId = value;
    }

    /**
     * 获取dbtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Debtor1 }
     *     
     */
    public Debtor1 getDbtr() {
        return dbtr;
    }

    /**
     * 设置dbtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor1 }
     *     
     */
    public void setDbtr(Debtor1 value) {
        this.dbtr = value;
    }

    /**
     * 获取cdtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Creditor1 }
     *     
     */
    public Creditor1 getCdtr() {
        return cdtr;
    }

    /**
     * 设置cdtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor1 }
     *     
     */
    public void setCdtr(Creditor1 value) {
        this.cdtr = value;
    }

    /**
     * 获取pmtItmCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtItmCd() {
        return pmtItmCd;
    }

    /**
     * 设置pmtItmCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtItmCd(String value) {
        this.pmtItmCd = value;
    }

    /**
     * 获取chanlId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanlId() {
        return chanlId;
    }

    /**
     * 设置chanlId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanlId(String value) {
        this.chanlId = value;
    }

    /**
     * 获取rmk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * 设置rmk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmk(String value) {
        this.rmk = value;
    }

    /**
     * 获取altCdtrFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCdtrFlg() {
        return altCdtrFlg;
    }

    /**
     * 设置altCdtrFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCdtrFlg(String value) {
        this.altCdtrFlg = value;
    }

    /**
     * 获取altCdtrNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCdtrNm() {
        return altCdtrNm;
    }

    /**
     * 设置altCdtrNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCdtrNm(String value) {
        this.altCdtrNm = value;
    }

    /**
     * 获取proCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCd() {
        return proCd;
    }

    /**
     * 设置proCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCd(String value) {
        this.proCd = value;
    }

    /**
     * 获取addtlLen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlLen() {
        return addtlLen;
    }

    /**
     * 设置addtlLen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlLen(String value) {
        this.addtlLen = value;
    }

    /**
     * 获取addtlInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation1 }
     *     
     */
    public AdditionalInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * 设置addtlInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation1 }
     *     
     */
    public void setAddtlInf(AdditionalInformation1 value) {
        this.addtlInf = value;
    }

}
