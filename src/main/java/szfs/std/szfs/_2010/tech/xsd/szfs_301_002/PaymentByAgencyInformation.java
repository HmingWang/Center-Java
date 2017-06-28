//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.28 ʱ�� 09:53:29 AM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_301_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentByAgencyInformation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaymentByAgencyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorprtnId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max14Text"/>
 *         &lt;element name="DbtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max14Text"/>
 *         &lt;element name="CdtrId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max14Text"/>
 *         &lt;element name="Dbtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Debtor1"/>
 *         &lt;element name="Cdtr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Creditor1"/>
 *         &lt;element name="PmtItmCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max5Text"/>
 *         &lt;element name="ChanlId" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Exact4Text" minOccurs="0"/>
 *         &lt;element name="Rmk" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max127Text" minOccurs="0"/>
 *         &lt;element name="AltDbtrFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}AltDbtrFlgCode1" minOccurs="0"/>
 *         &lt;element name="AltDbtrNm" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="ProCd" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Exact5Text" minOccurs="0"/>
 *         &lt;element name="TxFlg" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Exact2Text" minOccurs="0"/>
 *         &lt;element name="AddtlLen" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}Max8NumericText"/>
 *         &lt;element name="AddtlInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}AdditionalInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentByAgencyInformation", propOrder = {
    "corprtnId",
    "dbtrId",
    "cdtrId",
    "dbtr",
    "cdtr",
    "pmtItmCd",
    "chanlId",
    "rmk",
    "altDbtrFlg",
    "altDbtrNm",
    "proCd",
    "txFlg",
    "addtlLen",
    "addtlInf"
})
public class PaymentByAgencyInformation {

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
    @XmlElement(name = "AltDbtrFlg")
    protected String altDbtrFlg;
    @XmlElement(name = "AltDbtrNm")
    protected String altDbtrNm;
    @XmlElement(name = "ProCd")
    protected String proCd;
    @XmlElement(name = "TxFlg")
    protected String txFlg;
    @XmlElement(name = "AddtlLen", required = true)
    protected String addtlLen;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation1 addtlInf;

    /**
     * ��ȡcorprtnId���Ե�ֵ��
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
     * ����corprtnId���Ե�ֵ��
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
     * ��ȡdbtrId���Ե�ֵ��
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
     * ����dbtrId���Ե�ֵ��
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
     * ��ȡcdtrId���Ե�ֵ��
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
     * ����cdtrId���Ե�ֵ��
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
     * ��ȡdbtr���Ե�ֵ��
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
     * ����dbtr���Ե�ֵ��
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
     * ��ȡcdtr���Ե�ֵ��
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
     * ����cdtr���Ե�ֵ��
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
     * ��ȡpmtItmCd���Ե�ֵ��
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
     * ����pmtItmCd���Ե�ֵ��
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
     * ��ȡchanlId���Ե�ֵ��
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
     * ����chanlId���Ե�ֵ��
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
     * ��ȡrmk���Ե�ֵ��
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
     * ����rmk���Ե�ֵ��
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
     * ��ȡaltDbtrFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltDbtrFlg() {
        return altDbtrFlg;
    }

    /**
     * ����altDbtrFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltDbtrFlg(String value) {
        this.altDbtrFlg = value;
    }

    /**
     * ��ȡaltDbtrNm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltDbtrNm() {
        return altDbtrNm;
    }

    /**
     * ����altDbtrNm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltDbtrNm(String value) {
        this.altDbtrNm = value;
    }

    /**
     * ��ȡproCd���Ե�ֵ��
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
     * ����proCd���Ե�ֵ��
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
     * ��ȡtxFlg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxFlg() {
        return txFlg;
    }

    /**
     * ����txFlg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxFlg(String value) {
        this.txFlg = value;
    }

    /**
     * ��ȡaddtlLen���Ե�ֵ��
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
     * ����addtlLen���Ե�ֵ��
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
     * ��ȡaddtlInf���Ե�ֵ��
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
     * ����addtlInf���Ե�ֵ��
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
