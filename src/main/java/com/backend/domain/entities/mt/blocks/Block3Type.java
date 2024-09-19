//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.blocks;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@XmlRootElement
public class Block3Type {

    @Override
    public String toString() {
        return "Block3Type {" +
                "blockIdentifier='" + blockIdentifier + '\'' +
                ", tag103ServiceIdentifier='" + tag103ServiceIdentifier + '\'' +
                ", tag113BankingPriority='" + tag113BankingPriority + '\'' +
                ", tag108MessageUserReference='" + tag108MessageUserReference + '\'' +
                ", tag119ValidationFlag='" + tag119ValidationFlag + '\'' +
                ", tag423BalanceCheckpoint='" + tag423BalanceCheckpoint + '\'' +
                ", tag106MessageInputReference='" + tag106MessageInputReference + '\'' +
                ", tag424RelatedReference='" + tag424RelatedReference + '\'' +
                ", tag111ServiceTypeIdentifier='" + tag111ServiceTypeIdentifier + '\'' +
                ", tag121UniqueEndToEndTransactionReference='" + tag121UniqueEndToEndTransactionReference + '\'' +
                ", tag115AddresseeInformation='" + tag115AddresseeInformation + '\'' +
                ", tag165PaymentReleaseInfo='" + tag165PaymentReleaseInfo + '\'' +
                ", tag433SanctionsScreeningInfo='" + tag433SanctionsScreeningInfo + '\'' +
                '}';
    }


    @XmlElement(required = true)
    protected String blockIdentifier; // Ex: "3"
    @XmlElement(required = true)
    protected String tag103ServiceIdentifier; // Ex: {103:EBA}
    @XmlElement(required = false)
    protected String tag113BankingPriority; // Ex: {113:xxxx}
    @XmlElement(required = false)
    protected String tag108MessageUserReference; // Ex: {108:REF0140862562/015}
    @XmlElement(required = false)
    protected String tag119ValidationFlag; // Ex: {119:STP}
    @XmlElement(required = false)
    protected String tag423BalanceCheckpoint; // Ex: {423:18071715301204}
    @XmlElement(required = false)
    protected String tag106MessageInputReference; // Ex: {106:MIR}
    @XmlElement(required = false)
    protected String tag424RelatedReference; // Ex: {424:PQAB1234}
    @XmlElement(required = false)
    protected String tag111ServiceTypeIdentifier; // Ex: {111:3!n}
    @XmlElement(required = false)
    protected String tag121UniqueEndToEndTransactionReference; // Ex: {121:xxxxxxxx-xxxx-4xxx-yxxxxxxxxxxxxxxx}
    @XmlElement(required = false)
    protected String tag115AddresseeInformation; // Ex: {115: 121413 121413 DE BANKDECDA123}
    @XmlElement(required = false)
    protected String tag165PaymentReleaseInfo; // Ex: {165:/3!c/34x}
    @XmlElement(required = false)
    protected String tag433SanctionsScreeningInfo; // Ex: {433:/AOK}

    // Regex definition for parsing Block 3 tags
    private static final String REGEX = "\\{(\\d{3}):([^}]*)\\}";

    // Parsing method for Block 3
    public boolean parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String tag = matcher.group(1);
            String content = matcher.group(2);

