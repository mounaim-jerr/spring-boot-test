package testcom.example.firsttest;

public class TestModel {
    private String clientName ;
    private String clientCIN;
    private int clientAge;
    private int nmbrVisites;
    private double visitePrice;

    public TestModel(String clientName, String clientCIN, int clientAge, int nmbrVisites , double visitePrice) {
        this.clientName = clientName;
        this.clientCIN = clientCIN;
        this.clientAge = clientAge;
        this.nmbrVisites = nmbrVisites;
        this.visitePrice = visitePrice;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientCIN() {
        return clientCIN;
    }

    public void setClientCIN(String clientCIN) {
        this.clientCIN = clientCIN;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public int getNmbrVisites() {
        return nmbrVisites;
    }

    public void setNmbrVisites(int nmbrVisites) {
        this.nmbrVisites = nmbrVisites;
    }

    public double getVisitePrice() {
        return visitePrice;
    }

    public void setVisitePrice(double visitePrice) {
        this.visitePrice = visitePrice;
    }
    public double getTotalPriceCoust (){
       return visitePrice * nmbrVisites;
    }
}
