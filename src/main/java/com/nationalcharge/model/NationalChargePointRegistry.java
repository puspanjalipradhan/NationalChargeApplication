// tag::sample[]
package com.nationalcharge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

@Component
@Entity
@javax.persistence.Table(name = "national_charge_point_registry")
public class NationalChargePointRegistry {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Transient
    private double minDistance;
    @Column(name = "chargeDeviceID")
    @Type(type = "text")
    private String  chargeDeviceID;
    @Column(name = "reference")
    @Type(type = "text")
    private String  reference;
    @Column(name = "name")
    @Type(type = "text")
    private String  name;
    @Column(name = "latitude")
    private double  latitude;
    @Column(name = "longitude")
    private double  longitude;
    @Column(name = "subBuildingName")
    @Type(type = "text")
    private String  subBuildingName;
    @Column(name = "buildingName")
    @Type(type = "text")
    private String  buildingName;
    @Column(name = "buildingNumber")
    @Type(type = "text")
    private String  buildingNumber;
    @Column(name = "thoroughfare")
    @Type(type = "text")
    private String  thoroughfare;
    @Column(name = "street")
    @Type(type = "text")
    private String  street;
    @Column(name = "doubleDependantLocality")
    @Type(type = "text")
    private String  doubleDependantLocality;
    @Column(name = "dependantLocality")
    @Type(type = "text")
    private String  dependantLocality;
    @Column(name = "town")
    @Type(type = "text")
    private String  town;
    @Column(name = "county")
    @Type(type = "text")
    private String  county;
    @Column(name = "postcode")
    @Type(type = "text")
    private String  postcode;
    @Column(name = "countryCode")
    @Type(type = "text")
    private String  countryCode;
    @Column(name = "uprn")
    @Type(type = "text")
    private String  uprn;
    @Column(name = "deviceDescription")
    @Type(type = "text")
    private String  deviceDescription;
    @Column(name = "locationShortDescription")
    @Type(type = "text")
    private String  locationShortDescription;
    @Column(name = "locationLongDescription")
    @Type(type = "text")
    private String  locationLongDescription;
    @Column(name = "deviceManufacturer")
    @Type(type = "text")
    private String  deviceManufacturer;
    @Column(name = "deviceModel")
    @Type(type = "text")
    private String  deviceModel;
    @Column(name = "deviceOwnerName")
    @Type(type = "text")
    private String  deviceOwnerName;
    @Column(name = "deviceOwnerWebsite")
    @Type(type = "text")
    private String  deviceOwnerWebsite;
    @Column(name = "deviceOwnerTelephoneNo")
    @Type(type = "text")
    private String  deviceOwnerTelephoneNo;
    @Column(name = "deviceOwnerContactName")
    @Type(type = "text")
    private String  deviceOwnerContactName;
    @Column(name = "deviceControllerName")
    @Type(type = "text")
    private String  deviceControllerName;
    @Column(name = "deviceControllerWebsite")
    @Type(type = "text")
    private String  deviceControllerWebsite;
    @Column(name = "deviceControllerTelephoneNo")
    @Type(type = "text")
    private String  deviceControllerTelephoneNo;
    @Column(name = "deviceControllerContactName")
    @Type(type = "text")
    private String  deviceControllerContactName;
    @Column(name = "deviceNetworks")
    @Type(type = "text")
    private String  deviceNetworks;
    @Column(name = "chargeDeviceStatus")
    @Type(type = "text")
    private String  chargeDeviceStatus;
    @Column(name = "publishStatus")
    @Type(type = "text")
    private String  publishStatus;
    @Column(name = "deviceValidated")
    @Type(type = "text")
    private String  deviceValidated;
    @Column(name = "dateCreated")
    @Type(type = "text")
    private String  dateCreated;
    @Column(name = "dateUpdated")
    @Type(type = "text")
    private String  dateUpdated;
    @Column(name = "moderated")
    @Type(type = "text")
    private String  moderated;
    @Column(name = "lastUpdated")
    @Type(type = "text")
    private String  lastUpdated;
    @Column(name = "lastUpdatedBy")
    @Type(type = "text")
    private String  lastUpdatedBy;
    @Column(name = "attribution")
    @Type(type = "text")
    private String  attribution;
    @Column(name = "dateDeleted")
    @Type(type = "text")
    private String  dateDeleted;
    @Column(name = "paymentRequired")
    @Type(type = "text")
    private String  paymentRequired;
    @Column(name = "paymentRequiredDetails")
    @Type(type = "text")
    private String  paymentRequiredDetails;
    @Column(name = "subscriptionRequired")
    @Type(type = "text")
    private String  subscriptionRequired;
    @Column(name = "subscriptionRequiredDetails")
    @Type(type = "text")
    private String  subscriptionRequiredDetails;
    @Column(name = "parkingFeesFlag")
    @Type(type = "text")
    private String  parkingFeesFlag;
    @Column(name = "parkingFeesDetails")
    @Type(type = "text")
    private String  parkingFeesDetails;
    @Column(name = "parkingFeesUrl")
    @Type(type = "text")
    private String  parkingFeesUrl;
    @Column(name = "accessRestrictionFlag")
    @Type(type = "text")
    private String  accessRestrictionFlag;
    @Column(name = "accessRestrictionDetails")
    @Type(type = "text")
    private String  accessRestrictionDetails;
    @Column(name = "physicalRestrictionFlag")
    @Type(type = "text")
    private String  physicalRestrictionFlag;
    @Column(name = "physicalRestrictionText")
    @Type(type = "text")
    private String  physicalRestrictionText;
    @Column(name = "onStreetFlag")
    @Type(type = "text")
    private String  onStreetFlag;
    @Column(name = "locationType")
    @Type(type = "text")
    private String  locationType;
    @Column(name = "bearing")
    @Type(type = "text")
    private String  bearing;
    @Column(name = "access24Hours")
    @Type(type = "text")
    private String  access24Hours;
    @Column(name = "accessMondayFrom")
    @Type(type = "text")
    private String  accessMondayFrom;
    @Column(name = "accessMondayTo")
    @Type(type = "text")
    private String  accessMondayTo;
    @Column(name = "accessTuesdayFrom")
    @Type(type = "text")
    private String  accessTuesdayFrom;
    @Column(name = "accessTuesdayTo")
    @Type(type = "text")
    private String  accessTuesdayTo;
    @Column(name = "accessWednesdayFrom")
    @Type(type = "text")
    private String  accessWednesdayFrom;
    @Column(name = "accessWednesdayTo")
    @Type(type = "text")
    private String  accessWednesdayTo;
    @Column(name = "accessThursdayFrom")
    @Type(type = "text")
    private String  accessThursdayFrom;
    @Column(name = "accessThursdayTo")
    @Type(type = "text")
    private String  accessThursdayTo;
    @Column(name = "accessFridayFrom")
    @Type(type = "text")
    private String  accessFridayFrom;
    @Column(name = "accessFridayTo")
    @Type(type = "text")
    private String  accessFridayTo;
    @Column(name = "accessSaturdayFrom")
    @Type(type = "text")
    private String  accessSaturdayFrom;
    @Column(name = "accessSaturdayTo")
    @Type(type = "text")
    private String  accessSaturdayTo;
    @Column(name = "accessSundayFrom")
    @Type(type = "text")
    private String  accessSundayFrom;
    @Column(name = "accessSundayTo")
    @Type(type = "text")
    private String  accessSundayTo;
    @Column(name = "connector1ID")
    @Type(type = "text")
    private String  connector1ID;
    @Column(name = "connector1Type")
    @Type(type = "text")
    private String  connector1Type;
    @Column(name = "connector1ratedoutputkw")
    private double  connector1RatedOutputKW = 0.0;
    @Column(name = "connector1OutputCurrent")
    @Type(type = "text")
    private String  connector1OutputCurrent;
    @Column(name = "connector1RatedVoltage")
    @Type(type = "text")
    private String  connector1RatedVoltage;
    @Column(name = "connector1ChargeMethod")
    @Type(type = "text")
    private String  connector1ChargeMethod;
    @Column(name = "connector1ChargeMode")
    @Type(type = "text")
    private String  connector1ChargeMode;
    @Column(name = "connector1TetheredCable")
    @Type(type = "text")
    private String  connector1TetheredCable;
    @Column(name = "connector1Status")
    @Type(type = "text")
    private String  connector1Status;
    @Column(name = "connector1Description")
    @Type(type = "text")
    private String  connector1Description;
    @Column(name = "connector1Validated")
    @Type(type = "text")
    private String  connector1Validated;
    @Column(name = "connector2ID")
    @Type(type = "text")
    private String  connector2ID;
    @Column(name = "connector2Type")
    @Type(type = "text")
    private String  connector2Type;
    @Column(name = "connector2RatedOutputKW")
    @Type(type = "text")
    private String  connector2RatedOutputKW;
    @Column(name = "connector2OutputCurrent")
    @Type(type = "text")
    private String  connector2OutputCurrent;
    @Column(name = "connector2RatedVoltage")
    @Type(type = "text")
    private String  connector2RatedVoltage;
    @Column(name = "connector2ChargeMethod")
    @Type(type = "text")
    private String  connector2ChargeMethod;
    @Column(name = "connector2ChargeMode")
    @Type(type = "text")
    private String  connector2ChargeMode;
    @Column(name = "connector2TetheredCable")
    @Type(type = "text")
    private String  connector2TetheredCable;
    @Column(name = "connector2Status")
    @Type(type = "text")
    private String  connector2Status;
    @Column(name = "connector2Description")
    @Type(type = "text")
    private String  connector2Description;
    @Column(name = "connector3Validated1")
    @Type(type = "text")
    private String  connector3Validated1;
    @Column(name = "connector3ID")
    @Type(type = "text")
    private String  connector3ID;
    @Column(name = "connector3Type")
    @Type(type = "text")
    private String  connector3Type;
    @Column(name = "connector3RatedOutputKW")
    @Type(type = "text")
    private String  connector3RatedOutputKW;
    @Column(name = "connector3OutputCurrent")
    @Type(type = "text")
    private String  connector3OutputCurrent;
    @Column(name = "connector3RatedVoltage")
    @Type(type = "text")
    private String  connector3RatedVoltage;
    @Column(name = "connector3ChargeMethod")
    @Type(type = "text")
    private String  connector3ChargeMethod;
    @Column(name = "connector3ChargeMode")
    @Type(type = "text")
    private String  connector3ChargeMode;
    @Column(name = "connector3TetheredCable")
    @Type(type = "text")
    private String  connector3TetheredCable;
    @Column(name = "connector3Status")
    @Type(type = "text")
    private String  connector3Status;
    @Column(name = "connector3Description")
    @Type(type = "text")
    private String  connector3Description;
    @Column(name = "connector3Validated")
    @Type(type = "text")
    private String  connector3Validated;
    @Column(name = "connector4ID")
    @Type(type = "text")
    private String  connector4ID;
    @Column(name = "connector4Type")
    @Type(type = "text")
    private String  connector4Type;
    @Column(name = "connector4RatedOutputKW")
    @Type(type = "text")
    private String  connector4RatedOutputKW;
    @Column(name = "connector4OutputCurrent")
    @Type(type = "text")
    private String  connector4OutputCurrent;
    @Column(name = "connector4RatedVoltage")
    @Type(type = "text")
    private String  connector4RatedVoltage;
    @Column(name = "connector4ChargeMethod")
    @Type(type = "text")
    private String  connector4ChargeMethod;
    @Column(name = "connector4ChargeMode")
    @Type(type = "text")
    private String  connector4ChargeMode;
    @Column(name = "connector4TetheredCable")
    @Type(type = "text")
    private String  connector4TetheredCable;
    @Column(name = "connector4Status")
    @Type(type = "text")
    private String  connector4Status;
    @Column(name = "connector4Description")
    @Type(type = "text")
    private String  connector4Description;
    @Column(name = "connector4Validated")
    @Type(type = "text")
    private String  connector4Validated;
    @Column(name = "connector5ID")
    @Type(type = "text")
    private String  connector5ID;
    @Column(name = "connector5Type")
    @Type(type = "text")
    private String  connector5Type;
    @Column(name = "connector5RatedOutputKW")
    @Type(type = "text")
    private String  connector5RatedOutputKW;
    @Column(name = "connector5OutputCurrent")
    @Type(type = "text")
    private String  connector5OutputCurrent;
    @Column(name = "connector5RatedVoltage")
    @Type(type = "text")
    private String  connector5RatedVoltage;
    @Column(name = "connector5ChargeMethod")
    @Type(type = "text")
    private String  connector5ChargeMethod;
    @Column(name = "connector5ChargeMode")
    @Type(type = "text")
    private String  connector5ChargeMode;
    @Column(name = "connector5TetheredCable")
    @Type(type = "text")
    private String  connector5TetheredCable;
    @Column(name = "connector5Status")
    @Type(type = "text")
    private String  connector5Status;
    @Column(name = "connector5Description")
    @Type(type = "text")
    private String  connector5Description;
    @Column(name = "connector5Validated")
    @Type(type = "text")
    private String  connector5Validated;
    @Column(name = "connector6ID")
    @Type(type = "text")
    private String  connector6ID;
    @Column(name = "connector6Type")
    @Type(type = "text")
    private String  connector6Type;
    @Column(name = "connector6RatedOutputKW")
    @Type(type = "text")
    private String  connector6RatedOutputKW;
    @Column(name = "connector6OutputCurrent")
    @Type(type = "text")
    private String  connector6OutputCurrent;
    @Column(name = "connector6RatedVoltage")
    @Type(type = "text")
    private String  connector6RatedVoltage;
    @Column(name = "connector6ChargeMethod")
    @Type(type = "text")
    private String  connector6ChargeMethod;
    @Column(name = "connector6ChargeMode")
    @Type(type = "text")
    private String  connector6ChargeMode;
    @Column(name = "connector6TetheredCable")
    @Type(type = "text")
    private String  connector6TetheredCable;
    @Column(name = "connector6Status")
    @Type(type = "text")
    private String  connector6Status;
    @Column(name = "connector6Description")
    @Type(type = "text")
    private String  connector6Description;
    @Column(name = "connector6Validated")
    @Type(type = "text")
    private String  connector6Validated;
    @Column(name = "connector7ID")
    @Type(type = "text")
    private String  connector7ID;
    @Column(name = "connector7Type")
    @Type(type = "text")
    private String  connector7Type;
    @Column(name = "connector7RatedOutputKW")
    @Type(type = "text")
    private String  connector7RatedOutputKW;
    @Column(name = "connector7OutputCurrent")
    @Type(type = "text")
    private String  connector7OutputCurrent;
    @Column(name = "connector7RatedVoltage")
    @Type(type = "text")
    private String  connector7RatedVoltage;
    @Column(name = "connector7ChargeMethod")
    @Type(type = "text")
    private String  connector7ChargeMethod;
    @Column(name = "connector7ChargeMode")
    @Type(type = "text")
    private String  connector7ChargeMode;
    @Column(name = "connector7TetheredCable")
    @Type(type = "text")
    private String  connector7TetheredCable;
    @Column(name = "connector7Status")
    @Type(type = "text")
    private String  connector7Status;
    @Column(name = "connector7Description")
    @Type(type = "text")
    private String  connector7Description;
    @Column(name = "connector7Validated")
    @Type(type = "text")
    private String  connector7Validated;
    @Column(name = "connector8ID")
    @Type(type = "text")
    private String  connector8ID;
    @Column(name = "connector8Type")
    @Type(type = "text")
    private String  connector8Type;
    @Column(name = "connector8RatedOutputKW")
    @Type(type = "text")
    private String  connector8RatedOutputKW;
    @Column(name = "connector8OutputCurrent")
    @Type(type = "text")
    private String  connector8OutputCurrent;
    @Column(name = "connector8RatedVoltage")
    @Type(type = "text")
    private String  connector8RatedVoltage;
    @Column(name = "connector8ChargeMethod")
    @Type(type = "text")
    private String  connector8ChargeMethod;
    @Column(name = "connector8ChargeMode")
    @Type(type = "text")
    private String  connector8ChargeMode;
    @Column(name = "connector8TetheredCable")
    @Type(type = "text")
    private String  connector8TetheredCable;
    @Column(name = "connector8Status")
    @Type(type = "text")
    private String  connector8Status;
    @Column(name = "connector8Description")
    @Type(type = "text")
    private String  connector8Description;
    @Column(name = "connector8Validated")
    @Type(type = "text")
    private String  connector8Validated;
    
