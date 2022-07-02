package br.com.tech4me.tech4plataforma.service;

import java.util.List;

import br.com.tech4me.tech4plataforma.dto.PlataformaDto;

public interface PlataformaService {
    
    List<PlataformaDto> obterTodasAsPlataformas();
    PlataformaDto obterPorId(String id);
    PlataformaDto obterPorDescricao(String nome);
    PlataformaDto cadastrarPlataforma(PlataformaDto plataforma);
    void excluirPlataforma(String id);
    PlataformaDto alterarPlataforma(String id, PlataformaDto plataforma);

//      List<ProdutoDto> obterTodosOsProdutos();
//      ProdutoDto obterPorId(String id);
//      ProdutoDto obterPorCodigo(Integer codigo);
//      ProdutoDto cadastrarProduto(ProdutoDto produto);
//      void excluirProduto(String id);
//      ProdutoDto alterarProduto(String id, ProdutoDto produto);
//      ProdutoDto obterPorNome(String nome);
//      ProdutoDto incluirVenda(String id, ProdutoDto produto);
     
}
