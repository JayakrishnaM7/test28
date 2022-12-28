package com.bian.org.model.regulatorycompliance;

import java.util.Objects;
import com.bian.org.model.regulatorycompliance.EvaluateRegulatoryComplianceAssessmentRequestRegulatoryComplianceAssessment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateRegulatoryComplianceAssessmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:59.098Z[GMT]")

public class UpdateRegulatoryComplianceAssessmentRequest   {
  @JsonProperty("RegulatoryComplianceAssessment")
  private EvaluateRegulatoryComplianceAssessmentRequestRegulatoryComplianceAssessment regulatoryComplianceAssessment;

  public UpdateRegulatoryComplianceAssessmentRequest regulatoryComplianceAssessment(EvaluateRegulatoryComplianceAssessmentRequestRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    return this;
  }

  /**
   * Get regulatoryComplianceAssessment
   * @return regulatoryComplianceAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateRegulatoryComplianceAssessmentRequestRegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
    return regulatoryComplianceAssessment;
  }

  public void setRegulatoryComplianceAssessment(EvaluateRegulatoryComplianceAssessmentRequestRegulatoryComplianceAssessment regulatoryComplianceAssessment) {
    this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegulatoryComplianceAssessmentRequest updateRegulatoryComplianceAssessmentRequest = (UpdateRegulatoryComplianceAssessmentRequest) o;
    return Objects.equals(this.regulatoryComplianceAssessment, updateRegulatoryComplianceAssessmentRequest.regulatoryComplianceAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryComplianceAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegulatoryComplianceAssessmentRequest {\n");
    
    sb.append("    regulatoryComplianceAssessment: ").append(toIndentedString(regulatoryComplianceAssessment)).append("\n");
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

