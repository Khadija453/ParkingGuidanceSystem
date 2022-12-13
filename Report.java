
package report;

import java.util.ArrayList;

public class Report extends Ticket{
    int rNo;
    String rName;
    ArrayList <Ticket> ticList;

    public Report() {
    }

    public Report(int rNo, String rName) {
        this.rNo = rNo;
        this.rName = rName;
        ticList = new ArrayList <Ticket>();
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public ArrayList<Ticket> getTicList() {
        return ticList;
    }

    public void setTicList(ArrayList<Ticket> ticList) {
        this.ticList = ticList;
    }
    
    public void addTicket(Ticket t){
        ticList.add(t);
    }
    
    public void removeTicket(int idx){
        ticList.remove(idx);
    }

    public int getTicketCount(){
        return ticList.size();
    }
    
    public void showReport(){
        for(int i=0 ; i<ticList.size() ; i++){
            System.out.println("ID : "+ticList.get(i).getEntryId()+" "+"Name : "+ticList.get(i).getCustomerName()+" "+
                    "Number of hours : "+ticList.get(i).getNumberOfHours()+" "+"Plate number : "+ticList.get(i).getPlateNo()+" "+
                    "Bill : "+ticList.get(i).getBill()+" ");
            
        }
    }
    
    
    
    
}
