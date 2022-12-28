package com.bian.org.model.paymentinitiation;

import java.util.Objects;
import com.bian.org.model.paymentinitiation.RetrieveComplianceResponseCompliance;
import com.bian.org.model.paymentinitiation.RetrieveComplianceResponsePaymentInitiationTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveComplianceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:43.197Z[GMT]")

public class RetrieveComplianceResponse   {
  @JsonProperty("PaymentInitiationTransaction")
  private RetrieveComplianceResponsePaymentInitiationTransaction paymentInitiationTransaction;

  @JsonProperty("Compliance")
  private RetrieveComplianceResponseCompliance compliance;

  public RetrieveComplianceResponse paymentInitiationTransaction(RetrieveComplianceResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveComplianceResponsePaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(RetrieveComplianceResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }

  public RetrieveComplianceResponse compliance(RetrieveComplianceResponseCompliance compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveComplianceResponseCompliance getCompliance() {
    return compliance;
  }

  public void setCompliance(RetrieveComplianceResponseCompliance compliance) {
    this.compliance = compliance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveComplianceResponse retrieveComplianceResponse = (RetrieveComplianceResponse) o;
    return Objects.equals(this.paymentInitiationTransaction, retrieveComplianceResponse.paymentInitiationTransaction) &&
        Objects.equals(this.compliance, retrieveComplianceResponse.compliance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction, compliance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveComplianceResponse {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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

