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
    String accountName;
    String fax;
    String phone;
    String employee;
    String website;
    String parentAcc;
    String annualRevenue;
    String billCity;
    String billState;
    String billZip;
    String billCountry;
    String shipCity;
    String shipState;
    String shipZip;
    String shipCountry;
    String description;
    String billStreet;
    String shipStreet;
    String type;
    String industry;


   /* public Account(String accountName, String fax, String phone, String website,
                   String parentAcc, String employee, String annualRevenue, String billCity,
                   String billState, String billZip, String billCountry, String shipCity,
                   String shipState, String shipZip, String shipCountry, String description,
                   String billStreet, String shipStreet, String type, String industry) {
        this.accountName = accountName;
        this.fax = fax;
        this.phone = phone;
        this.website = website;
        this.parentAcc = parentAcc;
        this.employee = employee;
        this.annualRevenue = annualRevenue;
        this.billCity = billCity;
        this.billState = billState;
        this.billZip = billZip;
        this.billCountry = billCountry;
        this.shipCity = shipCity;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.shipCountry = shipCountry;
        this.description = description;
        this.billStreet = billStreet;
        this.shipStreet = shipStreet;
        this.type = type;
        this.industry = industry;
    }
*/

}