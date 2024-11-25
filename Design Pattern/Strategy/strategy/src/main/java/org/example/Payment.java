package org.example;

public class Payment {
    private Card card;

    public void setCard(Card card){
        this.card = card;
    }

    public void processPayment(Double valor){
        card.executePayment(valor);
    }
}
