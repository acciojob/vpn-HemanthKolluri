// Note: Do not write @Enumerated annotation above CountryName in this model.
package java.com.driver.model;

import com.driver.model.CountryName;
import com.driver.model.ServiceProvider;
import com.driver.model.User;

import javax.persistence.*;

@Entity
@Table(name = "country")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    private com.driver.model.CountryName countryName;
    private String code;
    @JoinColumn
    @OneToOne
    private com.driver.model.User user;
    @JoinColumn
    @ManyToOne
    private com.driver.model.ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(Integer countryId, com.driver.model.CountryName countryName, String code, com.driver.model.User user, com.driver.model.ServiceProvider serviceProvider) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.code = code;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public com.driver.model.CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public com.driver.model.User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.driver.model.ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}