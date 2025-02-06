package org.pedro;

import org.pedro.Control.ControlCadastro;
import org.pedro.Control.ControlPagam;
import org.pedro.Dto.ListaLancheDto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaLancheDto listaLancheDto = new ListaLancheDto();
        int escolMenTes;

        do {
            System.out.println("Menu teste");
            System.out.println("1.Cadastrar produto");
            System.out.println("2.Teste de comprar de produtos");
            System.out.println("0.Sair");
            escolMenTes = scanner.nextInt();

            scanner.nextLine();


            switch (escolMenTes) {
                case 1:
                    ControlCadastro controlCadastro = new ControlCadastro();
                    controlCadastro.cadastProduto(listaLancheDto);
                    break;
                case 2:
                    ControlPagam controlPagam = new ControlPagam();
                    controlPagam.pagamProdu(listaLancheDto);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }while(escolMenTes !=0 );
    }
}