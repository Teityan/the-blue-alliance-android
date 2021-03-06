/**
 * The Blue Alliance APIv3
 * Access data about the FIRST Robotics Competition
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.thebluealliance.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Nullable;


/**
 * District
 */

public interface IDistrict   {


   /**
   * The short identifier for the district
   * @return abbreviation
  **/
  @ApiModelProperty(example = "null", required = true, value = "The short identifier for the district")
  
  public String getAbbreviation();

  public void setAbbreviation(String abbreviation);



   /**
   * The long name for the district
   * @return displayName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The long name for the district")
  
  public String getDisplayName();

  public void setDisplayName(String displayName);



   /**
   * Key for this district, e.g. 2016ne
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "Key for this district, e.g. 2016ne")
  
  public String getKey();

  public void setKey(String key);



   /**
   * Timestamp this model was last modified
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "Timestamp this model was last modified")
  @Nullable
  public Long getLastModified();

  public void setLastModified(Long lastModified);



   /**
   * Year this district happened
   * @return year
  **/
  @ApiModelProperty(example = "null", required = true, value = "Year this district happened")
  
  public Integer getYear();

  public void setYear(Integer year);

}

