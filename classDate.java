package Classe_Objetos.Date;

public class classDate{
    int day,month, year;

    public classDate(){

    }

    public classDate(int iDay, int iMonth, int iYear){
        iDay = day;
        iMonth = day;
        iYear = day;
    }

    public String showDate(){
        return String.format("%d/%d/%d", day, month, year);
    }
}