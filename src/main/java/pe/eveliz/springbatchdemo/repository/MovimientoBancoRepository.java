package pe.eveliz.springbatchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.eveliz.springbatchdemo.model.MovimientoBanco;

public interface MovimientoBancoRepository extends JpaRepository<MovimientoBanco, Integer> {
}
