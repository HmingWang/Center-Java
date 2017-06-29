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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GroupHeader1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroupHeader1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxTpCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact3NumericText"/>
 *         &lt;element name="CnsDt" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact8NumericText"/>
 *         &lt;element name="TxId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max8NumericText"/>
 *         &lt;element name="InstgPty" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max14Text"/>
 *         &lt;element name="Ccy" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Currencycode1"/>
 *         &lt;element name="Amt" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Max15NumericText"/>
 *         &lt;element name="TxCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}Exact5NumericText"/>
 *         &lt;element name="Areacd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AreaCode1"/>
 *         &lt;element name="AcctChckFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}AcctChckFlgCode1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader1", propOrder = {
    "txTpCd",
    "cnsDt",
    "txId",
    "instgPty",
    "ccy",
    "amt",
    "txCd",
    "areacd",
    "acctChckFlg"
})
public class GroupHeader1 {

    @XmlElement(name = "TxTpCd", required = true)
    protected String txTpCd;
    @XmlElement(name = "CnsDt", required = true)
    protected String cnsDt;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "InstgPty", required = true)
    protected String instgPty;
    @XmlElement(name = "Ccy", required = true)
    @XmlSchemaType(name = "string")
    protected Currencycode1 ccy;
    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "TxCd", required = true)
    protected String txCd;
    @XmlElement(name = "Areacd", required = true)
    protected String areacd;
    @XmlElement(name = "AcctChckFlg")
    protected String acctChckFlg;

    /**
     * 获取txTpCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTpCd() {
        return txTpCd;
    }

    /**
     * 设置txTpCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTpCd(String value) {
        this.txTpCd = value;
    }

    /**
     * 获取cnsDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnsDt() {
        return cnsDt;
    }

    /**
     * 设置cnsDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnsDt(String value) {
        this.cnsDt = value;
    }

    /**
     * 获取txId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * 设置txId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * 获取instgPty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPty() {
        return instgPty;
    }

    /**
     * 设置instgPty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgPty(String value) {
        this.instgPty = value;
    }

    /**
     * 获取ccy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Currencycode1 }
     *     
     */
    public Currencycode1 getCcy() {
        return ccy;
    }

    /**
     * 设置ccy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Currencycode1 }
     *     
     */
    public void setCcy(Currencycode1 value) {
        this.ccy = value;
    }

    /**
     * 获取amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * 设置amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * 获取txCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCd() {
        return txCd;
    }

    /**
     * 设置txCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCd(String value) {
        this.txCd = value;
    }

    /**
     * 获取areacd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreacd() {
        return areacd;
    }

    /**
     * 设置areacd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreacd(String value) {
        this.areacd = value;
    }

    /**
     * 获取acctChckFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctChckFlg() {
        return acctChckFlg;
    }

    /**
     * 设置acctChckFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctChckFlg(String value) {
        this.acctChckFlg = value;
    }

}
