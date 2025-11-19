import java.awt.*;
import java.awt.event.*;
 
 class lab8p1 extends Frame{
  
   super ("Demonistration of MenuBar");
   
       MenuBar mb = new MenuBar();
       setMenuBar(mb);
       
       Menufile = new Menu ("flle");
       
       String[] menu = {"File","edit","help"};
       String[] file = {"open","save","close",};
                       {"cut","copy","paste"};
                       {"About","Update","License");
                       
          }
          
           int x = 0  , y = 0;
       
       for(Strings s : Menus);
          y = 0;
          
       Menu m = new Menu(s);
       
       s = s.toLowercase(){
          for(Sting ms : s);  
                    m.add(new MenuItem(mi [x][y]))); 
                     y++;
         }
          x++; 
          
            mb.add(m);
            
      
       }
       
       Setsize(200,300);
       Setvisible(true);
       
       addwindowListner(new windowAdapter();     
           public void windowclosing(windowEvent we){
              dispose();
           
            } 
       
       });
 
  }
  
  public static void main(strings[] args){
    new lab8p1();
    
    }
}   

      public static viod Actionperformence(ActionListener we);
      String mstr = ae.getActionCommand();
      if (mstr.equla("close")){
      
         System.exit();
         
         }
         else {
         
         }
     }   
}     