    public String getChargeDeviceID() {
        return chargeDeviceID;
    }
    
    public void setChargeDeviceID(String chargeDeviceID) {
        this.chargeDeviceID = chargeDeviceID;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public String getSubBuildingName() {
        return subBuildingName;
    }
    
    public void setSubBuildingName(String subBuildingName) {
        this.subBuildingName = subBuildingName;
    }
    
    public String getBuildingName() {
        return buildingName;
    }
    
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    
    public String getBuildingNumber() {
        return buildingNumber;
    }
    
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
    
    public String getThoroughfare() {
        return thoroughfare;
    }
    
    public void setThoroughfare(String thoroughfare) {
        this.thoroughfare = thoroughfare;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getDoubleDependantLocality() {
        return doubleDependantLocality;
    }
    
    public void setDoubleDependantLocality(String doubleDependantLocality) {
        this.doubleDependantLocality = doubleDependantLocality;
    }
    
    public String getDependantLocality() {
        return dependantLocality;
    }
    
    public void setDependantLocality(String dependantLocality) {
        this.dependantLocality = dependantLocality;
    }
    
    public String getTown() {
        return town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }
    
    public String getCounty() {
        return county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getUprn() {
        return uprn;
    }
    
    public void setUprn(String uprn) {
        this.uprn = uprn;
    }
    
    public String getDeviceDescription() {
        return deviceDescription;
    }
    
    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }
    
    public String getLocationShortDescription() {
        return locationShortDescription;
    }
    
    public void setLocationShortDescription(String locationShortDescription) {
        this.locationShortDescription = locationShortDescription;
    }
    
    public String getLocationLongDescription() {
        return locationLongDescription;
    }
    
    public void setLocationLongDescription(String locationLongDescription) {
        this.locationLongDescription = locationLongDescription;
    }
    
    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }
    
    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }
    
