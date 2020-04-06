package Practise;

public class BonApetit {
    public static void main(String[] args) {
        int[] arr = {3,10,2,9};
        int n=arr.length;
        int k=arr[1];
        int totalPrice=0;
        int totalPriceCharged;
        int priceAnnaPaid=12;
        int change;
        for(int i=0;i<n;i++){
            totalPrice=totalPrice+arr[i];
        }
        totalPriceCharged=totalPrice/2;
        if(priceAnnaPaid==(totalPrice-k)/2){
            System.out.println("Bon Appetit");
        }
        else{
            change = totalPriceCharged-((totalPrice-k)/2);
            System.out.println(""+change);
        }

    }
}
