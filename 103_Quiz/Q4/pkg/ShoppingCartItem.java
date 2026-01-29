package pkg;
import java.util.*;

public class ShoppingCartItem {
String name;
double price;
int quantity;

public ShoppingCartItem(){
    name = "";
    price = 0;
    quantity = 0;
   }
public ShoppingCartItem(String a, double p, int q){
       name = a;
       price = p;
       quantity = q;
   }
 public  void cartToString(){
     System.out.println("You have"+quantity+"of"+name+"for"+price);
     
 }
 public double getItemPrice(){
     return price;
 }
 public String getItemName(){
     return name;
 }
  public int getQuantity(){
    return quantity;
}
 public double getTotalWithTax(){
    double total = quantity*price;
    double tax = total*0.12;
    double ohio = total+tax;
    
    return ohio;
    
}
public double quantityToCostCalculator(int g){
    double comp = g*price;
    return comp;
    
    
}
public boolean compareItemCost(ShoppingCartItem b){
    if(b.getItemPrice()>price){
        return true;
        
    }
    else{
        return false;
    }
    }
}
