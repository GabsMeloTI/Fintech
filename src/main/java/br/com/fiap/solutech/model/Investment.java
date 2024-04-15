package br.com.fiap.solutech.model;

import br.com.fiap.solutech.dto.investment.InvestmentRegisterDto;
import br.com.fiap.solutech.dto.investment.InvestmentUpdateDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

@Entity
@Table(name = "tb_investment")
public class Investment {

    @Id
    @GeneratedValue
    @Column(name = "id_investment")
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String type;

    @Column( nullable = false)
    private Double value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agency", nullable = false)
    private Agency agency;

    @ManyToMany(mappedBy = "investment")
    private List<User> users;


    public Investment(InvestmentRegisterDto dto, Agency agency, List<User> users) {
        name = dto.name();
        type = dto.type();
        value = dto.value();
        this.agency = agency;
        this.users = users;
    }

    public void updateData(InvestmentUpdateDto dto) {
        if(dto.name() != null){
            name = dto.name();
        }
        if(dto.type() != null){
            type = dto.type();
        }
        if(dto.value() != null){
            value = dto.value();
        }
        if(dto.agency() != null){
            agency = dto.agency();
        }
        if(dto.user() != null){
            users = dto.user();
        }
    }
}
