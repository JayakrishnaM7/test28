package com.bian.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:29:04.597Z[GMT]")

public class FinancialGatewayOperatingSession   {
  @JsonProperty("FinancialGatewayServiceType")
  private String financialGatewayServiceType;

  @JsonProperty("FinancialGatewayServiceSessionStatistics")
  private String financialGatewayServiceSessionStatistics;

  @JsonProperty("FinancialGatewayServiceSessionReportType")
  private String financialGatewayServiceSessionReportType;

  @JsonProperty("FinancialGatewayServiceSessionReport")
  private String financialGatewayServiceSessionReport;

  @JsonProperty("FinancialGatewayServiceSessionDate")
  private String financialGatewayServiceSessionDate;

  @JsonProperty("FinancialGatewayServiceSessionIssueRecord")
  private String financialGatewayServiceSessionIssueRecord;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("MessageReference")
  private Object messageReference;

  @JsonProperty("ProductionIssueType")
  private String productionIssueType;

  @JsonProperty("ProductionIssueDescription")
  private String productionIssueDescription;

  @JsonProperty("ProductionIssueDiagnosis")
  private String productionIssueDiagnosis;

  @JsonProperty("ProductionIssueResolutionTask")
  private String productionIssueResolutionTask;

  @JsonProperty("ProductionIssueRecord")
  private String productionIssueRecord;

  @JsonProperty("ProductionIssueStatus")
  private String productionIssueStatus;

