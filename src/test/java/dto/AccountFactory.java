package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public Account getRandom() {
      Account account = new Account();
      Faker faker = new Faker();
      account.setAccountName(faker.name().fullName());
      account.setFax(faker.number().digits(8));
      account.setPhone(faker.number().digits(8));
      account.setEmployee(faker.number().digit());
      account.setWebsite(faker.internet().domainName());
      account.setAnnualRevenue(faker.number().digits(2));
      account.setBillCity(faker.address().cityName());
      account.setBillState(faker.address().state());
      account.setBillZip(faker.number().digits(5));
      account.setBillCountry(faker.address().country());
      account.setBillStreet(faker.address().streetName());
      account.setShipCity(faker.address().cityName());
      account.setShipState(faker.address().state());
      account.setShipZip(faker.number().digits(5));
      account.setShipCountry(faker.address().country());
      account.setShipStreet(faker.address().streetName());

      account.setDescription(faker.letterify("What a wonderful world"));
      account.setType("Клиент");
      account.setIndustry("Химия");

      return account;
    }
}
