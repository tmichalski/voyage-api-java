package voyage.security.client

import org.hibernate.envers.Audited
import voyage.common.AuditableEntity

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Entity
@Audited
class ClientRedirect extends AuditableEntity {
    @ManyToOne
    @JoinColumn(name='client_id')
    Client client

    @NotNull
    String redirectUri
}