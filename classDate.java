package Classe_Objetos.Date;

public class classDate{
    int day,month, year;

    public String exibirData(){
        return String.format("%d/%d/%d", day, month, year);
    }
}