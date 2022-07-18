import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class app {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Customer arr[] = new Customer[200];
    Item items[] = new Item[200];
    Bill Bill[] = new Bill[200];
    int cusid=-1,itemid=-1,billid=-1;
    int q = 0;
    String ItemArray[] = new String[200];
    for (int j = 0; ; j++)

    {
        System.out.println("1--> customer ceation");
        System.out.println("2--> Item creation");
        System.out.println("3--> Bill creation");
        System.out.println("4--> Customer list");
        System.out.println("5--> Item list");
        System.out.println("6--> Bill list");
        System.out.println("7--> Customer's bill");
        System.out.println("8--> Bill number's bill");
        System.out.println("9--> Customer's Total purchase ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");

        int ip = sc.nextInt();


switch (ip){

    case 1:       // create cutomer
          {
            System.out.print("Name: ");
            String Name = sc.next();
            System.out.print("Phone: ");
            String PhoneNo = sc.next();
            cusid++;
            arr[cusid] = new Customer(cusid, PhoneNo,Name);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
            break;
         }

    case 2:       //Item creation
         {
            System.out.print("Item Name:");
            String name=sc.next();
            System.out.print("cost:");
            int cos=sc.nextInt();
            itemid++;
            items[itemid]=new Item(itemid,name,cos);
            System.out.println("....................................................................................................................................");
         break;
        }
    case 3:       //Bill creation
        {

            int cost[] = new int [200];
            int total=0,no=0;
            String name=null;
            System.out.print("Customer Id:");
            int id=sc.nextInt();
            for(int i=0;i<=cusid;i++){
                if(id==arr[cusid].Id) name=arr[cusid].Name;
                break;
            }
            System.out.print("Item:");
            String Itemlist[] = new String[200];
            int i=0;
            while(true)
            {
                String itm=sc.next();
                if(itm.equals("0"))break;
                else Itemlist[i]=itm;
                i++;no++;
            }
            for(int l=0;l<=i;l++){
                    for(int k=0;k<=itemid;k++){
                        if((items[k].ItemName).equals(Itemlist[l])){
                            cost[l]=items[k].Itemcost;
                            total+=cost[l];
                        }
                    }
            }
            billid++;
            Bill[billid]=new Bill(billid,cusid,name,Itemlist,cost,no,total);
            //...........Display Bill.................
            System.out.println("ID: "+Bill[billid].Id+"                          "+Bill[billid].date);
            System.out.println("Customer ID:"+Bill[billid].CustomerID+"          "+Bill[billid].time);
            System.out.println("Customer Name: "+Bill[billid].Customername);
            System.out.println("Purchase details:");
            for(int l=0;l<i;l++){
                System.out.println(Itemlist[l]+"         "+cost[l]);
                    }
            System.out.println(Bill[billid].Totalno+"                         "+Bill[billid].Total);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");

        break;
        }

    case 4:       // List customers
        {
            System.out.println("ID     Name     PhoneNo");
            for(int i=0;i<=cusid;i++) {
                System.out.println(arr[i].Id + "     " + arr[i].Name + "     " + arr[i].PhoneNo);
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
        break;
        }
    case 5:       // Item list
        {
            System.out.println("ID     Product Name     Cost");
            for(int i=0;i<=itemid;i++) {
                System.out.println(items[i].Id+ "         " + items[i].ItemName + "             " + items[i].Itemcost);
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
        break;
        }

    case 6:      // bill list
        {
            for(int i=0;i<=billid;i++){
                System.out.println("ID: "+Bill[i].Id);
                System.out.println("Date :"+Bill[i].date);
                System.out.println("Time: "+Bill[i].time);
                System.out.println("Customer ID:"+Bill[i].CustomerID);
                System.out.println("Customer Name: "+Bill[i].Customername);
                System.out.println("Purchase details:");
                for(int l=0;l<Bill[i].Totalno;l++){
                    System.out.println(Bill[i].itm[l]+"         "+Bill[i].cost[l]);
                }
                System.out.println("Total product:"+Bill[i].Totalno+"                         "+Bill[i].Total);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
            }
        break;
        }
    case 7:         // Bills based on customers
        {
            System.out.println("Enter Customer ID:");
            int Id=sc.nextInt();
            for(int i=0;i<billid;i++){
                if(Id==Bill[i].CustomerID){
                    System.out.println("ID: "+Bill[i].Id+"                          "+Bill[i].date);
                    System.out.println("Customer ID:"+Bill[i].CustomerID+"          "+Bill[i].time);
                    System.out.println("Customer Name: "+Bill[i].Customername);
                    System.out.println("Purchase details:");
                    for(int l=0;l<Bill[i].Totalno;l++){
                        System.out.println(Bill[i].itm[l]+"         "+Bill[i].cost[l]);
                    }
                    System.out.println("Total product:"+Bill[i].Totalno+"                         "+Bill[i].Total);
                }
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
        break;
        }
    case 8:
        {
            System.out.println(" Enter Bill Id :");
            int Id =sc.nextInt();
            for(int i=0;i<billid;i++){
                if(Id==Bill[i].Id){
                    System.out.println("ID: "+Bill[i].Id+"                          "+Bill[i].date);
                    System.out.println("Customer ID:"+Bill[i].CustomerID+"          "+Bill[i].time);
                    System.out.println("Customer Name: "+Bill[i].Customername);
                    System.out.println("Purchase details:");
                    for(int l=0;l<Bill[i].Totalno;l++){
                        System.out.println(Bill[i].itm[l]+"         "+Bill[i].cost[l]);
                    }
                    System.out.println("Total product:"+Bill[i].Totalno+"                         "+Bill[i].Total);
                }
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
        break;
        }
    case 9:
        {
            System.out.println("Enter Customer ID:");
            int Id=sc.nextInt();
            int total=0;
            for(int i=0;i<billid;i++){
                if(Id==Bill[i].CustomerID){
                   total+=Bill[i].Total;
                }
            }
            System.out.println(" Total :  "+total);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------/n");
        break;
        }
}}}
}









//.....................................................OBJECT................................................................................................


class Customer
            {
                public int Id=0;
                public String Name=null;
                public String PhoneNo=null;
                public String ItemArray[]=new String[5];

                public Customer(int id, String name, String phoneNo) {
                    Id = id;
                    Name = name;
                    PhoneNo = phoneNo;
                }
            }
 class Item
             {
                public int Id=0;
                public String ItemName=null;
                public int Itemcost=0;
                Item(int id,String Name,int cost)
                {
                    this.Id=id;
                    this.ItemName=Name;
                    this.Itemcost=cost;
                }
            }
class Bill
            {
                public String date= new SimpleDateFormat("MMM dd, yyyy").format(new Date());
                public String time = new SimpleDateFormat("hh: mm").format(new Date());
                public int  Id=0;
                public int  CustomerID=0;
                public String Customername=null;
                public String itm[]=null;
                public int cost[]=null;
                public int Total=0;
                public int Totalno=0;
                Bill(int id,int customerID,String name,String array[],int cost[],int no,int total){
                    this.Id=id;
                    this.CustomerID=customerID;
                    this.Customername=name;
                    this.itm=array;
                    this.cost=cost;
                    this.Total=total;
                    this.Totalno=no;
                }
            }
