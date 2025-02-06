package org.pedro.Dto;

import java.util.ArrayList;

public class ListaLancheDto {
    private ArrayList<LancheDto>listLanche;

    public ListaLancheDto() {
        this.listLanche = new ArrayList<>();
    }

    public void adicProduto(LancheDto lancheDto){
        listLanche.add(lancheDto);
    }

    public void listarProd(){
        for(LancheDto ld: listLanche){
            System.out.println("-------------------------------");
            System.out.println("Codigo:" + ld.getCodigProd());
            System.out.println("Nome do produto:" + ld.getNomeProd());
            System.out.println("Preço do produto:" + ld.getPrecoProd());
            System.out.println("-------------------------------");
        }
    }

    public Double buscaProd(String codigo) {
            for (LancheDto ld : listLanche) {
                if(ld.getCodigProd().equals(codigo)){
                    return ld.getPrecoProd();
                }
            }
            return null;
    }

}
