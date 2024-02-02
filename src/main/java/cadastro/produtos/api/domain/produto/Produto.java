package cadastro.produtos.api.domain.produto;

import cadastro.produtos.api.domain.categoria.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "Produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String preco;

    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
    }

    public void atualizarInformacoes(DadosAtualizacaoProduto dados) {

        if (dados.nome() != null)
            this.nome = dados.nome();

        if (dados.descricao() != null)
            this.descricao = dados.descricao();

        if (dados.preco() != null)
            this.preco = dados.preco();

    }
}
