package exercicios.orientacaoaobjetos.contabancaria;

import java.util.Calendar;

public class Data {
    //Atributos
    private int dia = 01;
    private int mes = 01;
    private int ano = 0001;
    private String mesext;
    private Calendar c = Calendar.getInstance();
    private int diaA = c.get(Calendar.DAY_OF_MONTH);
    private int mesA = c.get(Calendar.MONTH);
    private int anoA  = c.get(Calendar.YEAR);

    //Construtor
    public Data(int dia, int mes, int ano) {
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            if (dia>0 && dia<=31 && ano>=0) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else if (mes==4 || mes==6 || mes==9 || mes==11) {
            if (dia>0 && dia<=30 && ano>0) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else if (mes==2) {
            if (ano%4==0) {
                if (dia>0 && dia<=29 && ano>0) {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            } else {
                if (dia>0 && dia<=28 && ano>0) {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            }
        }
        setMesext();
    }


    //Getters e Setters
    private void setMesext() {
        switch (mes) {
            case 1: this.mesext = "Janeiro";
                break;
            case 2: this.mesext = "Fevereiro";
                break;
            case 3: this.mesext = "Março";
                break;
            case 4: this.mesext = "Abril";
                break;
            case 5: this.mesext = "Maio";
                break;
            case 6: this.mesext = "Junho";
                break;
            case 7: this.mesext = "Julho";
                break;
            case 8: this.mesext = "Agosto";
                break;
            case 9: this.mesext = "Setembro";
                break;
            case 10: this.mesext = "Outubro";
                break;
            case 11: this.mesext = "Novembro";
                break;
            case 12: this.mesext = "Dezembro";
        }
    }

    public String getDataExtensa() {
        return dia + "/" + mesext + "/" + ano;
    }

    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }

    public String getDataAtual() {
        return diaA + "/" + mesA + "/" + anoA;
    }



}

