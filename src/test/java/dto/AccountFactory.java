package dto;

import com.github.javafaker.Faker;

import java.util.Random;

public class AccountFactory {

  public static String[] listType = {"Prospect", "Customer - Direct", "Customer - Channel",
          "Channel Partner / Reseller", "Installation Partner",
          "Technology Partner", "Other"};
  public static String[] listIndustry = {"Agriculture", "Apparel", "Banking",
          "Biotechnology", "Chemicals", "Communications", "Other"};
  public static String[] listRating = {"Hot", "Warm", "Cold"};
  public static String[] listCustomerPriority = {"Low", "High", "Medium"};
  public static String[] listActive = {"No", "Yes"};
  public static String[] listUpsellOpportunity = {"Maybe", "No", "Yes"};
  public static String[] listSLA = {"Gold", "Silver", "Platinum", "Bronze"};
  public static String[] listOwnership = {"Public", "Private", "Subsidiary"};
  public static Random random = new Random();
  public static String choice;

  static String getRandomStringData(String[] list) {
    choice = "";
    return choice = list[random.nextInt(list.length)];
  }



    public Account getRandom() {
      Account account = new Account();
      Faker faker = new Faker();
      account.setAccountName(faker.name().fullName());
      account.setAccountNumber(faker.number().digits(3));
      account.setAccountSite(faker.internet().domainName());
      account.setFax(faker.number().digits(8));
      account.setPhone(faker.number().digits(8));
      account.setEmployees(faker.number().digit());
      account.setWebsite(faker.internet().domainName());
      account.setAnnualRevenue(faker.number().digits(2));
      account.setTicketSymbol(faker.letterify("abcdefg", true));
      account.setSicCode(faker.number().digits(4));

      account.setBillStreet(faker.address().streetName());
      account.setBillCity(faker.address().cityName());
      account.setBillState(faker.address().state());
      account.setBillZip(faker.number().digits(5));
      account.setBillCountry(faker.address().country());

      account.setShipStreet(faker.address().streetName());
      account.setShipCity(faker.address().cityName());
      account.setShipState(faker.address().state());
      account.setShipZip(faker.number().digits(5));
      account.setShipCountry(faker.address().country());

      account.setDescription(faker.letterify("What a wonderful world"));
      account.setType(getRandomStringData(listType));
      account.setIndustry(getRandomStringData(listIndustry));
      account.setRating(getRandomStringData(listRating));
      account.setOwnership(getRandomStringData(listOwnership));
      account.setCustomerPriority(getRandomStringData(listCustomerPriority));
      //account.setActive("Yes"); //(getRandomStringData(listActive));
      account.setUpsellOpportunity(getRandomStringData(listUpsellOpportunity));
      account.setSla(getRandomStringData(listSLA));
      account.setSlaExpirationDate("24.02.2022");
      account.setSlaSerialNumber(faker.number().digits(6));
      account.setNumberOfLocation(faker.number().digits(3));

      return account;
    }
}
