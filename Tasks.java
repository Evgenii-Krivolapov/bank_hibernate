import org.hibernate.Session;

import java.util.List;

public class Tasks {

    public void deposit(Session session) { //Задача №4
        String hql = "From " + ProductType.class.getSimpleName() + " Where name = 'ДЕПОЗИТ'";
        List<ProductType> productTypeList = session.createQuery(hql).getResultList();
        for (ProductType productType : productTypeList) {
            System.out.println(productType.getName() + " - " + productType.getBeginDate() + " - " + productType.getEndDate());
            System.out.println(productType.getTarifs().getName() + " - " + productType.getTarifs().getCost());
        }
    }

    public void averageMovements(Session session) { //Задача №5
        String hql = "From " + Accounts.class.getSimpleName() + " Where open_date = '2017-08-01'";
        List<Accounts> account = session.createQuery(hql).getResultList();
        for (Accounts accounts : account) {
            System.out.println(accounts.getProductsRef().getName() + " - " + accounts.getProductsRef().getOpenDate() +
                    " - " + accounts.getProductsRef().getCloseDate());
        }
    }

    public void operationsPerMonth(Session session) { //Задача №6
        String hql = "From " + Records.class.getSimpleName() + " Where oper_date BETWEEN '2017-09-24' and '2017-10-24'";
        List<Records> records = session.createQuery(hql).getResultList();
        for (Records record : records) {
            System.out.println(record.getAccRef().getClientRef().getName() + " - " + record.getSum() + " - " +
                    record.getOperDate());
        }
    }

    public void repaidTheLoan(Session session) { //Задача №8
        String hql = "From " + Records.class.getSimpleName() + " Where dt = '1'";
        List<Records> records = session.createQuery(hql).getResultList();
        for (Records record : records) {
            System.out.println(record.getAccRef().getClientRef().getName() + " - " + record.getAccRef().getClientRef().getAddress()
                    + " - " + record.getAccRef().getClientRef().getPassport());
        }
    }
}