  public FinancialGatewayOperatingSession financialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
    return this;
  }

  /**
   * Get financialGatewayServiceType
   * @return financialGatewayServiceType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceType() {
    return financialGatewayServiceType;
  }

  public void setFinancialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
  }

  public FinancialGatewayOperatingSession financialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionStatistics
   * @return financialGatewayServiceSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionStatistics() {
    return financialGatewayServiceSessionStatistics;
  }

  public void setFinancialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
  }

  public FinancialGatewayOperatingSession financialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
    this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionReportType
   * @return financialGatewayServiceSessionReportType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionReportType() {
    return financialGatewayServiceSessionReportType;
  }

  public void setFinancialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
    this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
  }

  public FinancialGatewayOperatingSession financialGatewayServiceSessionReport(String financialGatewayServiceSessionReport) {
    this.financialGatewayServiceSessionReport = financialGatewayServiceSessionReport;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionReport
   * @return financialGatewayServiceSessionReport
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionReport() {
    return financialGatewayServiceSessionReport;
  }

  public void setFinancialGatewayServiceSessionReport(String financialGatewayServiceSessionReport) {
    this.financialGatewayServiceSessionReport = financialGatewayServiceSessionReport;
  }

  public FinancialGatewayOperatingSession financialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
    this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionDate
   * @return financialGatewayServiceSessionDate
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionDate() {
    return financialGatewayServiceSessionDate;
  }

  public void setFinancialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
    this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
  }

  public FinancialGatewayOperatingSession financialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionIssueRecord
   * @return financialGatewayServiceSessionIssueRecord
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionIssueRecord() {
    return financialGatewayServiceSessionIssueRecord;
  }

  public void setFinancialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
  }

  public FinancialGatewayOperatingSession employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }

  public FinancialGatewayOperatingSession messageReference(Object messageReference) {
    this.messageReference = messageReference;
    return this;
  }

  /**
   * Get messageReference
   * @return messageReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMessageReference() {
    return messageReference;
  }

  public void setMessageReference(Object messageReference) {
    this.messageReference = messageReference;
  }

  public FinancialGatewayOperatingSession productionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
    return this;
  }

  /**
   * Get productionIssueType
   * @return productionIssueType
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }

  public FinancialGatewayOperatingSession productionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
    return this;
  }

  /**
   * Get productionIssueDescription
   * @return productionIssueDescription
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }

  public FinancialGatewayOperatingSession productionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
    return this;
  }

  /**
   * Get productionIssueDiagnosis
   * @return productionIssueDiagnosis
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }

  public FinancialGatewayOperatingSession productionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
    return this;
  }

  /**
   * Get productionIssueResolutionTask
   * @return productionIssueResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }

  public FinancialGatewayOperatingSession productionIssueRecord(String productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
    return this;
  }

  /**
   * Get productionIssueRecord
   * @return productionIssueRecord
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueRecord() {
    return productionIssueRecord;
  }

  public void setProductionIssueRecord(String productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
  }

  public FinancialGatewayOperatingSession productionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
    return this;
  }

  /**
   * Get productionIssueStatus
   * @return productionIssueStatus
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialGatewayOperatingSession financialGatewayOperatingSession = (FinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceType, financialGatewayOperatingSession.financialGatewayServiceType) &&
        Objects.equals(this.financialGatewayServiceSessionStatistics, financialGatewayOperatingSession.financialGatewayServiceSessionStatistics) &&
        Objects.equals(this.financialGatewayServiceSessionReportType, financialGatewayOperatingSession.financialGatewayServiceSessionReportType) &&
        Objects.equals(this.financialGatewayServiceSessionReport, financialGatewayOperatingSession.financialGatewayServiceSessionReport) &&
        Objects.equals(this.financialGatewayServiceSessionDate, financialGatewayOperatingSession.financialGatewayServiceSessionDate) &&
        Objects.equals(this.financialGatewayServiceSessionIssueRecord, financialGatewayOperatingSession.financialGatewayServiceSessionIssueRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, financialGatewayOperatingSession.employeeOrBusinessUnitReference) &&
        Objects.equals(this.messageReference, financialGatewayOperatingSession.messageReference) &&
        Objects.equals(this.productionIssueType, financialGatewayOperatingSession.productionIssueType) &&
        Objects.equals(this.productionIssueDescription, financialGatewayOperatingSession.productionIssueDescription) &&
        Objects.equals(this.productionIssueDiagnosis, financialGatewayOperatingSession.productionIssueDiagnosis) &&
        Objects.equals(this.productionIssueResolutionTask, financialGatewayOperatingSession.productionIssueResolutionTask) &&
        Objects.equals(this.productionIssueRecord, financialGatewayOperatingSession.productionIssueRecord) &&
        Objects.equals(this.productionIssueStatus, financialGatewayOperatingSession.productionIssueStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceType, financialGatewayServiceSessionStatistics, financialGatewayServiceSessionReportType, financialGatewayServiceSessionReport, financialGatewayServiceSessionDate, financialGatewayServiceSessionIssueRecord, employeeOrBusinessUnitReference, messageReference, productionIssueType, productionIssueDescription, productionIssueDiagnosis, productionIssueResolutionTask, productionIssueRecord, productionIssueStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceType: ").append(toIndentedString(financialGatewayServiceType)).append("\n");
    sb.append("    financialGatewayServiceSessionStatistics: ").append(toIndentedString(financialGatewayServiceSessionStatistics)).append("\n");
    sb.append("    financialGatewayServiceSessionReportType: ").append(toIndentedString(financialGatewayServiceSessionReportType)).append("\n");
    sb.append("    financialGatewayServiceSessionReport: ").append(toIndentedString(financialGatewayServiceSessionReport)).append("\n");
    sb.append("    financialGatewayServiceSessionDate: ").append(toIndentedString(financialGatewayServiceSessionDate)).append("\n");
    sb.append("    financialGatewayServiceSessionIssueRecord: ").append(toIndentedString(financialGatewayServiceSessionIssueRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    messageReference: ").append(toIndentedString(messageReference)).append("\n");
    sb.append("    productionIssueType: ").append(toIndentedString(productionIssueType)).append("\n");
    sb.append("    productionIssueDescription: ").append(toIndentedString(productionIssueDescription)).append("\n");
    sb.append("    productionIssueDiagnosis: ").append(toIndentedString(productionIssueDiagnosis)).append("\n");
    sb.append("    productionIssueResolutionTask: ").append(toIndentedString(productionIssueResolutionTask)).append("\n");
    sb.append("    productionIssueRecord: ").append(toIndentedString(productionIssueRecord)).append("\n");
    sb.append("    productionIssueStatus: ").append(toIndentedString(productionIssueStatus)).append("\n");
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

