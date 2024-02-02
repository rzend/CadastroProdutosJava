package cadastro.produtos.api.domain.categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoCategoria(
        @NotBlank
        Long id,
        String nome) {
}
