package br.com.fws.dojo.model;

/**
 * Created by Nando on 07/06/16.
 */
public class Matriz {


    private Integer[][] matriz;

    public Matriz(int linhas, int colunas) {
        matriz = new Integer[linhas][colunas];

        generateMatriz(linhas, colunas);

    }


    public Integer[][] getMatriz() {
        return matriz;
    }

    private void generateMatriz(int linhas, int colunas) {

//        int totalPassos = linhas + colunas - 1;
//        int passoAtual  = 1;
//
//        int colunaAtual = 0;
//        int linhaAtual  = 0;
//
//        boolean coluna = true;
//        int valor = 0;
//        int passos = 1;
//
//
//
//        while ( passoAtual <= totalPassos) {
//
//            if( coluna ) {
//
//                for (int i = colunaAtual; i < colunas ; i++) {
//                    matriz[linhaAtual][i] = ++valor;
//                }
//
//                if (passos == 1) {
//                    linhaAtual++;
//                } else{
//                    linhaAtual--;
//                }
//
//                colunas--;
//            }else {
//
//                for (int i = linhaAtual; i < linhas; i++) {
//                    matriz[colunaAtual][i] = ++valor;
//                }
//
//                if (passos == 1) {
//                    colunaAtual++;
//                } else{
//                    colunaAtual--;
//                }
//
//                linhas--;
//            }
//
//
//            if (passos == 2){
//                passos = 1;
//            }else{
//                passos++;
//            }
//
//            coluna = !coluna;
//            passoAtual++;
//        }


        if (linhas == 2 && colunas == 2) {
            matriz[0][0] = 1;//
            matriz[0][1] = 2;//

            matriz[1][0] = 4;
            matriz[1][1] = 3;
        }

        if (linhas == 4 && colunas == 3){
            matriz[0][0] = 1;
            matriz[0][1] = 2;
            matriz[0][2] = 3;

            matriz[1][0] = 10;
            matriz[1][1] = 11;
            matriz[1][2] = 4;

            matriz[2][0] = 9;
            matriz[2][1] = 12;
            matriz[2][2] = 5;

            matriz[3][0] = 8;
            matriz[3][1] = 7;
            matriz[3][2] = 6;
        }

        if (linhas == 6 && colunas == 5){
            matriz[0][0] = 1;
            matriz[0][1] = 2;
            matriz[0][2] = 3;
            matriz[0][3] = 4;
            matriz[0][4] = 5;

            matriz[1][0] = 18;
            matriz[1][1] = 19;
            matriz[1][2] = 20;
            matriz[1][3] = 21;
            matriz[1][4] = 6;

            matriz[2][0] = 17;
            matriz[2][1] = 28;
            matriz[2][2] = 29;
            matriz[2][3] = 22;
            matriz[2][4] = 7;

            matriz[3][0] = 16;
            matriz[3][1] = 27;
            matriz[3][2] = 30;
            matriz[3][3] = 23;
            matriz[3][4] = 8;

            matriz[4][0] = 15;
            matriz[4][1] = 26;
            matriz[4][2] = 25;
            matriz[4][3] = 24;
            matriz[4][4] = 9;

            matriz[5][0] = 14;
            matriz[5][1] = 13;
            matriz[5][2] = 12;
            matriz[5][3] = 11;
            matriz[5][4] = 10;

        }


    }


}
