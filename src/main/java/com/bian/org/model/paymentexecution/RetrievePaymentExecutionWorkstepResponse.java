package com.bian.org.model.paymentexecution;

import java.util.Objects;
import com.bian.org.model.paymentexecution.RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure;
import com.bian.org.model.paymentexecution.RetrievePaymentMechanismResponsePaymentMechanism;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePaymentExecutionWorkstepResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:54.208Z[GMT]")

public class RetrievePaymentExecutionWorkstepResponse   {
  @JsonProperty("PaymentExecutionProcedure")
  private RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  @JsonProperty("PaymentExecutionWorkstep")
  private RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep;

  public RetrievePaymentExecutionWorkstepResponse paymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }

  public RetrievePaymentExecutionWorkstepResponse paymentExecutionWorkstep(RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep) {
    this.paymentExecutionWorkstep = paymentExecutionWorkstep;
    return this;
  }

  /**
   * Get paymentExecutionWorkstep
   * @return paymentExecutionWorkstep
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrievePaymentMechanismResponsePaymentMechanism getPaymentExecutionWorkstep() {
    return paymentExecutionWorkstep;
  }

  public void setPaymentExecutionWorkstep(RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep) {
    this.paymentExecutionWorkstep = paymentExecutionWorkstep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstepResponse = (RetrievePaymentExecutionWorkstepResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, retrievePaymentExecutionWorkstepResponse.paymentExecutionProcedure) &&
        Objects.equals(this.paymentExecutionWorkstep, retrievePaymentExecutionWorkstepResponse.paymentExecutionWorkstep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure, paymentExecutionWorkstep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentExecutionWorkstepResponse {\n");
    
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("    paymentExecutionWorkstep: ").append(toIndentedString(paymentExecutionWorkstep)).append("\n");
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