    public String getDeviceModel() {
        return deviceModel;
    }
    
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    
    public String getDeviceOwnerName() {
        return deviceOwnerName;
    }
    
    public void setDeviceOwnerName(String deviceOwnerName) {
        this.deviceOwnerName = deviceOwnerName;
    }
    
    public String getDeviceOwnerWebsite() {
        return deviceOwnerWebsite;
    }
    
    public void setDeviceOwnerWebsite(String deviceOwnerWebsite) {
        this.deviceOwnerWebsite = deviceOwnerWebsite;
    }
    
    public String getDeviceOwnerTelephoneNo() {
        return deviceOwnerTelephoneNo;
    }
    
    public void setDeviceOwnerTelephoneNo(String deviceOwnerTelephoneNo) {
        this.deviceOwnerTelephoneNo = deviceOwnerTelephoneNo;
    }
    
    public String getDeviceOwnerContactName() {
        return deviceOwnerContactName;
    }
    
    public void setDeviceOwnerContactName(String deviceOwnerContactName) {
        this.deviceOwnerContactName = deviceOwnerContactName;
    }
    
    public String getDeviceControllerName() {
        return deviceControllerName;
    }
    
    public void setDeviceControllerName(String deviceControllerName) {
        this.deviceControllerName = deviceControllerName;
    }
    
