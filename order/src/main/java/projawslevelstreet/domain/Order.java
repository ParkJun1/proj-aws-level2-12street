package projawslevelstreet.domain;

import projawslevelstreet.domain.Ordered;
import projawslevelstreet.domain.OrderCanceled;
import projawslevelstreet.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void 대기고객에게알림메일발송(StockIncreased stockIncreased){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(stockIncreased.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void 주문상태갱신(Shipped shipped){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipped.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void 주문상태갱신(ShippingCanceled shippingCanceled){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(shippingCanceled.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
