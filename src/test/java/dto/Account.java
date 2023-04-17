package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Account {
    // Account information block
    String accountName;
    String parentAccount; //search field
    String accountNumber;
    String accountSite;
    String type; //drop
    String industry; //drop
    String annualRevenue;
    String rating; //drop
    String phone;
    String fax;
    String website;
    String ticketSymbol;
    String ownership; //drop
    String employees;
    String sicCode;

//Address information
    String billStreet;
    String billZip;
    String billCity;
    String billState;
    String billCountry;

    String shipStreet;
    String shipZip;
    String shipCity;
    String shipState;
    String shipCountry;

    //Additional information
    String customerPriority; //drop
    String slaExpirationDate;
    String numberOfLocation;
    String active; //drop
    String sla; //drop
    String slaSerialNumber;
    String upsellOpportunity; //drop

    //Description information
    String description;

}