    public String getDeviceControllerWebsite() {
        return deviceControllerWebsite;
    }
    
    public void setDeviceControllerWebsite(String deviceControllerWebsite) {
        this.deviceControllerWebsite = deviceControllerWebsite;
    }
    
    public String getDeviceControllerTelephoneNo() {
        return deviceControllerTelephoneNo;
    }
    
    public void setDeviceControllerTelephoneNo(String deviceControllerTelephoneNo) {
        this.deviceControllerTelephoneNo = deviceControllerTelephoneNo;
    }
    
    public String getDeviceControllerContactName() {
        return deviceControllerContactName;
    }
    
    public void setDeviceControllerContactName(String deviceControllerContactName) {
        this.deviceControllerContactName = deviceControllerContactName;
    }
    
    public String getDeviceNetworks() {
        return deviceNetworks;
    }
    
    public void setDeviceNetworks(String deviceNetworks) {
        this.deviceNetworks = deviceNetworks;
    }
    
    public String getChargeDeviceStatus() {
        return chargeDeviceStatus;
    }
    
    public void setChargeDeviceStatus(String chargeDeviceStatus) {
        this.chargeDeviceStatus = chargeDeviceStatus;
    }
    
    public String getPublishStatus() {
        return publishStatus;
    }
    
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }
    
    public String getDeviceValidated() {
        return deviceValidated;
    }
    
    public void setDeviceValidated(String deviceValidated) {
        this.deviceValidated = deviceValidated;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }
    
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public String getDateUpdated() {
        return dateUpdated;
    }
    
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    public String getModerated() {
        return moderated;
    }
    
    public void setModerated(String moderated) {
        this.moderated = moderated;
    }
    
    public String getLastUpdated() {
        return lastUpdated;
    }
    
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    public String getAttribution() {
        return attribution;
    }
    
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }
    
    public String getDateDeleted() {
        return dateDeleted;
    }
    
    public void setDateDeleted(String dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
    
    public String getPaymentRequired() {
        return paymentRequired;
    }
    
    public void setPaymentRequired(String paymentRequired) {
        this.paymentRequired = paymentRequired;
    }
    
    public String getPaymentRequiredDetails() {
        return paymentRequiredDetails;
    }
    
    public void setPaymentRequiredDetails(String paymentRequiredDetails) {
        this.paymentRequiredDetails = paymentRequiredDetails;
    }
    
    public String getSubscriptionRequired() {
        return subscriptionRequired;
    }
    
    public void setSubscriptionRequired(String subscriptionRequired) {
        this.subscriptionRequired = subscriptionRequired;
    }
    
    public String getSubscriptionRequiredDetails() {
        return subscriptionRequiredDetails;
    }
    
    public void setSubscriptionRequiredDetails(String subscriptionRequiredDetails) {
        this.subscriptionRequiredDetails = subscriptionRequiredDetails;
    }
    
    public String getParkingFeesFlag() {
        return parkingFeesFlag;
    }
    
    public void setParkingFeesFlag(String parkingFeesFlag) {
        this.parkingFeesFlag = parkingFeesFlag;
    }
    
    public String getParkingFeesDetails() {
        return parkingFeesDetails;
    }
    
    public void setParkingFeesDetails(String parkingFeesDetails) {
        this.parkingFeesDetails = parkingFeesDetails;
    }
    
    public String getParkingFeesUrl() {
        return parkingFeesUrl;
    }
    
    public void setParkingFeesUrl(String parkingFeesUrl) {
        this.parkingFeesUrl = parkingFeesUrl;
    }
    
    public String getAccessRestrictionFlag() {
        return accessRestrictionFlag;
    }
    
    public void setAccessRestrictionFlag(String accessRestrictionFlag) {
        this.accessRestrictionFlag = accessRestrictionFlag;
    }
    
    public String getAccessRestrictionDetails() {
        return accessRestrictionDetails;
    }
    
    public void setAccessRestrictionDetails(String accessRestrictionDetails) {
        this.accessRestrictionDetails = accessRestrictionDetails;
    }
    
    public String getPhysicalRestrictionFlag() {
        return physicalRestrictionFlag;
    }
    
    public void setPhysicalRestrictionFlag(String physicalRestrictionFlag) {
        this.physicalRestrictionFlag = physicalRestrictionFlag;
    }
    
    public String getPhysicalRestrictionText() {
        return physicalRestrictionText;
    }
    
    public void setPhysicalRestrictionText(String physicalRestrictionText) {
        this.physicalRestrictionText = physicalRestrictionText;
    }
    
    public String getOnStreetFlag() {
        return onStreetFlag;
    }
    
    public void setOnStreetFlag(String onStreetFlag) {
        this.onStreetFlag = onStreetFlag;
    }
    
    public String getLocationType() {
        return locationType;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
    
    public String getBearing() {
        return bearing;
    }
    
    public void setBearing(String bearing) {
        this.bearing = bearing;
    }
    
    public String getAccess24Hours() {
        return access24Hours;
    }
    
    public void setAccess24Hours(String access24Hours) {
        this.access24Hours = access24Hours;
    }
    
    public String getAccessMondayFrom() {
        return accessMondayFrom;
    }
    
    public void setAccessMondayFrom(String accessMondayFrom) {
        this.accessMondayFrom = accessMondayFrom;
    }
    
    public String getAccessMondayTo() {
        return accessMondayTo;
    }
    
    public void setAccessMondayTo(String accessMondayTo) {
        this.accessMondayTo = accessMondayTo;
    }
    
    public String getAccessTuesdayFrom() {
        return accessTuesdayFrom;
    }
    
    public void setAccessTuesdayFrom(String accessTuesdayFrom) {
        this.accessTuesdayFrom = accessTuesdayFrom;
    }
    
    public String getAccessTuesdayTo() {
        return accessTuesdayTo;
    }
    
    public void setAccessTuesdayTo(String accessTuesdayTo) {
        this.accessTuesdayTo = accessTuesdayTo;
    }
    
    public String getAccessWednesdayFrom() {
        return accessWednesdayFrom;
    }
    
    public void setAccessWednesdayFrom(String accessWednesdayFrom) {
        this.accessWednesdayFrom = accessWednesdayFrom;
    }
    
    public String getAccessWednesdayTo() {
        return accessWednesdayTo;
    }
    
    public void setAccessWednesdayTo(String accessWednesdayTo) {
        this.accessWednesdayTo = accessWednesdayTo;
    }
    
    public String getAccessThursdayFrom() {
        return accessThursdayFrom;
    }
    
    public void setAccessThursdayFrom(String accessThursdayFrom) {
        this.accessThursdayFrom = accessThursdayFrom;
    }
    
    public String getAccessThursdayTo() {
        return accessThursdayTo;
    }
    
    public void setAccessThursdayTo(String accessThursdayTo) {
        this.accessThursdayTo = accessThursdayTo;
    }
    
    public String getAccessFridayFrom() {
        return accessFridayFrom;
    }
    
    public void setAccessFridayFrom(String accessFridayFrom) {
        this.accessFridayFrom = accessFridayFrom;
    }
    
    public String getAccessFridayTo() {
        return accessFridayTo;
    }
    
    public void setAccessFridayTo(String accessFridayTo) {
        this.accessFridayTo = accessFridayTo;
    }
    
    public String getAccessSaturdayFrom() {
        return accessSaturdayFrom;
    }
    
    public void setAccessSaturdayFrom(String accessSaturdayFrom) {
        this.accessSaturdayFrom = accessSaturdayFrom;
    }
    
    public String getAccessSaturdayTo() {
        return accessSaturdayTo;
    }
    
    public void setAccessSaturdayTo(String accessSaturdayTo) {
        this.accessSaturdayTo = accessSaturdayTo;
    }
    
    public String getAccessSundayFrom() {
        return accessSundayFrom;
    }
    
    public void setAccessSundayFrom(String accessSundayFrom) {
        this.accessSundayFrom = accessSundayFrom;
    }
    
    public String getAccessSundayTo() {
        return accessSundayTo;
    }
    
    public void setAccessSundayTo(String accessSundayTo) {
        this.accessSundayTo = accessSundayTo;
    }
    
    public String getConnector1ID() {
        return connector1ID;
    }
    
    public void setConnector1ID(String connector1id) {
        connector1ID = connector1id;
    }
    
    public String getConnector1Type() {
        return connector1Type;
    }
    
    public void setConnector1Type(String connector1Type) {
        this.connector1Type = connector1Type;
    }
    
    public double getConnector1RatedOutputKW() {
        return connector1RatedOutputKW;
    }
    
    public void setConnector1RatedOutputKW(double connector1RatedOutputKW) {
        this.connector1RatedOutputKW = connector1RatedOutputKW;
    }
    
    public String getConnector1OutputCurrent() {
        return connector1OutputCurrent;
    }
    
    public void setConnector1OutputCurrent(String connector1OutputCurrent) {
        this.connector1OutputCurrent = connector1OutputCurrent;
    }
    
    public String getConnector1RatedVoltage() {
        return connector1RatedVoltage;
    }
    
    public void setConnector1RatedVoltage(String connector1RatedVoltage) {
        this.connector1RatedVoltage = connector1RatedVoltage;
    }
    
    public String getConnector1ChargeMethod() {
        return connector1ChargeMethod;
    }
    
    public void setConnector1ChargeMethod(String connector1ChargeMethod) {
        this.connector1ChargeMethod = connector1ChargeMethod;
    }
    
    public String getConnector1ChargeMode() {
        return connector1ChargeMode;
    }
    
    public void setConnector1ChargeMode(String connector1ChargeMode) {
        this.connector1ChargeMode = connector1ChargeMode;
    }
    
    public String getConnector1TetheredCable() {
        return connector1TetheredCable;
    }
    
    public void setConnector1TetheredCable(String connector1TetheredCable) {
        this.connector1TetheredCable = connector1TetheredCable;
    }
    
    public String getConnector1Status() {
        return connector1Status;
    }
    
    public void setConnector1Status(String connector1Status) {
        this.connector1Status = connector1Status;
    }
    
    public String getConnector1Description() {
        return connector1Description;
    }
    
    public void setConnector1Description(String connector1Description) {
        this.connector1Description = connector1Description;
    }
    
    public String getConnector1Validated() {
        return connector1Validated;
    }
    
    public void setConnector1Validated(String connector1Validated) {
        this.connector1Validated = connector1Validated;
    }
    
    public String getConnector2ID() {
        return connector2ID;
    }
    
    public void setConnector2ID(String connector2id) {
        connector2ID = connector2id;
    }
    
    public String getConnector2Type() {
        return connector2Type;
    }
    
    public void setConnector2Type(String connector2Type) {
        this.connector2Type = connector2Type;
    }
    
    public String getConnector2RatedOutputKW() {
        return connector2RatedOutputKW;
    }
    
    public void setConnector2RatedOutputKW(String connector2RatedOutputKW) {
        this.connector2RatedOutputKW = connector2RatedOutputKW;
    }
    
    public String getConnector2OutputCurrent() {
        return connector2OutputCurrent;
    }
    
    public void setConnector2OutputCurrent(String connector2OutputCurrent) {
        this.connector2OutputCurrent = connector2OutputCurrent;
    }
    
    public String getConnector2RatedVoltage() {
        return connector2RatedVoltage;
    }
    
    public void setConnector2RatedVoltage(String connector2RatedVoltage) {
        this.connector2RatedVoltage = connector2RatedVoltage;
    }
    
    public String getConnector2ChargeMethod() {
        return connector2ChargeMethod;
    }
    
    public void setConnector2ChargeMethod(String connector2ChargeMethod) {
        this.connector2ChargeMethod = connector2ChargeMethod;
    }
    
    public String getConnector2ChargeMode() {
        return connector2ChargeMode;
    }
    
    public void setConnector2ChargeMode(String connector2ChargeMode) {
        this.connector2ChargeMode = connector2ChargeMode;
    }
    
    public String getConnector2TetheredCable() {
        return connector2TetheredCable;
    }
    
    public void setConnector2TetheredCable(String connector2TetheredCable) {
        this.connector2TetheredCable = connector2TetheredCable;
    }
    
    public String getConnector2Status() {
        return connector2Status;
    }
    
    public void setConnector2Status(String connector2Status) {
        this.connector2Status = connector2Status;
    }
    
    public String getConnector2Description() {
        return connector2Description;
    }
    
    public void setConnector2Description(String connector2Description) {
        this.connector2Description = connector2Description;
    }
    
    public String getConnector3Validated1() {
        return connector3Validated1;
    }
    
    public void setConnector3Validated1(String connector3Validated1) {
        this.connector3Validated1 = connector3Validated1;
    }
    
    public String getConnector3ID() {
        return connector3ID;
    }
    
    public void setConnector3ID(String connector3id) {
        connector3ID = connector3id;
    }
    
    public String getConnector3Type() {
        return connector3Type;
    }
    
    public void setConnector3Type(String connector3Type) {
        this.connector3Type = connector3Type;
    }
    
    public String getConnector3RatedOutputKW() {
        return connector3RatedOutputKW;
    }
    
    public void setConnector3RatedOutputKW(String connector3RatedOutputKW) {
        this.connector3RatedOutputKW = connector3RatedOutputKW;
    }
    
    public String getConnector3OutputCurrent() {
        return connector3OutputCurrent;
    }
    
    public void setConnector3OutputCurrent(String connector3OutputCurrent) {
        this.connector3OutputCurrent = connector3OutputCurrent;
    }
    
    public String getConnector3RatedVoltage() {
        return connector3RatedVoltage;
    }
    
    public void setConnector3RatedVoltage(String connector3RatedVoltage) {
        this.connector3RatedVoltage = connector3RatedVoltage;
    }
    
    public String getConnector3ChargeMethod() {
        return connector3ChargeMethod;
    }
    
    public void setConnector3ChargeMethod(String connector3ChargeMethod) {
        this.connector3ChargeMethod = connector3ChargeMethod;
    }
    
    public String getConnector3ChargeMode() {
        return connector3ChargeMode;
    }
    
    public void setConnector3ChargeMode(String connector3ChargeMode) {
        this.connector3ChargeMode = connector3ChargeMode;
    }
    
    public String getConnector3TetheredCable() {
        return connector3TetheredCable;
    }
    
    public void setConnector3TetheredCable(String connector3TetheredCable) {
        this.connector3TetheredCable = connector3TetheredCable;
    }
    
    public String getConnector3Status() {
        return connector3Status;
    }
    
    public void setConnector3Status(String connector3Status) {
        this.connector3Status = connector3Status;
    }
    
    public String getConnector3Description() {
        return connector3Description;
    }
    
    public void setConnector3Description(String connector3Description) {
        this.connector3Description = connector3Description;
    }
    
    public String getConnector3Validated() {
        return connector3Validated;
    }
    
    public void setConnector3Validated(String connector3Validated) {
        this.connector3Validated = connector3Validated;
    }
    
    public String getConnector4ID() {
        return connector4ID;
    }
    
    public void setConnector4ID(String connector4id) {
        connector4ID = connector4id;
    }
    
    public String getConnector4Type() {
        return connector4Type;
    }
    
    public void setConnector4Type(String connector4Type) {
        this.connector4Type = connector4Type;
    }
    
    public String getConnector4RatedOutputKW() {
        return connector4RatedOutputKW;
    }
    
    public void setConnector4RatedOutputKW(String connector4RatedOutputKW) {
        this.connector4RatedOutputKW = connector4RatedOutputKW;
    }
    
    public String getConnector4OutputCurrent() {
        return connector4OutputCurrent;
    }
    
    public void setConnector4OutputCurrent(String connector4OutputCurrent) {
        this.connector4OutputCurrent = connector4OutputCurrent;
    }
    
    public String getConnector4RatedVoltage() {
        return connector4RatedVoltage;
    }
    
    public void setConnector4RatedVoltage(String connector4RatedVoltage) {
        this.connector4RatedVoltage = connector4RatedVoltage;
    }
    
    public String getConnector4ChargeMethod() {
        return connector4ChargeMethod;
    }
    
    public void setConnector4ChargeMethod(String connector4ChargeMethod) {
        this.connector4ChargeMethod = connector4ChargeMethod;
    }
    
    public String getConnector4ChargeMode() {
        return connector4ChargeMode;
    }
    
    public void setConnector4ChargeMode(String connector4ChargeMode) {
        this.connector4ChargeMode = connector4ChargeMode;
    }
    
    public String getConnector4TetheredCable() {
        return connector4TetheredCable;
    }
    
    public void setConnector4TetheredCable(String connector4TetheredCable) {
        this.connector4TetheredCable = connector4TetheredCable;
    }
    
    public String getConnector4Status() {
        return connector4Status;
    }
    
    public void setConnector4Status(String connector4Status) {
        this.connector4Status = connector4Status;
    }
    
    public String getConnector4Description() {
        return connector4Description;
    }
    
    public void setConnector4Description(String connector4Description) {
        this.connector4Description = connector4Description;
    }
    
    public String getConnector4Validated() {
        return connector4Validated;
    }
    
    public void setConnector4Validated(String connector4Validated) {
        this.connector4Validated = connector4Validated;
    }
    
    public String getConnector5ID() {
        return connector5ID;
    }
    
    public void setConnector5ID(String connector5id) {
        connector5ID = connector5id;
    }
    
    public String getConnector5Type() {
        return connector5Type;
    }
    
    public void setConnector5Type(String connector5Type) {
        this.connector5Type = connector5Type;
    }
    
    public String getConnector5RatedOutputKW() {
        return connector5RatedOutputKW;
    }
    
    public void setConnector5RatedOutputKW(String connector5RatedOutputKW) {
        this.connector5RatedOutputKW = connector5RatedOutputKW;
    }
    
    public String getConnector5OutputCurrent() {
        return connector5OutputCurrent;
    }
    
    public void setConnector5OutputCurrent(String connector5OutputCurrent) {
        this.connector5OutputCurrent = connector5OutputCurrent;
    }
    
    public String getConnector5RatedVoltage() {
        return connector5RatedVoltage;
    }
    
    public void setConnector5RatedVoltage(String connector5RatedVoltage) {
        this.connector5RatedVoltage = connector5RatedVoltage;
    }
    
    public String getConnector5ChargeMethod() {
        return connector5ChargeMethod;
    }
    
    public void setConnector5ChargeMethod(String connector5ChargeMethod) {
        this.connector5ChargeMethod = connector5ChargeMethod;
    }
    
    public String getConnector5ChargeMode() {
        return connector5ChargeMode;
    }
    
    public void setConnector5ChargeMode(String connector5ChargeMode) {
        this.connector5ChargeMode = connector5ChargeMode;
    }
    
    public String getConnector5TetheredCable() {
        return connector5TetheredCable;
    }
    
    public void setConnector5TetheredCable(String connector5TetheredCable) {
        this.connector5TetheredCable = connector5TetheredCable;
    }
    
    public String getConnector5Status() {
        return connector5Status;
    }
    
    public void setConnector5Status(String connector5Status) {
        this.connector5Status = connector5Status;
    }
    
    public String getConnector5Description() {
        return connector5Description;
    }
    
    public void setConnector5Description(String connector5Description) {
        this.connector5Description = connector5Description;
    }
    
    public String getConnector5Validated() {
        return connector5Validated;
    }
    
    public void setConnector5Validated(String connector5Validated) {
        this.connector5Validated = connector5Validated;
    }
    
    public String getConnector6ID() {
        return connector6ID;
    }
    
    public void setConnector6ID(String connector6id) {
        connector6ID = connector6id;
    }
    
    public String getConnector6Type() {
        return connector6Type;
    }
    
    public void setConnector6Type(String connector6Type) {
        this.connector6Type = connector6Type;
    }
    
    public String getConnector6RatedOutputKW() {
        return connector6RatedOutputKW;
    }
    
    public void setConnector6RatedOutputKW(String connector6RatedOutputKW) {
        this.connector6RatedOutputKW = connector6RatedOutputKW;
    }
    
    public String getConnector6OutputCurrent() {
        return connector6OutputCurrent;
    }
    
    public void setConnector6OutputCurrent(String connector6OutputCurrent) {
        this.connector6OutputCurrent = connector6OutputCurrent;
    }
    
    public String getConnector6RatedVoltage() {
        return connector6RatedVoltage;
    }
    
    public void setConnector6RatedVoltage(String connector6RatedVoltage) {
        this.connector6RatedVoltage = connector6RatedVoltage;
    }
    
    public String getConnector6ChargeMethod() {
        return connector6ChargeMethod;
    }
    
    public void setConnector6ChargeMethod(String connector6ChargeMethod) {
        this.connector6ChargeMethod = connector6ChargeMethod;
    }
    
    public String getConnector6ChargeMode() {
        return connector6ChargeMode;
    }
    
    public void setConnector6ChargeMode(String connector6ChargeMode) {
        this.connector6ChargeMode = connector6ChargeMode;
    }
    
    public String getConnector6TetheredCable() {
        return connector6TetheredCable;
    }
    
    public void setConnector6TetheredCable(String connector6TetheredCable) {
        this.connector6TetheredCable = connector6TetheredCable;
    }
    
    public String getConnector6Status() {
        return connector6Status;
    }
    
    public void setConnector6Status(String connector6Status) {
        this.connector6Status = connector6Status;
    }
    
    public String getConnector6Description() {
        return connector6Description;
    }
    
    public void setConnector6Description(String connector6Description) {
        this.connector6Description = connector6Description;
    }
    
    public String getConnector6Validated() {
        return connector6Validated;
    }
    
    public void setConnector6Validated(String connector6Validated) {
        this.connector6Validated = connector6Validated;
    }
    
    public String getConnector7ID() {
        return connector7ID;
    }
    
    public void setConnector7ID(String connector7id) {
        connector7ID = connector7id;
    }
    
    public String getConnector7Type() {
        return connector7Type;
    }
    
    public void setConnector7Type(String connector7Type) {
        this.connector7Type = connector7Type;
    }
    
    public String getConnector7RatedOutputKW() {
        return connector7RatedOutputKW;
    }
    
    public void setConnector7RatedOutputKW(String connector7RatedOutputKW) {
        this.connector7RatedOutputKW = connector7RatedOutputKW;
    }
    
    public String getConnector7OutputCurrent() {
        return connector7OutputCurrent;
    }
    
    public void setConnector7OutputCurrent(String connector7OutputCurrent) {
        this.connector7OutputCurrent = connector7OutputCurrent;
    }
    
    public String getConnector7RatedVoltage() {
        return connector7RatedVoltage;
    }
    
    public void setConnector7RatedVoltage(String connector7RatedVoltage) {
        this.connector7RatedVoltage = connector7RatedVoltage;
    }
    
    public String getConnector7ChargeMethod() {
        return connector7ChargeMethod;
    }
    
    public void setConnector7ChargeMethod(String connector7ChargeMethod) {
        this.connector7ChargeMethod = connector7ChargeMethod;
    }
    
    public String getConnector7ChargeMode() {
        return connector7ChargeMode;
    }
    
    public void setConnector7ChargeMode(String connector7ChargeMode) {
        this.connector7ChargeMode = connector7ChargeMode;
    }
    
    public String getConnector7TetheredCable() {
        return connector7TetheredCable;
    }
    
    public void setConnector7TetheredCable(String connector7TetheredCable) {
        this.connector7TetheredCable = connector7TetheredCable;
    }
    
    public String getConnector7Status() {
        return connector7Status;
    }
    
    public void setConnector7Status(String connector7Status) {
        this.connector7Status = connector7Status;
    }
    
    public String getConnector7Description() {
        return connector7Description;
    }
    
    public void setConnector7Description(String connector7Description) {
        this.connector7Description = connector7Description;
    }
    
    public String getConnector7Validated() {
        return connector7Validated;
    }
    
    public void setConnector7Validated(String connector7Validated) {
        this.connector7Validated = connector7Validated;
    }
    
    public String getConnector8ID() {
        return connector8ID;
    }
    
    public void setConnector8ID(String connector8id) {
        connector8ID = connector8id;
    }
    
    public String getConnector8Type() {
        return connector8Type;
    }
    
    public void setConnector8Type(String connector8Type) {
        this.connector8Type = connector8Type;
    }
    
    public String getConnector8RatedOutputKW() {
        return connector8RatedOutputKW;
    }
    
    public void setConnector8RatedOutputKW(String connector8RatedOutputKW) {
        this.connector8RatedOutputKW = connector8RatedOutputKW;
    }
    
    public String getConnector8OutputCurrent() {
        return connector8OutputCurrent;
    }
    
    public void setConnector8OutputCurrent(String connector8OutputCurrent) {
        this.connector8OutputCurrent = connector8OutputCurrent;
    }
    
    public String getConnector8RatedVoltage() {
        return connector8RatedVoltage;
    }
    
    public void setConnector8RatedVoltage(String connector8RatedVoltage) {
        this.connector8RatedVoltage = connector8RatedVoltage;
    }
    
    public String getConnector8ChargeMethod() {
        return connector8ChargeMethod;
    }
    
    public void setConnector8ChargeMethod(String connector8ChargeMethod) {
        this.connector8ChargeMethod = connector8ChargeMethod;
    }
    
    public String getConnector8ChargeMode() {
        return connector8ChargeMode;
    }
    
    public void setConnector8ChargeMode(String connector8ChargeMode) {
        this.connector8ChargeMode = connector8ChargeMode;
    }
    
    public String getConnector8TetheredCable() {
        return connector8TetheredCable;
    }
    
    public void setConnector8TetheredCable(String connector8TetheredCable) {
        this.connector8TetheredCable = connector8TetheredCable;
    }
    
    public String getConnector8Status() {
        return connector8Status;
    }
    
    public void setConnector8Status(String connector8Status) {
        this.connector8Status = connector8Status;
    }
    
    public String getConnector8Description() {
        return connector8Description;
    }
    
    public void setConnector8Description(String connector8Description) {
        this.connector8Description = connector8Description;
    }
    
    public String getConnector8Validated() {
        return connector8Validated;
    }
    
    public void setConnector8Validated(String connector8Validated) {
        this.connector8Validated = connector8Validated;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    
    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }


    protected NationalChargePointRegistry() {
    }
    
}
