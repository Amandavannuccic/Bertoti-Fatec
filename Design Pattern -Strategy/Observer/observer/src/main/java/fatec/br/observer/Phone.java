package fatec.br.observer;

public class Phone implements Observer{
    private Double temperature;

    @Override
    public void update(Double temperature) {
        this.temperature = temperature;
        System.out.println(String.format("Temperature has been updated on Phone to %s.", temperature));
    }
    
}
