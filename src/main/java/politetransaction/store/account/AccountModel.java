package politetransaction.store.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "account")
@EqualsAndHashCode(of = "id")
@Builder @Getter @Setter @Accessors(fluent = true, chain = true)
@NoArgsConstructor @AllArgsConstructor
public class AccountModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "hash")
    private String hash;

    public AccountModel(Account in) {
        this.id = in.id();
        this.name = in.name();
        this.email = in.email();
        this.hash = in.hash();
    }

    public Account to() {
        return Account.builder()
            .id(id)
            .name(name)
            .email(email)
            .hash(hash)
            .build();
    }
}
