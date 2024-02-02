package cadastro.produtos.api.domain.produto;

import cadastro.produtos.api.domain.categoria.Categoria;

public record DadosListagemProduto(Long id, String nome, String descricao, String preco) {

    public DadosListagemProduto(Produto produto) {
        this(produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco());
    }
}
