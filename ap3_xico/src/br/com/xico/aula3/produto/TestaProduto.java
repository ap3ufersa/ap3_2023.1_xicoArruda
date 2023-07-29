
package br.com.xico.aula3.produto;

import java.util.ArrayList;

public class TestaProduto {

    public static void main(String[] args) {
        ArrayList listaDeProdutos = new ArrayList();

        int i = 0;
        while (true) {

            listaDeProdutos.add(i, new Produto("Produto" + i, 4.0, 9));
            i++;
        }

       
    }
}
