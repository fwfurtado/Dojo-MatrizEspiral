/**
 * Created by Nando on 07/06/16.
 */

package br.com.fws.dojo.model;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrizTest {


    @Test
    public void  dadoDuasColunasEDuasLinhasDeveGerarUmaMatrizComecandoEmUmETerminandoEmQuatro(){

        Matriz matriz = new Matriz(2,2);

        Integer[][] source = matriz.getMatriz();

        assertEquals(2, source.length);
        assertEquals(2, source[0].length);

        assertEquals(Integer.valueOf(1), source[0][0]);
        assertEquals(Integer.valueOf(2), source[0][1]);
        assertEquals(Integer.valueOf(3), source[1][1]);
        assertEquals(Integer.valueOf(4), source[1][0]);

    }

    @Test
    public void  dadoTresColunasEQuatroLinhasDeveGerarUmaMatrizComecandoEmUmETerminandoEmDoze(){

        Matriz matriz = new Matriz(4, 3);

        Integer[][] source = matriz.getMatriz();
        Integer[][] target = {  {1, 2, 3},
                                {10, 11, 4},
                                {9, 12, 5},
                                {8, 7, 6 }};


        assertEquals(target.length, source.length);
        assertEquals(target[0].length, source[0].length);

        assertArrayEquals(target[0], source[0]);
        assertArrayEquals(target[1], source[1]);
        assertArrayEquals(target[2], source[2]);
        assertArrayEquals(target[3], source[3]);


    }


    @Test
    public void  dadoCincoColunasESeisLinhasDeveGerarUmaMatrizComecandoEmUmETerminandoEmTrinta(){

        Matriz matriz = new Matriz(6, 5);

        Integer[][] source = matriz.getMatriz();
        Integer[][] target = {  {1,   2,  3,  4, 5},
                                {18, 19, 20, 21, 6},
                                {17, 28, 29, 22, 7},
                                {16, 27, 30, 23, 8},
                                {15, 26, 25, 24, 9},
                                {14, 13, 12, 11, 10}};


        assertEquals(target.length, source.length);
        assertEquals(target[0].length, source[0].length);

        assertArrayEquals(target[0], source[0]);
        assertArrayEquals(target[1], source[1]);
        assertArrayEquals(target[2], source[2]);
        assertArrayEquals(target[3], source[3]);
        assertArrayEquals(target[4], source[4]);
        assertArrayEquals(target[5], source[5]);


    }


}
