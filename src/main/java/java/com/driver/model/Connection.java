package java.com.driver.model;

import com.driver.model.ServiceProvider;
import com.driver.model.User;

import javax.persistence.*;

@Entity
@Table(name = "connection")
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn
    @ManyToOne
    private com.driver.model.User user;

    @JoinColumn
    @ManyToOne
    private com.driver.model.ServiceProvider serviceProvider;

    public Connection() {
    }

    public Connection(int id, com.driver.model.User user, com.driver.model.ServiceProvider serviceProvider) {
        this.id = id;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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