package org.pedro.Control;

import org.pedro.Dto.LancheDto;
import org.pedro.Dto.ListaLancheDto;

import java.util.Scanner;

public class ControlCadastro {
    public void cadastProduto(ListaLancheDto listaLancheDto ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um novo codigo");
        String codigo = scanner.nextLine();

        System.out.println("Digite o nome do produto");
        String produto = scanner.nextLine();

        System.out.println("Digite o valor do produto");
        double precoProd = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a url a imagem:");
        String urlImag = scanner.nextLine();

        LancheDto lancheDto = new LancheDto(codigo,produto,precoProd,urlImag);

        listaLancheDto.adicProduto(lancheDto);

        System.out.println("Produto cadastrado com sucesso!");
    }
}
