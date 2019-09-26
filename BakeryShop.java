@testcontroller
public class BakeryShop{

  @GetMapping("/signup/{user}/{passwd}/{addr}")
  public int signUpNewCustomer(String username, String password, String address){
    int userID = bakeryDB.getMaxID()+1;
    
    bakeryDB.svae(userID, username, password, address);
    
    return userID;
  }
  
@PostMapping("/order/{pastry}/{amount}/{userID}/{csrf}")
public String makeOrder(String pastry,int amount, int userID, String csrf){
  if (amount > 0) && csrf.equals("abc123"){
      bakeryDB.save(UserID, pastry, amount);
  }
return "THank you for ordering, your ID is " + bakeryDB.rand();
}

@GetMapping(".order/status/{userID}")
public String getOrders(int userID){
    return bakeryDB.runQuery("select * from orders where user="+Integer.toString(userID));
}

}
