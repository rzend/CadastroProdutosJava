package cadastro.produtos.api.domain.categoria;

import cadastro.produtos.api.domain.produto.Produto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "categorias")
@Entity(name = "Categorias")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Categoria(DadosCadastroCategoria dados) {
        this.nome = dados.nome();
    }

    public void atualizarInformacoes(DadosAtualizacaoCategoria dados) {
        this.nome = dados.nome();
    }
}
