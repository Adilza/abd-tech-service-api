package br.com.fiap.abdtechservice.repository;

import br.com.fiap.abdtechservice.model.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssistanceRepository extends JpaRepository<Assistance, Long> {

}
