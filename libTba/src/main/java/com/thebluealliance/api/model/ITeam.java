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
 * Team
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T17:25:08.276-04:00")
public interface ITeam   {


   /**
   * Street address for this team
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "Street address for this team")
  @Nullable
  public String getAddress();

  public void setAddress(String address);



   /**
   * URL for this team on Google Maps
   * @return gmapsUrl
  **/
  @ApiModelProperty(example = "null", value = "URL for this team on Google Maps")
  @Nullable
  public String getGmapsUrl();

  public void setGmapsUrl(String gmapsUrl);



   /**
   * TBA team key with the format frcyyyy
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "TBA team key with the format frcyyyy")
  
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
   * Name of where this team is based
   * @return locationName
  **/
  @ApiModelProperty(example = "null", value = "Name of where this team is based")
  @Nullable
  public String getLocationName();

  public void setLocationName(String locationName);



   /**
   * Team's motto as provided by FIRST
   * @return motto
  **/
  @ApiModelProperty(example = "null", value = "Team's motto as provided by FIRST")
  @Nullable
  public String getMotto();

  public void setMotto(String motto);



   /**
   * Official long name registerd with FIRST
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Official long name registerd with FIRST")
  
  public String getName();

  public void setName(String name);



   /**
   * ITeam nickname provided by FIRST
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "Team nickname provided by FIRST")
  @Nullable
  public String getNickname();

  public void setNickname(String nickname);



   /**
   * First year the team officially competed
   * @return rookieYear
  **/
  @ApiModelProperty(example = "null", value = "First year the team officially competed")
  @Nullable
  public Integer getRookieYear();

  public void setRookieYear(Integer rookieYear);



   /**
   * Official team number issued by FIRST
   * @return teamNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "Official team number issued by FIRST")
  
  public Integer getTeamNumber();

  public void setTeamNumber(Integer teamNumber);



   /**
   * Official website associatd with the team
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "Official website associatd with the team")
  @Nullable
  public String getWebsite();

  public void setWebsite(String website);

}

