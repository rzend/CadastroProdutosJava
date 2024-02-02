package cadastro.produtos.api.domain.produto;

import cadastro.produtos.api.domain.categoria.Categoria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(

        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        String preco) {
}
