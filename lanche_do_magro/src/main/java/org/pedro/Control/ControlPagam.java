package org.pedro.Control;

import org.pedro.Dto.ListaLancheDto;

import java.util.Scanner;

public class ControlPagam {
    public void pagamProdu(ListaLancheDto listaLancheDto){
        Scanner scanner = new Scanner(System.in);
        Double precoProd;

        listaLancheDto.listarProd();

        do {
            System.out.println("Digite o codigo do produto:");
            String codigo = scanner.nextLine();

            precoProd = listaLancheDto.buscaProd(codigo);

            if(precoProd == null){
                System.out.println("Codigo invalido, por favor tente de novo");
            }

        }while(precoProd == null);

        System.out.println("Digite a quantidade do produto");
        int quantProdut = scanner.nextInt();

        double valorTotal = quantProdut * precoProd;

        System.out.println("O total é igual a " + valorTotal + "R$");
    }
}
