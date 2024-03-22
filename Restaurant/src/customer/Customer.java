
package customer;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public customer (CustomerRole role, String id, String fullname) {
    this.role = role;
    this.id = id;
    this.fullname = fullname;
    }
    
    void sayMene(){
        
    }
    void buyFood(){
        
    }
    void cancelBuy(){
        
    }
    
   public void sellFood(){
       if (this.role !=CustomerRole.ADMINISTRATIVE){
           System.out.println("usted no tiene permiso para verder");
       }
   }
   
   public void SellFood(){
      
   }
}



