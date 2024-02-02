package cadastro.produtos.api.domain.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
        String nome,
        String descricao,
        String preco){
}
