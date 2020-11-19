package br.com.fundatec.receitafederal.repository;

import br.com.fundatec.receitafederal.domain.Cpf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CpfRepository extends JpaRepository<Cpf, Long> {

    @Query(value = "SELECT CASE WHEN (COUNT(*) > 0) THEN true ELSE false END FROM cpf WHERE cpf = :cpf", nativeQuery = true)
    public boolean existsPendencia(@Param("cpf") String cpf);

}
