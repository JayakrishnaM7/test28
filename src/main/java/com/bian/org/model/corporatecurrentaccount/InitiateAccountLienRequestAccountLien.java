package com.bian.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienRequestAccountLien
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:48.396Z[GMT]")

public class InitiateAccountLienRequestAccountLien   {
  @JsonProperty("LienType")
  private String lienType;

  @JsonProperty("LienDefinition")
  private String lienDefinition;

  @JsonProperty("LienProcessingOption")
  private String lienProcessingOption;

  @JsonProperty("LienRecord")
  private String lienRecord;

  @JsonProperty("LienOriginator")
  private String lienOriginator;

  @JsonProperty("LienPurpose")
  private String lienPurpose;

  @JsonProperty("LienAmount")
  private BigDecimal lienAmount;

  @JsonProperty("LienStartDate")
  private String lienStartDate;

  @JsonProperty("LienExpiryDate")
  private String lienExpiryDate;

  @JsonProperty("LienStatus")
  private String lienStatus;

  public InitiateAccountLienRequestAccountLien lienType(String lienType) {
    this.lienType = lienType;
    return this;
  }

  /**
   * Get lienType
   * @return lienType
  */
  @ApiModelProperty(value = "")


  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }

  public InitiateAccountLienRequestAccountLien lienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
    return this;
  }

  /**
   * Get lienDefinition
   * @return lienDefinition
  */
  @ApiModelProperty(value = "")


  public String getLienDefinition() {
    return lienDefinition;
  }

  public void setLienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
  }

  public InitiateAccountLienRequestAccountLien lienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
    return this;
  }

  /**
   * Get lienProcessingOption
   * @return lienProcessingOption
  */
  @ApiModelProperty(value = "")


  public String getLienProcessingOption() {
    return lienProcessingOption;
  }

  public void setLienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
  }

  public InitiateAccountLienRequestAccountLien lienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
    return this;
  }

  /**
   * Get lienRecord
   * @return lienRecord
  */
  @ApiModelProperty(value = "")


  public String getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(String lienRecord) {
    this.lienRecord = lienRecord;
  }

  public InitiateAccountLienRequestAccountLien lienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
    return this;
  }

  /**
   * Get lienOriginator
   * @return lienOriginator
  */
  @ApiModelProperty(value = "")


  public String getLienOriginator() {
    return lienOriginator;
  }

  public void setLienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
  }

  public InitiateAccountLienRequestAccountLien lienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
    return this;
  }

  /**
   * Get lienPurpose
   * @return lienPurpose
  */
  @ApiModelProperty(value = "")


  public String getLienPurpose() {
    return lienPurpose;
  }

  public void setLienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
  }

  public InitiateAccountLienRequestAccountLien lienAmount(BigDecimal lienAmount) {
    this.lienAmount = lienAmount;
    return this;
  }

  /**
   * Get lienAmount
   * @return lienAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLienAmount() {
    return lienAmount;
  }

  public void setLienAmount(BigDecimal lienAmount) {
    this.lienAmount = lienAmount;
  }

  public InitiateAccountLienRequestAccountLien lienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
    return this;
  }

  /**
   * Get lienStartDate
   * @return lienStartDate
  */
  @ApiModelProperty(value = "")


  public String getLienStartDate() {
    return lienStartDate;
  }

  public void setLienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
  }

  public InitiateAccountLienRequestAccountLien lienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
    return this;
  }

  /**
   * Get lienExpiryDate
   * @return lienExpiryDate
  */
  @ApiModelProperty(value = "")


  public String getLienExpiryDate() {
    return lienExpiryDate;
  }

  public void setLienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
  }

  public InitiateAccountLienRequestAccountLien lienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
    return this;
  }

  /**
   * Get lienStatus
   * @return lienStatus
  */
  @ApiModelProperty(value = "")


  public String getLienStatus() {
    return lienStatus;
  }

  public void setLienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienRequestAccountLien initiateAccountLienRequestAccountLien = (InitiateAccountLienRequestAccountLien) o;
    return Objects.equals(this.lienType, initiateAccountLienRequestAccountLien.lienType) &&
        Objects.equals(this.lienDefinition, initiateAccountLienRequestAccountLien.lienDefinition) &&
        Objects.equals(this.lienProcessingOption, initiateAccountLienRequestAccountLien.lienProcessingOption) &&
        Objects.equals(this.lienRecord, initiateAccountLienRequestAccountLien.lienRecord) &&
        Objects.equals(this.lienOriginator, initiateAccountLienRequestAccountLien.lienOriginator) &&
        Objects.equals(this.lienPurpose, initiateAccountLienRequestAccountLien.lienPurpose) &&
        Objects.equals(this.lienAmount, initiateAccountLienRequestAccountLien.lienAmount) &&
        Objects.equals(this.lienStartDate, initiateAccountLienRequestAccountLien.lienStartDate) &&
        Objects.equals(this.lienExpiryDate, initiateAccountLienRequestAccountLien.lienExpiryDate) &&
        Objects.equals(this.lienStatus, initiateAccountLienRequestAccountLien.lienStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienType, lienDefinition, lienProcessingOption, lienRecord, lienOriginator, lienPurpose, lienAmount, lienStartDate, lienExpiryDate, lienStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienRequestAccountLien {\n");
    
    sb.append("    lienType: ").append(toIndentedString(lienType)).append("\n");
    sb.append("    lienDefinition: ").append(toIndentedString(lienDefinition)).append("\n");
    sb.append("    lienProcessingOption: ").append(toIndentedString(lienProcessingOption)).append("\n");
    sb.append("    lienRecord: ").append(toIndentedString(lienRecord)).append("\n");
    sb.append("    lienOriginator: ").append(toIndentedString(lienOriginator)).append("\n");
    sb.append("    lienPurpose: ").append(toIndentedString(lienPurpose)).append("\n");
    sb.append("    lienAmount: ").append(toIndentedString(lienAmount)).append("\n");
    sb.append("    lienStartDate: ").append(toIndentedString(lienStartDate)).append("\n");
    sb.append("    lienExpiryDate: ").append(toIndentedString(lienExpiryDate)).append("\n");
    sb.append("    lienStatus: ").append(toIndentedString(lienStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

