package oops_j23;

 interface MULTI_INTERFACE {
    public void carspeed();
    public void bikeSpeed();   
   } 

interface interfaceecls {
    public void pigsound();
    public void stay();    
   } 

       class pig implements interfaceecls,MULTI_INTERFACE{
           public void pigsound(){
               System.out.println("this is the sound method of pig implent of interface");
           }
           public void stay(){
               System.out.println("this is the stay method of pig implent of interface");
           }
           public void carspeed(){
               System.out.println("this is the car speed method of pig implent of interface");
           }
              public void bikeSpeed(){
                System.out.println("this is the bike speed method of pig implent of interface");
            }
       
       
       }
       
class interfacee_runtime{
           public static void main(String[] args) {
               pig mypigg = new pig();
               mypigg.pigsound();
               mypigg.stay();
               mypigg.carspeed();
               mypigg.bikeSpeed();
           }
       }
