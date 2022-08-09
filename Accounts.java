import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "saldo")
    private double saldo;

    @ManyToOne
    @JoinColumn(name = "client_ref", referencedColumnName = "id")
    private Clients clientRef;

    @Column(name = "open_date")
    private Date openDate;

    @Column(name = "close_date")
    private Date closeDate;

    @ManyToOne
    @JoinColumn(name = "product_ref", referencedColumnName = "id")
    private Products productsRef;

    @Column(name = "acc_num")
    private String accNum;

    public Accounts() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public Clients getClientRef() {
        return clientRef;
    }

    public void setClientRef(Clients clientRef) {
        this.clientRef = clientRef;
    }

    public Products getProductsRef() {
        return productsRef;
    }

    public void setProductsRef(Products productsRef) {
        this.productsRef = productsRef;
    }
}
