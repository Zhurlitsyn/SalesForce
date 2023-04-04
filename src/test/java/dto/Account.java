package dto;

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

    public Account() {

    }

    public Account(String accountName, String fax, String phone, String website,
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getParentAcc() {
        return parentAcc;
    }

    public void setParentAcc(String parentAcc) {
        this.parentAcc = parentAcc;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public String getBillZip() {
        return billZip;
    }

    public void setBillZip(String billZip) {
        this.billZip = billZip;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipState() {
        return shipState;
    }

    public void setShipState(String shipState) {
        this.shipState = shipState;
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillStreet() {
        return billStreet;
    }

    public void setBillStreet(String billStreet) {
        this.billStreet = billStreet;
    }

    public String getShipStreet() {
        return shipStreet;
    }

    public void setShipStreet(String shipStreet) {
        this.shipStreet = shipStreet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}