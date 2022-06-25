package testcom.example.firsttest;

// use annotation from lombok
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestModel {
    private String clientName ;
    private String clientCIN;
    private int clientAge;
    private int nmbrVisites;
    private double visitePrice;

   

    public void setVisitePrice(double visitePrice) {
        this.visitePrice = visitePrice;
    }
    public double getTotalPriceCoust (){
       return visitePrice * nmbrVisites;
    }
}
