package com.bian.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.bian.org.model.corporatecurrentaccount.ExecuteServiceFeesRequestServiceFees;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteServiceFeesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:48.396Z[GMT]")

public class ExecuteServiceFeesRequest   {
  @JsonProperty("ServiceFees")
  private ExecuteServiceFeesRequestServiceFees serviceFees;

  public ExecuteServiceFeesRequest serviceFees(ExecuteServiceFeesRequestServiceFees serviceFees) {
    this.serviceFees = serviceFees;
    return this;
  }

  /**
   * Get serviceFees
   * @return serviceFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteServiceFeesRequestServiceFees getServiceFees() {
    return serviceFees;
  }

  public void setServiceFees(ExecuteServiceFeesRequestServiceFees serviceFees) {
    this.serviceFees = serviceFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteServiceFeesRequest executeServiceFeesRequest = (ExecuteServiceFeesRequest) o;
    return Objects.equals(this.serviceFees, executeServiceFeesRequest.serviceFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteServiceFeesRequest {\n");
    
    sb.append("    serviceFees: ").append(toIndentedString(serviceFees)).append("\n");
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