            switch (tag) {
                case "103":
                    this.tag103ServiceIdentifier = content;
                    break;
                case "113":
                    this.tag113BankingPriority = content;
                    break;
                case "108":
                    this.tag108MessageUserReference = content;
                    break;
                case "119":
                    this.tag119ValidationFlag = content;
                    break;
                case "423":
                    this.tag423BalanceCheckpoint = content;
                    break;
                case "106":
                    this.tag106MessageInputReference = content;
                    break;
                case "424":
                    this.tag424RelatedReference = content;
                    break;
                case "111":
                    this.tag111ServiceTypeIdentifier = content;
                    break;
                case "121":
                    this.tag121UniqueEndToEndTransactionReference = content;
                    break;
                case "115":
                    this.tag115AddresseeInformation = content;
                    break;
                case "165":
                    this.tag165PaymentReleaseInfo = content;
                    break;
                case "433":
                    this.tag433SanctionsScreeningInfo = content;
                    break;
                default:
                    // Unrecognized tag
                    return false;
            }
        }
        return true;
    }

    // Getters and Setters for each field
    public String getTag103ServiceIdentifier() {
        return tag103ServiceIdentifier;
    }

    public void setTag103ServiceIdentifier(String tag103ServiceIdentifier) {
        this.tag103ServiceIdentifier = tag103ServiceIdentifier;
    }

    public String getTag113BankingPriority() {
        return tag113BankingPriority;
    }

    public void setTag113BankingPriority(String tag113BankingPriority) {
        this.tag113BankingPriority = tag113BankingPriority;
    }

    public String getTag108MessageUserReference() {
        return tag108MessageUserReference;
    }

    public void setTag108MessageUserReference(String tag108MessageUserReference) {
        this.tag108MessageUserReference = tag108MessageUserReference;
    }

    public String getTag119ValidationFlag() {
        return tag119ValidationFlag;
    }

    public void setTag119ValidationFlag(String tag119ValidationFlag) {
        this.tag119ValidationFlag = tag119ValidationFlag;
    }

    public String getTag423BalanceCheckpoint() {
        return tag423BalanceCheckpoint;
    }

    public void setTag423BalanceCheckpoint(String tag423BalanceCheckpoint) {
        this.tag423BalanceCheckpoint = tag423BalanceCheckpoint;
    }

    public String getTag106MessageInputReference() {
        return tag106MessageInputReference;
    }

    public void setTag106MessageInputReference(String tag106MessageInputReference) {
        this.tag106MessageInputReference = tag106MessageInputReference;
    }

    public String getTag424RelatedReference() {
        return tag424RelatedReference;
    }

    public void setTag424RelatedReference(String tag424RelatedReference) {
        this.tag424RelatedReference = tag424RelatedReference;
    }

    public String getTag111ServiceTypeIdentifier() {
        return tag111ServiceTypeIdentifier;
    }

    public void setTag111ServiceTypeIdentifier(String tag111ServiceTypeIdentifier) {
        this.tag111ServiceTypeIdentifier = tag111ServiceTypeIdentifier;
    }

    public String getTag121UniqueEndToEndTransactionReference() {
        return tag121UniqueEndToEndTransactionReference;
    }

    public void setTag121UniqueEndToEndTransactionReference(String tag121UniqueEndToEndTransactionReference) {
        this.tag121UniqueEndToEndTransactionReference = tag121UniqueEndToEndTransactionReference;
    }

    public String getTag115AddresseeInformation() {
        return tag115AddresseeInformation;
    }

    public void setTag115AddresseeInformation(String tag115AddresseeInformation) {
        this.tag115AddresseeInformation = tag115AddresseeInformation;
    }

    public String getTag165PaymentReleaseInfo() {
        return tag165PaymentReleaseInfo;
    }

    public void setTag165PaymentReleaseInfo(String tag165PaymentReleaseInfo) {
        this.tag165PaymentReleaseInfo = tag165PaymentReleaseInfo;
    }

    public String getTag433SanctionsScreeningInfo() {
        return tag433SanctionsScreeningInfo;
    }

    public void setTag433SanctionsScreeningInfo(String tag433SanctionsScreeningInfo) {
        this.tag433SanctionsScreeningInfo = tag433SanctionsScreeningInfo;
    }

    public String getContent() {
        StringBuilder content = new StringBuilder();

        if (blockIdentifier != null) {
            content.append("{").append("3:").append(blockIdentifier).append("}");
        }
        if (tag103ServiceIdentifier != null) {
            content.append("{103:").append(tag103ServiceIdentifier).append("}");
        }
        if (tag113BankingPriority != null) {
            content.append("{113:").append(tag113BankingPriority).append("}");
        }
        if (tag108MessageUserReference != null) {
            content.append("{108:").append(tag108MessageUserReference).append("}");
        }
        if (tag119ValidationFlag != null) {
            content.append("{119:").append(tag119ValidationFlag).append("}");
        }
        if (tag423BalanceCheckpoint != null) {
            content.append("{423:").append(tag423BalanceCheckpoint).append("}");
        }
        if (tag106MessageInputReference != null) {
            content.append("{106:").append(tag106MessageInputReference).append("}");
        }
        if (tag424RelatedReference != null) {
            content.append("{424:").append(tag424RelatedReference).append("}");
        }
        if (tag111ServiceTypeIdentifier != null) {
            content.append("{111:").append(tag111ServiceTypeIdentifier).append("}");
        }
        if (tag121UniqueEndToEndTransactionReference != null) {
            content.append("{121:").append(tag121UniqueEndToEndTransactionReference).append("}");
        }
        if (tag115AddresseeInformation != null) {
            content.append("{115:").append(tag115AddresseeInformation).append("}");
        }
        if (tag165PaymentReleaseInfo != null) {
            content.append("{165:").append(tag165PaymentReleaseInfo).append("}");
        }
        if (tag433SanctionsScreeningInfo != null) {
            content.append("{433:").append(tag433SanctionsScreeningInfo).append("}");
        }

        return content.toString();
    }


}

