package com.bian.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.bian.org.model.corporatecurrentaccount.UpdateCurrentAccountFacilityRequestCurrentAccountFacility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCurrentAccountFacilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-28T08:28:48.396Z[GMT]")

public class UpdateCurrentAccountFacilityRequest   {
  @JsonProperty("CurrentAccountFacility")
  private UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility;

  public UpdateCurrentAccountFacilityRequest currentAccountFacility(UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCurrentAccountFacilityRequestCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(UpdateCurrentAccountFacilityRequestCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCurrentAccountFacilityRequest updateCurrentAccountFacilityRequest = (UpdateCurrentAccountFacilityRequest) o;
    return Objects.equals(this.currentAccountFacility, updateCurrentAccountFacilityRequest.currentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCurrentAccountFacilityRequest {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
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

