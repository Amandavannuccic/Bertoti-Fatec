package org.example;

import java.time.LocalDateTime;

public class Credit implements Card{
    private String cardNumber;
    private String cardHolderName;
    private LocalDateTime expiryTime;
    private Double value;

    private Double TAXA = 5.25;
    public Credit() {
    }

    public Credit(String cardNumber, String cardHolderName, LocalDateTime expiryTime, Double value) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryTime = expiryTime;
        this.value = value;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(LocalDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public void executePayment(Double value) {
        Double valor_total = value+value*TAXA;
        if(valor_total > this.value){
            System.out.println("Saldo indisponível.");
        }else{
            this.value -= valor_total;
            System.out.println("Pagamento realizado");
        }
    }
}
