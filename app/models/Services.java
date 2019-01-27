package conuhacksiv;


public class Services {
    //attributes
    private String serviceName;
    private String serviceID;
    private boolean englishConfirmed=false;
    private boolean frenchConfirmed=false;
    private String serviceCategory;
    private float serviceScore;
    
    //constructor
    public Services(String sNameVal,String IDVal,boolean englishConfirmedVal,boolean frenchConfirmedVal,String sCategoryVal) {
        serviceName=sNameVal;
        serviceID=IDVal;
        englishConfirmed=englishConfirmedVal;
        frenchConfirmed=frenchConfirmedVal;
        serviceCategory=sCategoryVal;
        }
    
    //mutators
    public String getSName(){
        return serviceName;
    }
    public String getServiceID(){
        return serviceID;
    }
    public boolean getEngConfirmed(){
        return englishConfirmed;
    }
    public boolean getFrConfirmed(){
        return frenchConfirmed;
    }
    public String getServiceCategory(){
        return serviceCategory;
    }
    public float getServiceScore(){
        return serviceScore;
    }
    public void setSname(String sNameVal){
        serviceName=sNameVal;
    }
    public void setServiceID(String sID){
        serviceID=sID;
    }
    public void setEngConfirm(boolean engConfirm){
        englishConfirmed=engConfirm;
    }
    public void setFrConfirm(boolean frConfirm){
        frenchConfirmed=frConfirm;
    }
    public void setServiceScore(float srvScore){
        serviceScore=srvScore;
    }
}
