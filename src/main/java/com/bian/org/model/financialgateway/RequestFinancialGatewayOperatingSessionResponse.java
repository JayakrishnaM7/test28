package com.bian.org.model.financialgateway;

import java.util.Objects;
import com.bian.org.model.financialgateway.RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestFinancialGatewayOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:29:04.597Z[GMT]")

public class RequestFinancialGatewayOperatingSessionResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession;

  public RequestFinancialGatewayOperatingSessionResponse financialGatewayOperatingSession(RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFinancialGatewayOperatingSessionResponse requestFinancialGatewayOperatingSessionResponse = (RequestFinancialGatewayOperatingSessionResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, requestFinancialGatewayOperatingSessionResponse.financialGatewayOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFinancialGatewayOperatingSessionResponse {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
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

