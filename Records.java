import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "records")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dt")
    private int dt;

    @Column(name = "sum")
    private double sum;

    @ManyToOne
    @JoinColumn(name = "acc_ref", referencedColumnName = "id")
    private Accounts accRef;

    @Column(name = "oper_date")
    private Date operDate;

    public Records() {}

    public Records(int id, int dt, double sum, Accounts accRef, Date openDate) {
        this.id = id;
        this.dt = dt;
        this.sum = sum;
        this.accRef = accRef;
        this.operDate = openDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Accounts getAccRef() {
        return accRef;
    }

    public void setAccRef(Accounts accRef) {
        this.accRef = accRef;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }
}
